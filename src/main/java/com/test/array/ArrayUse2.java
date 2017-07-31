package com.test.array;


public class ArrayUse2 {
	public static void main(String[] args) {
		
		Date[] days;
		days = new Date[3];
		for (int i = 0; i < 3; i++) {
			days[i] = new Date(2004, 4, i + 1);
			System.out.println("days��Ԫ��ֵΪ" + days[i] + ",");
		}
		//��̬��ʼ�������鶨��������Ԫ�ط���ռ�͸�ֵ�Ĳ����ֿ�����
		 int a[];
		 a = new int[3];
		 a[0] = 1; a[1] = 2; a[2] = 3;
		 
		 Date da[];
		 da = new Date[2];
		 da[0] = new Date(1, 20, 2004);
		 da[1] = new Date(2, 20, 2004);
		 
		 //��̬��ʼ�����ڶ��������ͬʱ��Ϊ����Ԫ�ط���ռ䲢��ֵ
		 int b[] = {1, 2, 3};
		 Date dat[] = {
			 new Date(1, 2, 3),
			 new Date(2, 2, 3),
			 new Date(3, 2, 3)
		 };
		 System.out.println(dat.length);
	}
}

class Date {
	
	int year;
	int month;
	int day;
	
	Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
}
