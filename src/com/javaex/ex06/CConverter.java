package com.javaex.ex06;

public class CConverter {
    
	//필드
    public static double rate; //한국 원화에 대한 환율을 나타냄
    
    //메소드
        
    public static double toDoller(double won){
        return won / rate; //한국 원화를 달러로 변환하는 과정
    }

    public static double toKWR(double dollar){
        return dollar * rate; //달러를 한국 원화로 변환하는 과정
    }
    
    //출력
	public void setRate(double r){
		rate=r; //환율을 설정
	}
}
