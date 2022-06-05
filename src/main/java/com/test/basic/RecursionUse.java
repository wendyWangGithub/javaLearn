package com.test.basic;

public class RecursionUse {

	/**
	 * 递归，A方法调用A方法自己
	 * F1=1,F2=1     Fn=F(n-1)+F(n-2)(n>2)
	 */
	public static void main(String[] args) {
		System.out.println(f(6));
		System.out.println(f2(8));
	}
	

	public static long f(int i) {
		long m = 0;
		if (i == 1 || i ==2) {
			return 1;
		} else {
			m = f(i -1) + f(i-2);
			return m;
		}
	}

	public static long f2(int i) {
		if (i < 1) {
			System.out.println("Invalid parameter!");
			return 0;
		}
		if (i == 1 || i ==2) {
			return 1;
		} else {
			long f1 = 1;
			long f2 = 1;
			long f =0;
			for (int j = 0; j < i-2; j++){
				f = f1 + f2;
				f1 = f2;
				f2 = f;
			}
			return f;
		}
	}
}	

