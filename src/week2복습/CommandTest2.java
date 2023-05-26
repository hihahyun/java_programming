package week2복습;

import java.util.Scanner;

public class CommandTest2 {
    public static void main(String[] args) {

        //조건문
        int i = 10;
        if (i % 2 == 0)
            System.out.println(i);

        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //반복문
        //5이하의 양의 정수들 출력
        for (i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        // 0부터 20이하의 짝수들 출력
        for (i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //메소드를 이용해서 0부터 20이하의 짝수 출력
        output();
        System.out.println(output2());

        //메소드를 이용해서 n이하의 짝수 출력
        evenNo(8);

        //숫자비교
        //숫자비교 조건문
        int x = 5;
        int y = 2;
        if (x > y) {
            System.out.println(x);
        }

        //숫자비교 함수 Math.max이용
        System.out.println(Math.max(1, 100));

        //String클래스 객체생성안하고 출력
        String s = "Hello";
        System.out.println(s);
        //String클래스 객체생성하고 출력
        String s2 = new String("Hello2");
        System.out.println(s2);

        //키보드로 이름입력받고 이름+는 잘생겼다 출력하기
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name + "는 잘생겼다.");
    }

    //메소드를 이용해서 0부터 20이하의 짝수 출력
    public static void output () {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int output2 () {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    //메소드를 이용해서 n이하의 짝수 출력
    public static void evenNo(int n){
        for (int i=0; i<=n; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
}
}