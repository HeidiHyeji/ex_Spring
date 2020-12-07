package com.koreait.ex0110_di;

//DI: dependency injection (의존 주입)
//유지보수를 편하게 하기 위함.
//
public class MainClass {

	public static void main(String[] args){
		
		//의존하고 있다.
		MyCalculator mc=new MyCalculator();
		
		//주입하고 있다.
		mc.setCalculator(new Calculator());
		mc.setFirstNum(10);
		mc.setSecondNum(2);
		
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
	}
}
