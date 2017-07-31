package com.test.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest {
	
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.baidu.com");
		HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
		httpURLConnection.connect();
		InputStream input = httpURLConnection.getInputStream();
		
		InputStreamReader inputStreamReader = new InputStreamReader(input);
		BufferedReader reader = new BufferedReader(inputStreamReader);
        
		StringBuffer resultBuffer = new StringBuffer();
		String tempLine = null;
        while ((tempLine = reader.readLine()) != null) {
            resultBuffer.append(tempLine);
        }
		
		System.out.println(resultBuffer);
	}
	
}