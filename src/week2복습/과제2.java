package week2복습;

import java.util.Scanner;

//2) 두 정수 중 큰 값을 반환하는 getBigger 메소드를 구현하고 메인에서 키보드로 부터 두 정수를 읽은 후,
// getBigger메소드를 사용하여 두 정수 중 큰 값을 화면에 출력하는 프로그램을 구현하시오. 구현은 Intellij를 설치하고 이를 통해 구현하도록 하세요.
public class 과제2 {
    public static void main(String[] args) {
        System.out.println("숫자 두개를 입려하세요");
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자:");
        int a = sc.nextInt();
        System.out.print("두번째 숫자:");
        int b = sc.nextInt();

        System.out.println(getBigger(a,b));
        getBigger2(a, b);
    }
    public static int getBigger(int a, int b){
        if (a>b) {
            return a;
        }else return b;
    }

    public static void getBigger2(int a, int b){
        int result = (a>b) ? a : b;
        System.out.println(result);
    }
}
