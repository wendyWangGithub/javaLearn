package com.test.httpclient;

import java.io.Serializable;

public class IdNoInfo implements Serializable {

	/** Serial Version UID */
	private static final long serialVersionUID = -7620851373510427530L;
	
	private String IdNo;
	private String sex;
	private String brithday;
	private String addr;
	
	
	public String getIdNo() {
		return IdNo;
	}
	
	public void setIdNo(String idNo) {
		IdNo = idNo;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getBrithday() {
		return brithday;
	}
	
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	
	public String getAddr() {
		return addr;
	}
 
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "[身份证号： " + IdNo + ", 性别：" + sex + ", 出生日期: " + brithday + ", 归属地：" + addr + "]";
	}
 	
}