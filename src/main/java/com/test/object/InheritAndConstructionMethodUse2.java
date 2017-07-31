package com.test.object;

class A {
	protected void print(String s) {
		System.out.println(s);
	}
	
	A() {print("A()");}
	
	public void f() {print("A:f()");}
	
}

public class InheritAndConstructionMethodUse2 extends A {
	
	InheritAndConstructionMethodUse2() {print("B()");}
	
	public void f() {print("B:f()");}
	
	public static void main(String[] args) {
		InheritAndConstructionMethodUse2 b = new InheritAndConstructionMethodUse2();
		b.f();
	}
}
