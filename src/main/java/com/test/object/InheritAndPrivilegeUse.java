package com.test.object;

class  TT {
	
}

class T {
	private int i = 0;
			int j = 1;
	protected int k = 2;
	public int m = 3;
}

public class InheritAndPrivilegeUse extends T {
	
	int n = 4;
	public static void main(String[] args) {
	/**
		T t = new T();
		//System.out.println("I-˽�б�����ֵΪ��" + t.i);
		System.out.println("J-Ĭ�ϱ�����ֵΪ��" + t.j);
		System.out.println("k-����������ֵΪ��" + t.k);
		System.out.println("m-���б�����ֵΪ��" + t.m);
	*/
		InheritAndPrivilegeUse iap = new InheritAndPrivilegeUse();
		System.out.println("n-���б�����ֵΪ��" + iap.n);
	}
}
