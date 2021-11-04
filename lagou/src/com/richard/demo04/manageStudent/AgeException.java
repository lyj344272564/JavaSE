package com.richard.demo04.manageStudent;

/**
 * 编程实现年龄异常类的定义
 */
public class AgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException(){
		super();
	}
	
	public AgeException(String message){
		super(message);
	}
}
