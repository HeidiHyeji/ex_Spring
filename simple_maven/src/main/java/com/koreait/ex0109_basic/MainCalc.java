package com.koreait.ex0109_basic;

public class MainCalc {
	private int firstNum;
	private int secondNum;
	
	public void setFirstNum(int firstNum){ //camel 표기법 :set,get+변수명(첫글자 대문자)->대문자부분이 낙타 등과 같다고 해서 camel.
		this.firstNum=firstNum;
	}
	public int getFirstNum(){
		return firstNum;
	}
	//alt+shift+s,r

	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public void add(){
		System.out.println("add()");
		int result= firstNum+secondNum;
		System.out.println(firstNum+"+"+secondNum+"="+result);
	}
	public void sub(){
		System.out.println("sub()");
		int result= firstNum-secondNum;
		System.out.println(firstNum+"-"+secondNum+"="+result);
	}
	public void mul(){
		System.out.println("mul()");
		int result= firstNum*secondNum;
		System.out.println(firstNum+"*"+secondNum+"="+result);
	}
	public void div(){
		System.out.println("div()");
		int result= firstNum/secondNum;
		System.out.println(firstNum+"/"+secondNum+"="+result);
	}
	public static void main(String[] args){
		//10,5 에대한 사칙연산 결과 실행하기
		MainCalc mc=new MainCalc();
		mc.setFirstNum(10);
		mc.setSecondNum(5);
		
		mc.add();
		mc.sub();
		mc.div();
		mc.mul();
		
	}
}
