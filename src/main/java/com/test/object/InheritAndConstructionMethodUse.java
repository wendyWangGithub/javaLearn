package com.test.object;
class SuperClass {
	
	private int n;
	
	SuperClass() {
		System.out.println("SupperClass()");
	}
	
	SuperClass(int n) {
		System.out.println("SuperClass(" + n + ")");
		this.n = n;
	}
}

class SubClass extends SuperClass {
	
	private int n;
	
	SubClass(int n) {
		System.out.println("SubClass(" + n + ")");
		this.n = n;
	}
	
	SubClass() {
		//super(300);
		System.out.println("SubClass()");
	}
}


public class InheritAndConstructionMethodUse {
	
	public static void main(String[] args) {
		
		SubClass sc1 = new SubClass();
		SubClass sc2 = new SubClass(400);
	}
}
