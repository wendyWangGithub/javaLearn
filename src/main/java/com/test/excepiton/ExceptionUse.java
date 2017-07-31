package com.test.excepiton;

import java.io.*;

public class ExceptionUse {

	public static void main(String[] args) {
		
		try {
			new ExceptionUse().f2();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		
		int[] arr = {1, 2, 3};
		System.out.println(arr[2]);
		try {
			System.out.println(2/0);
		} catch (ArithmeticException ae) {
			System.out.println("ϵͳ����ά���У����Ժ����ԣ�");
			//ae.printStackTrace();
		}
		
		/*
		ExceptionUse eu = new ExceptionUse();
		eu.m(0);
		*/
		
		try {
			new ExceptionUse().m(0);
		} catch (ArithmeticException ae) {
			System.out.println("������");
			//ae.printStackTrace();
		}
		
		FileInputStream in = null;
		//in = new FileInputStream("myfile.txt");
		try {
			in = new FileInputStream("myfile.txt");
			int b;
			b = in.read();
			while (b != -1) {
				System.out.println((char)b);
				b = in.read();
			}
		/*} catch (IOException e) {
			System.out.println(e.getMessage());*/
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	void m(int i) throws ArithmeticException {
		if (i == 0) {
			throw new ArithmeticException("������Ϊ0");
		}
	}
	
	void f() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream("myfile.txt");
		int b;
		b = in.read();
		while (b != -1) {
			System.out.println((char)b);
			b = in.read();
		}
	}
	
	void f2() throws IOException {
		f();
	}
	
	/*
	void f2() {
		try {
			f();
		} catch (FileNotFoundException ffe) {
			System.out.println(ffe.getMessage());
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	*/
}	

