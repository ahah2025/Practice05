/*
백만원은Infinity입니다.
백달러는0.0입니다.

결 과 값이 다르게 나옴
 */
package com.javaex.ex06;

public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        //CConverter.setRate(1118.70);
        System.out.println("백만원은"+CConverter.toDoller(1000000)+"입니다.");
        System.out.println("백달러는"+CConverter.toKWR(1118.70)+"입니다.");

    }
}
