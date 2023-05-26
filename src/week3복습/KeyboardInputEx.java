package week3복습;

import java.util.Scanner;

public class KeyboardInputEx {
    /*
    1. 정수 키보드 입력 방법
    2. 다양한 형태의 데이터 스트림으로부터 데이터 읽기
        Scanner(System.in); Scanner(문자열); Scanner(텍스트파일); 등
     */
    public static void main(String[] args) {
        // 숫자입력
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력: ");
        int num = sc.nextInt();
        System.out.println(num);

        //숫자 5개입력후 입력한 것들의 합출력
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("숫자입력: ");
            int num2 = sc.nextInt();
            sum = sum + num2;
        }
        System.out.println(sum);

        // 단어 5개 입력
        for (int i = 0; i < 5; i++) {
            System.out.println("단어입력: ");
            String s = sc.nextLine();
            System.out.println(s);
        }

        // 정해진 숫자 5개 출력
        Scanner sc2 = new Scanner("1 2 3 4 5 6 7");
        for (int i = 0; i < 5; i++) {
            int num3 = sc2.nextInt();
            System.out.println(num3);
        }
    }
}
