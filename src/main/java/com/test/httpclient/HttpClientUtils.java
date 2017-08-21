package com.test.httpclient;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.htmlparser.Node;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class HttpClientUtils {
	
	public static String get(String url) throws Exception {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build();
		httpGet.setConfig(requestConfig);
		
		CloseableHttpResponse result = httpClient.execute(httpGet);
		return EntityUtils.toString(result.getEntity(), "utf-8");
	}
	
	public static String post(String url) throws Exception {
		return post(url, null);
	}
	
	public static String post(String url, String strParam) throws Exception {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build();
		httpPost.setConfig(requestConfig);
		if (null != strParam) {
			StringEntity entity = new StringEntity(strParam,"utf-8");
			entity.setContentEncoding("UTF-8");
			entity.setContentType("application/x-www-form-urlencoded");
			httpPost.setEntity(entity);
		}
		CloseableHttpResponse result = httpClient.execute(httpPost);
		return EntityUtils.toString(result.getEntity(), "utf-8");
	}
	
	public static void queryIPAddrInfo(String ip) throws Exception {
		if (ip == null || ip.trim().length() == 0) {
			throw new IllegalArgumentException("参数错误!");
		}
		String url = "https://sp0.baidu.com/8aQDcjqpAAV3otqbppnN2DJv/api.php?co=&resource_id=6006&t=1501510188699&ie=utf8&oe=gbk&format=json&query=";
		String result = get(url + ip);
		JSONObject jsonObject = JSON.parseObject(result);
		if (jsonObject.getJSONArray("data").size() == 0) {
			System.out.println("ip地址未查询到信息 !");
			return;
		}
		if (jsonObject.getJSONArray("data").size() > 1) {
			System.out.println("ip地址存在多个查询结果，默认取第一个 !");
		}
		jsonObject = jsonObject.getJSONArray("data").getJSONObject(0);
		System.out.println(jsonObject.getString("origip") + "  " + jsonObject.getString("location"));
	}
	
	public static void queryIdNoInfo(String idNo) throws Exception {
		String url = "https://sp0.baidu.com/5aU_bSa9KgQFm2e88IuM_a/sfzcxgg.duapp.com/index.php";
		String html = post(url, "in_id="+ idNo + "&submit=查 询");
		Parser parser = Parser.createParser(html, "UTF-8");
		IdNoInfo idNoInfo = handleQueryIdInfoResult(parser);
		System.out.println(idNoInfo);
	}

	private static IdNoInfo handleQueryIdInfoResult(Parser parser) throws ParserException {
		TagNameFilter tagNameFilter = new TagNameFilter("div");
		NodeList nodeList = parser.extractAllNodesThatMatch(tagNameFilter);
		
		Node node = null;
		IdNoInfo idNoInfo = new IdNoInfo();
		for (int i = 0; i <= nodeList.size(); i++) {
			node = nodeList.elementAt(i);
			if (node == null || node.getText() == null) {
				continue;
			}
			if (node.toPlainTextString().contains("18位身份证号")) {
				idNoInfo.setIdNo(nodeList.elementAt(i + 1).toPlainTextString());
			}
			if (node.toPlainTextString().contains("发证地")) {
				idNoInfo.setAddr(nodeList.elementAt(i + 1).toPlainTextString());
			}
			if (node.toPlainTextString().contains("出生日期")) {
				idNoInfo.setBrithday(nodeList.elementAt(i + 1).toPlainTextString());
			}
			if (node.toPlainTextString().contains("性别")) {
				idNoInfo.setSex(nodeList.elementAt(i + 1).toPlainTextString());
			}
		}
		return idNoInfo;
	}

	public static void main(String[] args) throws Exception {
		queryIdNoInfo("360281198801215116");
	}
}