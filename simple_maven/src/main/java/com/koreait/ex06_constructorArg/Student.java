package com.koreait.ex06_constructorArg;

//학생들의 정보를 입력하는 데이터 모델이다.
public class Student {
	private String name;
	private String age;
	private String gradeNum;
	private String classNum;

	public Student() { //ctrl+space에서 찾을수 있음
	}
	
	//차례대로 name <constructor -arg> ag<constructor-arg>....
	//파라미터의 순서를 그대로 따라간다
	public Student(String name, String age, String gradeNum, String classNum) {//alt+shift+s, o
		super();
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	

}
