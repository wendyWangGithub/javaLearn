package com.test.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

    public static void main(String[] args) {
        //集合
        List  ali = new ArrayList<Integer>();
        ali.add(1);
        ali.add(4);
        ali.add(3);
        System.out.println("排序前：" + ali);
        Collections.sort(ali);
        Collections.reverse(ali);
        System.out.println("排序再倒序后：" + ali);


        //数组冒泡从小到大排序
        int[] a = {1,2,4,3};
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j] > a[j+1]){
                    //注意下标里的值为j
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序从小到大排序结果为：");
        for (int k=0; k<a.length; k++){
            System.out.print(a[k] + ",");
        }
        System.out.println();
        //数组冒泡从大到小排序
        for (int m=0;m<a.length;m++){
            for(int n=0;n<a.length-1-m;n++){
                if(a[n] < a[n+1]){
                    int temp = a[n+1];
                    a[n+1] = a[n];
                    a[n] = temp;

                }
            }
        }
        System.out.println("冒泡排序从大到小排序结果为：");
        for (int k=0; k<a.length; k++){
            System.out.print(a[k] + ",");
        }

    }
}

