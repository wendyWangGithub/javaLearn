package com.test.object;

class Person {
	
	private String name;
	private int age;
	
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	public String getName() {return name;}
	public int getAge() {return age;}
	
	public String getInfo() {
		return "Name:" + name + "\n" + "age:" + age;
	}
}

class Student extends Person {
		
	private String school;
	public String getSchool() {return school;}
	public void setSchool(String school) {this.school = school;}

	public String GetInfo() {
		return "Name:" + getName() + "\nage:" + getAge() + "\nschool:" + school;
	}
}

public class OverWriteUse {
	public static void main(String[] args) {
		Student st = new Student();
		Person pn = new Person();
		pn.setName("none");
		pn.setAge(1000);
		st.setName("John");
		st.setAge(18);
		st.setSchool("SCH");
		System.out.println(pn.getInfo());
		System.out.println(st.GetInfo());
	}
}

