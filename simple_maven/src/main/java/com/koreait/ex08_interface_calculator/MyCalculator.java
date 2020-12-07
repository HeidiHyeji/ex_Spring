package com.koreait.ex08_interface_calculator;

public class MyCalculator {
	private int firstNum;
	private int secondNum;
	private Calc calculator; //여기다 서비스 클래스들을 주입한다
										//다형성을 성립하기 위해 인터페이스를 사용한다
	
	public void setCalculator(Calc calculator){ //xml에서 주의할것! 만약에 camel 표기법을 따르지 않아
																				//변수명과 setter명이 일치하지 않으면 xml에서 setter명을 따라야한다!
		this.calculator=calculator;
	}
	public void setFirstNum(int firstNum){
		this.firstNum=firstNum;
	}
	public void setSecondNum(int secondNum){
		this.secondNum=secondNum;
	}
	
	//서비스 클래스에서 인터페이스 Calc로부터 재정의 된
	//add~div() 4개 메서드가 반드시 존재한다.
	//그 재정의 메서드를 수행하기 위한 메서드를 만들자!!!
	
	public void addition(){
		calculator.add(firstNum, secondNum);
	}
	public void substraction(){
		calculator.sub(firstNum, secondNum);
	}
	public void multiplication(){
		calculator.mul(firstNum, secondNum);
	}
	public void divition(){
		calculator.div(firstNum, secondNum);
	}
	
	
}
