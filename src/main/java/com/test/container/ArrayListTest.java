package com.test.container;
/**
 * 添加一个对象到集合中，集合里面存放的是对象的引用，而不是对象本身
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args){
	
		List<User> userList1 = new ArrayList<User>();
		List<User> userList2 = new ArrayList<User>();
		User user1 = new User();
		userList1.add(user1);
		System.out.println("print value for userlist1");
		for(User user:userList1){
			System.out.println(user.getName());
			System.out.println(user.getPassword());
		}
		
		userList2.add(user1);
		
		System.out.println("set value for userlist2");
		for(User user:userList2){
			user.setName("name");
			user.setPassword("password");
		}
		System.out.println("print value for userlist1");
		for(User user:userList1){
			System.out.println(user.getName());
			System.out.println(user.getPassword());
		}
		
	}
	
	public static class User{
		private String name;
		private String password;
		
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getPassword(){
			return password;
		}
		public void setPassword(String password){
			this.password = password;
		}
	}

}
