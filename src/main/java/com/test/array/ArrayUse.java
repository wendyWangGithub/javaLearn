package com.test.array;

public class ArrayUse {
	public static void main(String[] args) {
		
		int[] s;
		s = new int[5];
		System.out.print("int类型数组值为：");
		for (int i = 0; i < s.length; i++) {
			s[i] = 2 * i +1;
			System.out.print( s[i] + " ");
		}
		System.out.println("\n" + "int类型数地址为：" + s);
		
		for(int i = 0; i < args.length; i ++) {
			System.out.print(args[i] + " ");
		}
		
		if(args.length < 3) {
			System.out.println("Usage: ArrayUse \"n1\" \"op\" \"n2\"");
			System.exit(-1);
		}
		double d1 = Double.parseDouble(args[0]);
		double d2 = Double.parseDouble(args[2]);
		double d = 0;
		if (args[1].equals("+")) d = d1 + d2;
		else if (args[1].equals("-")) d = d1 - d2;
		else if (args[1].equals("x")) d = d1 * d2;
		else if (args[1].equals("/")) d = d1 / d2;
		else {
			System.out.println("Error eperator!");
			System.exit(-1);
		}
		System.out.println(d);
		int a[] = {2, 4, 6, 7, 3, 5, 1, 9, 8};
		 for(int i=0; i<a.length; i++){
			 if(a[i] > a[i+1]){
				 a[i] = a[i+1];
			 }
		 }
	}
}

