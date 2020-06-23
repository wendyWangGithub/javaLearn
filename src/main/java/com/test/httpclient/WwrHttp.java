package com.test.httpclient;

public class WwrHttp {

    public static void main(String [] args) {
        /**
         * 调用httpget请求
         */
        WwrHttpRequestTest hrt = new WwrHttpRequestTest();
        hrt.doGet("http://www.baidu.com");
    }
}
