package com.test.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.test.generic.Dog;
import java.util.List;
import java.util.ArrayList;

public class FastJsonTest {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog(100, "blue,red");
		List<Dog> list = new ArrayList<Dog>();
		list.add(dog1);
		list.add(new Dog(110, "gray,orange"));
		//将对象序列化成json
		System.out.println(JSON.toJSON(dog1));
		//将集合序列化成json
		System.out.println(JSON.toJSON(list));
		//将json串反序列化成对象
		Dog dog2 = JSON.parseObject("{\"height\":220,\"tailColor\":\"white\"}", Dog.class);
		System.out.println(Dog.class);
		//printf格式化输出
		System.out.printf("height:%d, tailColor:%s%n", dog2.getHeight(), dog2.geTailColor());
		System.out.println(dog2.getHeight() + "11111111111111111111111111111111111");
		//将json数组反序列化成集合
		String str = "[{\"height\":130, \"tailColor\":\"black\"},{\"height\":140, \"tailColor\":\"purple\"}]";
		List<Dog> list2 = JSON.parseArray(str, Dog.class);
		for(Dog item:list2) {
			System.out.print(item.getHeight() + ",");
			System.out.println(item.geTailColor());
		}
		//直接解析json对象
		JSONObject jsonObject = JSON.parseObject("{\"height\":220,\"tailColor\":\"white\"}");
		System.out.printf("height:%d, tailColor:%s%n", jsonObject.getBigInteger("height"), jsonObject.getString("tailColor"));
		//直接解析json数组
		JSONArray jsonArray = JSON.parseArray("[{\"height\":130, \"tailColor\":\"black\"},{\"height\":140, \"tailColor\":\"purple\"}]");
		int len=jsonArray.size();
		for(int i=0; i<len; i++) {
			JSONObject temp = jsonArray.getJSONObject(i);
			System.out.printf("height:%d, tailColor:%s%n", temp.getBigInteger("height"), temp.getString("tailColor"));
		}
		for(Object obj:jsonArray){
			System.out.println(obj.toString());
		}
	}

}
