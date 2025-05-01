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

    /// !--------------------------------!
    public void service(String state) {
        
        //코드작성할것
    }    
    //// !--------------------------------!
	public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }
	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	//// !--------------------------------!
    public void night() {
        
    	//코드작성할것
    }	
    
	public String getNight() {
		return night;
	}
	public void setNight(String night) {
		this.night = night;
	}

    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }	
	
	public String getAfternoon() {
		return afternoon;
	}

	public void setAfternoon(String afternoon) {
		this.afternoon = afternoon;
	}


}

