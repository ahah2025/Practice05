//Red 경고가 왜 보이는지 이유를 모르겠음
package com.javaex.ex06;

public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        System.out.println(CConverterApp.minus(1000000/1118.70));

        //100달러를 원으로 출력하기
		System.out.println(CConverterApp.minus(1118.7*1000000));
           
        dollar.showInfo();
        won.showInfo();
    }
}
