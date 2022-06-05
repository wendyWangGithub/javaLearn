package com.test.array;

import java.util.Arrays;
import java.util.*;

/**
 * 冒泡排序
 */
public class BubbleSortTest {
	
	public static void main (String[] args) {
		//数组从大到小排序
		int[] arr = {6,7,4};
		paiXu(arr);
	}
	
	public static void paiXu(int[] arr) {
		//外层控制的是轮数，n个元素，相当于要比较n-1轮
		int a =arr.length-1;
		for(int i=0; i<a; i++) {
			for(int j=0; j<a-1-i; j++) {
				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("arr数组地址为->" + arr);
		System.out.println("arr数组从大到小排序后的值为->" + Arrays.toString(arr));
	}
}
