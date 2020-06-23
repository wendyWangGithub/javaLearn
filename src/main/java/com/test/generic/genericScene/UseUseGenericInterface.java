package com.test.generic.genericScene;

public class UseUseGenericInterface {
	
	public static void main(String[] args) {
		
		UseGenericInterface<String,String> ugi = new UseGenericInterface();//有泛型的类
		UseGenericInterface2 ugi2 = new UseGenericInterface2();//没有泛型的类
		//UseGenericInterface2<String,String> ugi2 = new UseGenericInterface2();//会报错
	}

}
