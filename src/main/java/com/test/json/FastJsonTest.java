package com.test.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.test.generic.Dog;
import com.test.generic.DogHobby;
import java.util.List;
import java.util.ArrayList;
/*
fastjson学习：https://haokan.baidu.com/v?vid=9135938198626045516&pd=bjh&fr=bjhauthor&type=video
fastjson三个主要的类
1、JSONObject代表json对象
	JSONObject实现了Map接口，猜想JSONObject底层操作是由Map实现的。
	JSONObject对应json对象，通过各种形式的get()方法可以获取json对象中的数据，也可利用诸如size（），isEmpty（）等方法获取键值对的个数和判断是否为空。其本质是通过实现
	map接口并调用接口中的方法完成的。
2、JSONArray代表json对象数组
	内部是由List接口中的方法来完成操作的。
3、JSON 代表JSONObject和JSONArray的转化
	JSON类源码分析与使用
	仔细观察这些方法，主要是实现json对象，json对象数组，javabean对象，json字符串之间的相互转化。
 */
public class FastJsonTest {
	
	public static void main(String[] args) {
		System.out.println("****************1、Java对象 转 JSON字符串*************");
		ConstructionMethodTest doggy = new ConstructionMethodTest("yellow", "short");
		//把对象转化为JSONString类型https://www.iqiyi.com/w_19s0ct5kmh.html，jsonStr是字符串，但实际上是数组格式的字符串
		String jsonStr = JSON.toJSONString(doggy, true);
		System.out.println(doggy.getColor());
		System.out.println("dog1对象转化为JSONString后的值为："  + jsonStr);

		System.out.println("****************2、JSON字符串 转 Java对象*************");
		Qgl doggy2 = new Qgl("yellow", "short", 100);
		//把对象转化为JSONString类型https://www.iqiyi.com/w_19s0ct5kmh.html
		String jsonStr2 = JSON.toJSONString(doggy2, true);
		System.out.println(Qgl.class);
		//把JSONString转化为类对象
		Qgl jgl = JSON.parseObject(jsonStr2, Qgl.class);
		System.out.println(jgl.getA());

		System.out.println("-----------------------3、Dog对象中含有List-----------------");
		List<Dog> dogList = new ArrayList<Dog>();
		List<DogHobby> listDogHobby = new ArrayList<DogHobby>();
		listDogHobby.add(new DogHobby("sleeping", "I love sleeping"));
		listDogHobby.add(new DogHobby("sing", "I love sing"));

		dogList.add(new Dog(100,"yellow", listDogHobby));
		//将对象序列化成json
		//System.out.println(JSON.toJSONString(dogList, true));

		String jsonDogList = JSON.toJSONString(dogList);
		JSONArray jsonArray = JSON.parseArray(jsonDogList);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject json = jsonArray.getJSONObject(i);
			System.out.println("狗身高：" + json.getString( "height"));
			JSONArray jsonHobbyList = json.getJSONArray("hobbyList");
			for (int j = 0; j < jsonHobbyList.size(); j++) {
				JSONObject jsonHobby  = jsonHobbyList.getJSONObject(j);
				System.out.println("狗习惯：" + jsonHobby.getString("name"));
				System.out.println("狗习惯描述：" + jsonHobby.getString("hobbyDescription"));
			}
		}

		System.out.println("-----------------------4、直接解析json对象-----------------");
		System.out.println("直接解析json对象");
		JSONObject jsonObject = JSON.parseObject("{\"height\":220,\"tailColor\":\"white\"}");
		System.out.printf("height:%d, tailColor:%s%n", jsonObject.getBigInteger("height"), jsonObject.getString("tailColor"));

		JSONArray jsonArray2 = JSON.parseArray("[{\"height\":130, \"tailColor\":\"black\"},{\"height\":140, \"tailColor\":\"purple\"}]");
		int len=jsonArray2.size();
		for(int i=0; i<len; i++) {
			JSONObject temp = jsonArray2.getJSONObject(i);
			System.out.println("直接解析json数组");
			System.out.printf("height:%d, tailColor:%s%n", temp.getBigInteger("height"), temp.getString("tailColor"));
		}
		System.out.println("jsonArray如下：");
		for(Object obj:jsonArray2){
			System.out.println(obj.toString());
		}
	}

}
