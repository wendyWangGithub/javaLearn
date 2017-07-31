package com.test.object;

import java.util.concurrent.atomic.AtomicInteger;

public class FinalUse {

	public static void main(String[] args) {
		
		T6 t = new T6();
		//System.out.println(t.j++);
		t.i.replace("a", "l");
		System.out.println(t.i.replace("a", "l"));
	}
}

class T6 {
	
	final int j = 8;
	final String i = new String("abc");
	public void m(final int j) {
		//j = 9;
	}
	
	public final void ff() {
	}
}

class TT6 extends T6 {
	
	/*
	public void ff() {
		
	}
	*/
}

final class TTT {
	
}

/*
class TTTT extends TTT {
	
}
*/