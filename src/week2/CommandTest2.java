package week2;

import java.util.Scanner;

public class CommandTest2 {
    public static void main(String[] args) {
        int x = 1;
        int y = x + 1;
        System.out.println(y);
        // 클래스(System) -필드field: 변수처럼 표현됨, 객체 (out)  -메소드
        // Print Stream 클래스  -println 메소드

        // 조건문
        if(y % 2 == 0)
            System.out.println("짝수입니다.");

        if(y % 2 == 0) {
            System.out.print(y);
            System.out.println("짝수입니다.");
        }

        //반복문
//        int i;
//        for (i = 0; i<5; i++)
//            System.out.println(i);

        for (int i = 0; i<5; i++)  //i++는 i=i+1과 같다
            System.out.println(i);

        // 0부터 20이하의 짝수
        /* for (int i = 0; i<=20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 0; i<=20; i++)
            if (i % 2 == 0)
                System.out.println(i); */

        printEvenNo(8);

        if(x<y)
            System.out.println(y);

        System.out.println( Math.max(123, 567) );

        String s = "java is fun"; //String 은 클래스
        String s2 = new String("C is more fun."); //String 클래스의 생성자는 String // 객체생성하려면 new라는 메소드랑 생성자 메소드가 필요하다
        System.out.println(s);
        System.out.println(s2);

        Scanner sc = new Scanner(System.in); //객체생성
        System.out.print("이름 입력:");
        s = sc.nextLine(); //입력받고
        System.out.println(s + "은 잘생겼다."); //출력


    }
    // 메소드를 이용해서 0부터 20이하의 짝수
    static void printEvenNo(int n) {
        for (int i = 0; i<=n; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }
}

// 클래스 : 필드, 메소드
// - 객체생성
// - 주요기능들의 그룹핑