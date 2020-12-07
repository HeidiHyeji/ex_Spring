package com.koreait.ex0110_serviceClass;

//DI: dependency injection (의존 주입)
//유지보수를 편하게 하기 위함.
//
public class MainClass {
	MainClass(){
	}
	public static void main(String[] args){
		Calculator c=new Calculator();
		//Main은 Calculator클래스에 의존(dependency)관계가 성립된다 
		
		//여기에 데이터를 주입(injection) 시키고있다.
		c.setFirstNum(10);
		c.setSecondNum(2);
		
		c.add();
		c.div();
		c.sub();
		c.mul();
		
	}
}
