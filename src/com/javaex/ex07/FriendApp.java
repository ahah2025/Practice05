package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        System.out.print("이름:");
        String name=sc.nextLine();
        System.out.print("핸드폰:");
        String hp=sc.nextLine();
        System.out.print("학교:");
        String school=sc.nextLine();
        
        //for문 시작

        for(int i=0; i<3; i++) {
        		System.out.print("이름:"+name+"\t");
            	System.out.print("핸드폰:"+hp+"\t");
            	System.out.println("학교:"+school);
        }for (int i=1; i<3; i++) {
        	System.out.print("이름:"+name+"\t");
        	System.out.print("핸드폰:"+hp+"\t");
        	System.out.println("학교:"+school);
        }for (int i=2; i<3; i++) {
        	System.out.print("이름:"+name+"\t");
        	System.out.print("핸드폰:"+hp+"\t");
        	System.out.println("학교:"+school);
        }
        //친구정보 3명 입력 로직 --> 반복문 사용
            
      
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i--) {
            //친구정보 출력 메소드 호출
        }

        sc.close();
    }

}
/*
친구를 3명 등록해 주세요
이름:정우성
핸드폰:010-1111-1111
학교:서울초등학교
이름:정우성	핸드폰:010-1111-1111	학교:서울초등학교
이름:정우성	핸드폰:010-1111-1111	학교:서울초등학교
이름:정우성	핸드폰:010-1111-1111	학교:서울초등학교
이름:정우성	핸드폰:010-1111-1111	학교:서울초등학교
이름:정우성	핸드폰:010-1111-1111	학교:서울초등학교
이름:정우성	핸드폰:010-1111-1111	학교:서울초등학교

친구를 3명 등록해 주세요
이름:이효리
핸드폰:010-2222-2222
학교:제주중학교
이름:이효리	핸드폰:010-2222-2222	학교:제주중학교
이름:이효리	핸드폰:010-2222-2222	학교:제주중학교
이름:이효리	핸드폰:010-2222-2222	학교:제주중학교
이름:이효리	핸드폰:010-2222-2222	학교:제주중학교
이름:이효리	핸드폰:010-2222-2222	학교:제주중학교
이름:이효리	핸드폰:010-2222-2222	학교:제주중학교

친구를 3명 등록해 주세요
이름:유재석
핸드폰:010-3333-3333
학교:강남고등학교
이름:유재석	핸드폰:010-3333-3333	학교:강남고등학교
이름:유재석	핸드폰:010-3333-3333	학교:강남고등학교
이름:유재석	핸드폰:010-3333-3333	학교:강남고등학교
이름:유재석	핸드폰:010-3333-3333	학교:강남고등학교
이름:유재석	핸드폰:010-3333-3333	학교:강남고등학교
이름:유재석	핸드폰:010-3333-3333	학교:강남고등학교

*/