package com.koreait.ex08_interface_calculator;

public class Calculator implements Calc {

	public void add(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		System.out.println("일반계산기: ");
		System.out.println("덧셈)"+firstNum+"+"+secondNum+"="+(firstNum+secondNum));
	}

	public void sub(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		System.out.println("일반계산기: ");
		System.out.println("뺄셈)"+firstNum+"-"+secondNum+"="+(firstNum-secondNum));
	}

	public void mul(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		System.out.println("일반계산기: ");
		System.out.println("곱셈)"+firstNum+"*"+secondNum+"="+(firstNum*secondNum));
	}

	public void div(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		System.out.println("일반계산기: ");
		System.out.println("나눗셈)"+firstNum+"/"+secondNum+"="+(firstNum/secondNum));
	}

}
