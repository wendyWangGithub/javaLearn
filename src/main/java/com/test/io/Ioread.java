package com.test.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ioread {
	
	public static void main (String args[]){
		
		try {
			FileInputStream fis = new FileInputStream("F:/wrwang/JavaTest/test/src/test/resources/1.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader bf = new BufferedReader(isr);
			String valueString = null;
			while ((valueString = bf.readLine()) != null) {
				System.out.println(valueString);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("找不到文件！");
		} catch (IOException e) {
			System.out.println("文件读取错误!");
		}
	}

}
