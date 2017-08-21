package com.test.hessian;

import com.caucho.hessian.client.HessianProxyFactory;
import java.net.MalformedURLException;

public class HessianClientTest {
	
	interface add {
		 int add(int a, int b);
	}
	
	public static void main(String[] args) {
		/*
		String url = "http://127.0.0.1/testhessian/hessian/math";
		HessianProxyFactory factory = new HessianProxyFactory();
		MathService math = null;
		try {
			math = (MathService)factory.create(MathService.class, url);
		} catch (MalformedURLException e) {
			System.out.println("occer exception: " + e);
		}
		System.out.println("3 + 2 = " + math.add(3, 2));
		*/
	}
	

}
