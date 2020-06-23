package com.test.array;

import java.util.Arrays;
import java.util.*;

public class BubbleSortTest {
	
	public static void main (String[] args) {
		//数组从大到小排序
		int[] arr = {6,7,4};
		paixu(arr);
	}
	
	public static void paixu(int[] arr) {
		//外层控制的是轮数，n个元素，相当于要比较n-1轮
				int a =arr.length-1;
				for(int i=0; i<arr.length-1; i++) {
					int b = arr.length-1-i;
					for(int j=0; j<arr.length-1-i; j++) {
						if (arr[j] < arr[j+1]) {
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
							//System.out.println("arr数组从大到小排序后的值为->" + Arrays.toString(arr));
						}
					}
				}
				System.out.println("arr数组从大到小排序后的值为->" + Arrays.toString(arr));
	}
	
}
