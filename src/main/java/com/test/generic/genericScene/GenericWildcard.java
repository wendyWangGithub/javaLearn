package com.test.generic.genericScene;

import java.util.*;
import com.test.generic.Person;
import com.test.generic.Student;


/*
 * 泛型通配符
 * 种类：？（任意通配符)、？extendsE(向下限定)、？supperE(向上限定)三种
 * （重点)泛型通配符不是用在定义对象上，是用在方法的形参上
 * 为什么要有泛型通配符，因为集合没有协变
 * 但是数组可以协变
 */

public class GenericWildcard {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		ArrayList<?> a2 = new ArrayList();
		//a2.add(1);//错误，（重点)泛型通配符不是用在定义对象上，是用在方法的形参上
		//a2.add(new Student());//错误，（重点)泛型通配符不是用在定义对象上，是用在方法的形参上
		//向下限定
		ArrayList<? extends Person> a3 = new ArrayList();
		//向上限定
		ArrayList<? super Student> a4 = new ArrayList();
		
		ArrayList<Student> als = new ArrayList();
		als.add(new Student());
		method(als);
		
		ArrayList<Person> alp = new ArrayList();
		alp.add(new Student());//多态，父类引用指向子类对象
		method(alp);
		
		//数组协变
		Person[] ps = new Person[2];
		ps[0] = new Person();
		ps[1] = new Person();
		method2(ps);
		
		Student[] sd = new Student[2];
		sd[0] = new Student();
		sd[1] = new Student();
		method2(sd);//没有报错，因为数组的协变
		
		//集合的不可协变
		ArrayList<Person> listps = new ArrayList();
		listps.add(new Person());
		ArrayList<Student> listst = new ArrayList();
		method3(listps);
		//method3(listst);//报错，因为集合不可协变
	}
	
	public static void method(ArrayList<?> al) {
		for(Object obj:al) {
			System.out.println("通配符打印结果为:" + obj);
		}
		
	}
	
	/*
	 * 数组的协变
	 */
	public static void method2(Person[] ps) {
		for(Person p:ps) {
			System.out.println("数组可协变:" + p);
		}
		
	}
	
	
	/*
	 * 集合的不可协变
	 */
	public static void method3(ArrayList<Person> ps) {
		for(Object obj:ps) {
			System.out.println("集合不可协变:" + obj);
		}
		
	}

}
