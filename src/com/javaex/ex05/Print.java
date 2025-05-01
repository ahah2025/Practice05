package com.javaex.ex05;

public class Print {
    
	//필드
	private int n; //10
	private boolean bb; //true
	private double i; //5.7
	private String name;
	
	//생성자
	public Print() {
	}
	
    public void printer(int val){
        System.out.println(val);
    }

    //메소드  3개 를 작성하세요
    public void printer(boolean v){
        System.out.println(v);
    }
    public void printer(double a){
        System.out.println(a);
    }    
    public void printer(String h) {
    	System.out.println(h);
    }
}
