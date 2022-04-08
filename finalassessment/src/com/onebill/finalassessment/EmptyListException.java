package com.onebill.finalassessment;

public class EmptyListException extends RuntimeException {

	String msg;
	
	public EmptyListException(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() { 
		return msg;
	}
}
