package com.koreait.ex13_bean_life_cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class OtherStudent {
	private String juso;
	private double height;
	private double weight;
	
	public OtherStudent() {
		// TODO Auto-generated constructor stub
	}

	public OtherStudent(String juso, double height, double weight) {
		super();
		this.juso = juso;
		this.height = height;
		this.weight = weight;
	}

	public String getJuso() {
		return juso;
	}

	public void setJuso(String juso) {
		this.juso = juso;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	//어노테이션을 달아야한다.
	
	//생성시 호출될 메서드
	@PostConstruct //생성 후 ..post
	public void initMethod(){
		//db 연동 후 데이터 검색 등
		System.out.println("----------------------------------");
		System.out.println("#4. 임의의 메서드-실행-생성후");
		System.out.println(getJuso());
		System.out.println(getHeight());
		System.out.println(getWeight());
		System.out.println("----------------------------------");
	}
	//파괴시 호출될 메서드
	@PreDestroy	// pre-: ~~하기전
	public void destroyMethod(){
		//메모리 소거(close)등을 수행
		System.out.println("#4. 임의의 메서드-소멸시키기 전 ");
	}
}
