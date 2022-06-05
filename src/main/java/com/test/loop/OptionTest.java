package com.test.loop;

public class OptionTest {
	
	public static void main(String[] args) {
		int j=20;
		if(j>30) {
			System.out.println("i的值大于30");
		}
		else if(j>20) {
			System.out.println("i的值大于20且小于等于30");
		}
		else if(j>10) {
			System.out.println("i的值大于10且小于等于20");
		}
		else {
			System.out.println("i的值小于等于10");
		}

		for(int i=3; i>0; i--) {
			System.out.print("小于等于开始的数" + i);
			if (i<=3) {
				System.out.print("小于等于3的数" + i);
			}
			if (i<=2) {
				System.out.println("小于等于2的数" + i);
			}
			if (i<=1) {
				System.out.println("小于等于1的数" + i);
			}
		}
	}


}
