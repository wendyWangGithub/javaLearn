package com.test.generic.genericScene;

import com.test.generic.Person;
import com.test.generic.Student;
import java.util.*;

public class GenericWildcardExtendsSuper {
	
	public static void main(String[] args) {
		
		//向下限定extends
		ArrayList<Person> listps = new ArrayList();
		ArrayList<Student> listst = new ArrayList();
		listst.add(new Student());
		//method1(listps);//错误，因为向上限定为Student，传入Person会报错
		method1(listst);//向下限定包括本身，所以可以传入Student
		
		//向上限定super
		ArrayList<Person> listps2 = new ArrayList();
		ArrayList<Student> listst2 = new ArrayList();
		ArrayList<Object> listoj2 = new ArrayList();
		listps2.add(new Student());
		listoj2.add(new Student());
		method2(listps2);//向上限定包括本身，所以可以传入Person
		method2(listoj2);
		//method2(listst2);//错误，因为向上限定，传入Student会报错
	}
	
	public static void method1 (ArrayList<? extends Student> listst) {
		
		for (Object p:listst) {
			System.out.println("向下限定结果为:" + p);
		}
	}
	
	public static void method2 (ArrayList<? super Person> listps) {
		
		for (Object p:listps) {
			System.out.println("向上限定结果为:" + p);
		}
	}

}
