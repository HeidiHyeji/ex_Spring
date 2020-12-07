package com.koreait.ex06_constructorArg;

public class StudentInfo {
	private Student student; //여기에 주입하면 학생정보를 얻어낼수 있다.
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	
	//기본데이터가 아니라 construct-arg에 ref의 방식으로 들어가야 함.
	public StudentInfo(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}
	//<property>태그를 위한것
	public void setStudent(Student student) {
		this.student = student;
	}
	
	//생성자든 setter든 누군가가 주입을 했다면 이 클래스의 student는 값이 들어있다 거기의 값을 출력하자.
	public void printStudentInfo(){
		System.out.println("이름: "+student.getName());
		System.out.println("나이: "+student.getAge());
		System.out.println("학년: "+student.getGradeNum());
		System.out.println("반: "+student.getClassNum());
		System.out.println("-------------------------------------");
	}
	
}
