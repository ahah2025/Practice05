package com.javaex.ex05;

public class PrintApp {

    public static void main(String[] args) {

        Print print = new Print();
        
        print.printer(10);
        print.printer(true);
        print.printer(5.7);
        print.printer("홍길동");
        
    }

}
/*
 
결 과 값
10
true
5.7
홍길동

*/