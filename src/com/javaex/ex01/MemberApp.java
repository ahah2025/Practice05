package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		//정우성
		Member jws = new Member();
		jws.setName("정우성");
		jws.setId("jws");
		jws.setPoint(50000);

		jws.showInfo();
		
		//유재석
		Member yjs = new Member();
		yjs.setName("유재석");
		yjs.setId("yjs");
		yjs.setPoint(30000);
		
		yjs.showInfo();
				
		//이효리
		Member lhr = new Member();
		lhr.setId("lhr");
		lhr.setName("이효리");
		lhr.setPoint(400000);
		
		lhr.showInfo();
	}

}
