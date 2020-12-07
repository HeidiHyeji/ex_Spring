package com.koreait.ex0110_spring_di;

public class MyCalculator {
	//처리할 데이터 2개 
	//서비스 클래스에 호출하기 위한 객체를 생성!
	//그 객체를 이용해서 메서드를 호출할 때 필요한 
	//메서드 만들기
	private int firstNum;
	private int secondNum;
	private Calculator calculator;  //ctrl+space누르면 클래스이름의 변수명 생성
	
	
	//데이터 주입을 위한 setter들이다(생성자 방식은나중에)
	//alt+shift+s,r 
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	//향후 spring에서 setter을 보고 변수를 찾아가게 된다.<-데이터를 주입할 수 있다.
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	////////기능 구현//////////////////////////
	//MyCalc의 add()를 호출하면 
	public void add(){ 
		//Calc의 add를 호출
		calculator.add(firstNum,secondNum);
	}
	public void sub(){ 
		calculator.sub(firstNum,secondNum);
	}
	public void mul(){ 
		calculator.mul(firstNum,secondNum);
	}
	public void div(){ 
		calculator.div(firstNum,secondNum);
	}
	
}
