package com.test.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ioread {
	
	public static void main (String args[]){
		
		try {
			FileInputStream fileInputStream = new FileInputStream("src/main/resources/myfile.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String valueString = null;
			while ((valueString = bufferedReader.readLine()) != null) {
				System.out.println(valueString);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("找不到文件！");
		} catch (IOException e) {
			System.out.println("文件读取错误!");
		}
	}

}
