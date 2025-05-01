//잘 모르겠음

package com.javaex.ex04;

public class Base {
		
	//필드
	private String day;    
	private String night;
	private String afternoon;
	
    public void Base(String day, String night, String afternoon) {
		this.day = day;
		this.night = night;
		this.afternoon = afternoon;
	}
    
    //낮
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }
	
	//밤
	public String getNight() {
		return night;
	}
	public void setNight(String night) {
		this.night = night;
	}
    public void night() {
    	System.out.println("밤에는 숙면");
    }
    
	//오후
	public String getAfternoon() {
		return afternoon;
	}
	public void setAfternoon(String afternoon) {
		this.afternoon = afternoon;
	}	
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
   
    public void service(String state) {
    	System.out.println("낮에는 열심히 수업듣자");
    	System.out.println("밤에는 숙면");
    	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }    
}

