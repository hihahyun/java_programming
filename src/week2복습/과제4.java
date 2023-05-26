package week2복습;
//4) 교재 p110의 문제 2의 내용을 구현하시오. 단 판별하는 부분은 메소드로 구현하시오.

import java.util.Scanner;

public class 과제4 {
    public static void main(String[] args) {
        boolean bl;
        Scanner sc = new Scanner(System.in);
        while (bl = true) {
            System.out.print("2자리수 정수 입력 >>");
            int num = Integer.parseInt(sc.nextLine());
            if ((num %= 10) == (num /= 10)) {
                System.out.println("10의 자리수와 1의 자리수가 같다.");
            } else {
                System.out.println("10의 자리수와 1의 자리수가 다르다.");
            }
            System.out.println("종료하려면 quit입력");
            String finisher = sc.nextLine();
            if (finisher.equals("quit")) {
                bl = false;
                System.out.println("종료");
                break;
            }
        }
    }
}