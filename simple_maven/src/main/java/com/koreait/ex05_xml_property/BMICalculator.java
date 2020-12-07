package com.koreait.ex05_xml_property;

public class BMICalculator {
	//지수: 척도(변수로 만들고...xml로 주입한다)
	private double lowWeight;	//18.5
	private double normal;	//23
	private double overWeight;	//25
	private double obesity;	//30
	
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	public void bmiCalc(double height,double weight){
		double h=height * 0.01;
		double result=weight / Math.pow(h, 2);	//몸무게 / (키^2)
		//result에 지수가 저장되어있다.
		if(result>=obesity){
			System.out.println("비만입니다");
		}
		else if(result>=overWeight){
			System.out.println("과체중입니다");
		}
		else if(result==normal){
			System.out.println("정상 입니다.");
		}
		else if(result<lowWeight){
			System.out.println("저체중입니다.");
		}
	}
	


}
