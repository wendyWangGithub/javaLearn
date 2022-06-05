package com.test.excepiton;

import java.io.*;

public class ExceptionUse {

	public static void main(String[] args) {
		
		try {
			System.out.println(2/0);
		} catch (ArithmeticException ae) {
			System.out.println("异常信息：" + ae);
			//ae.printStackTrace();
			System.out.println("异常被捕获下面的代码正常执行");
		}
		
		/*
		ExceptionUse eu = new ExceptionUse();
		eu.m(0);
		*/
		try {
			new ExceptionUse().m(0);
		} catch (ArithmeticException ae) {
			System.out.println("自定义异常信息：" + ae);
			ae.printStackTrace();
		}
		
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("src/main/resources/myfile.txt");
			int readResult;
			readResult = fileInputStream.read();
			while (readResult != -1) {
				System.out.println((char)readResult);
				readResult = fileInputStream.read();
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	void m(int i) throws ArithmeticException {
		if (i == 0) {
			throw new ArithmeticException("0不能作为该方法的参数");
		}
	}
}

