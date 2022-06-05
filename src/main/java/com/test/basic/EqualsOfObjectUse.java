package com.test.basic;

/**
 *	==要地址相等
 *	equels要值相等
 */
public class EqualsOfObjectUse {
	public static void main(String[] args) {
		Dogs d1 = new Dogs(1, 2, 3);
		Dogs d2 = new Dogs(1, 2, 3);
		System.out.println("类对象的地址是否相等:" + (d1 == d2));
		System.out.println("类对象的值是否相等:"  + d1.equals(d2));
		System.out.println("1和1的值相等:" + (1 == 1));
	}
}

class Dogs {
	int color;
	int height, weight;
	//构造方法
	public Dogs(int color, int height, int weight) {
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else{
			if(obj instanceof Dogs) {
				Dogs d = (Dogs)obj;
				if(d.color == this.color && d.height == this.height && d.weight == this.weight) {
					return true;
				}
			}
		}
		return false;
	}
}
