package com.test.excepiton;

class MyException extends Exception {
	
	private int id;
	//String message;
	
	public MyException(String message, int id) {
		super(message);
		//this.message = message;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	/*
	public String getMessage() {
		return message;
	}
	*/
}	

public class ExceptionUse2 {
	
	public void regist(int num) throws MyException {
		if (num < 0) {
			throw new MyException("����Ϊ��ֵ��������", 3);
		}
		System.out.println("�Ǽ�����" + num);
	}
	
	public void manager() {
		try {
			regist(-1);
		} catch (MyException me) {
			System.out.println("�Ǽ�ʧ�ܣ�����������=" + me.getId() + "\n������ϢΪ:" + me.getMessage());
			System.out.println(me.getStackTrace());
			//me.printStackTrace();
			System.out.println(me); 
		}
		System.out.println("��������");
	}
	
	public static void main(String[] args) {
		ExceptionUse2 t = new ExceptionUse2();
		t.manager();
	}
}

