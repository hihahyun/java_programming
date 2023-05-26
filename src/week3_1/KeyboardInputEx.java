package week3_1;

import java.util.Scanner;

public class KeyboardInputEx {
    /*
    1. 정수 키보드 입력 방법
    2. 다양한 형태의 데이터 스트림으로부터 데이터 읽기
        Scanner(System.in); Scanner(문자열); Scanner(텍스트파일); 등
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int n = sc.nextInt();
        System.out.println(n);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("숫자입력:");
            n = sc.nextInt();
            sum = sum + n;
        }
        System.out.println("합=" + sum);

        String s;
        for (int i = 0; i < 5; i++) {
            System.out.print("단어입력:");
            s = sc.next();
            System.out.println("입력된 단어:" + s);
        }

        Scanner sc2 = new Scanner("10 -2 3 54 -5");
        for (int i = 0; i < 5; i++) {
            n = sc2.nextInt();
            System.out.println(n);
        }
    }
}
