package com.koreait.ex0110_spring_di;
/**
 * @author gogo6
 * 서비스 클래스 -로직(직접 처리)을 담당하고 있다.
 * 이 클래스를 사용하기 위해서 MyCalculator에서는
 * Calculator객체와 데이터 처리 메서드를 만들어야한다.
 *
 */
public class Calculator {

	public void add(int fir,int sec){
		System.out.println("일반용 - add()");
		int result= fir+sec;
		System.out.println(fir+"+"+sec+"="+result);
	}
	public void sub(int fir,int sec){
		System.out.println("일반용 -sub()");
		int result= fir-sec;
		System.out.println(fir+"-"+sec+"="+result);
	}
	public void mul(int fir,int sec){
		System.out.println("일반용 -mul()");
		int result= fir*sec;
		System.out.println(fir+"*"+sec+"="+result);
	}
	public void div(int fir,int sec){
		System.out.println("일반용 -div()");
		int result= fir/sec;
		System.out.println(fir+"/"+sec+"="+result);
	}
}
