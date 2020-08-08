package com.test.date;

public class CurrentTimeMillisTest {

    public static void main(String[] args) {
        long curentTimeMilliseTest = System.currentTimeMillis();
        //long类型转化为Sting类型
        String timeString = String.valueOf(curentTimeMilliseTest);
        System.out.println(timeString);
    }
}
