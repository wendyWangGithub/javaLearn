package com.test.httpclient;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class HttpClientGetUtils {
	
	public static void main(String[] args) throws Exception {
		queryIPAddrInfo("116.224.229.50");
	}
	
	public static String get(String url) throws Exception {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build();
		httpGet.setConfig(requestConfig);
		
		CloseableHttpResponse result = httpClient.execute(httpGet);
		return EntityUtils.toString(result.getEntity(), "utf-8");
	}

	public static void queryIPAddrInfo(String ip) throws Exception {
		if (ip == null || ip.trim().length() == 0) {
			throw new IllegalArgumentException("参数错误!");
		}
		String url = "https://sp0.baidu.com/8aQDcjqpAAV3otqbppnN2DJv/api.php?co=&resource_id=6006&t=1501510188699&ie=utf8&oe=gbk&format=json&query=" + ip;
		String result = get(url);
		//System.out.println("result的结果为：" + result);
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
}