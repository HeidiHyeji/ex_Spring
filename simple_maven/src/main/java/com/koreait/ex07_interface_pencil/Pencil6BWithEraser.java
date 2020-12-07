package com.koreait.ex07_interface_pencil;

public class Pencil6BWithEraser extends Pencil6B implements Pencil{	
	
	@Override
	public void use() {
		System.out.println("지우개로 지울 수도 있다.");
	}

}
