package com.test.loop;

public class OptionTest {
	
	public static void main(String[] args) {
		int i=20;
		if(i>30) {
			System.out.println("i的值大于30");
		}
		else if(i>20) {
			System.out.println("i的值大于20且小于等于30");
		}
		else if(i>10) {
			System.out.println("i的值大于10且小于等于20");
		}
		else {
			System.out.println("i的值小于等于10");
		}
	}

}
