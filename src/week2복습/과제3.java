package week2복습;
//3) 교재 p 110의 문제1의 내용을 구현하시오. 단 원화를 달러로 계산하는 부분은 메소드로 구현하시오.

import java.util.Scanner;

public class 과제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원) >>");
        double won = sc.nextInt();
        double dollar = won/1100;
       // System.out.println(won + "원은" + dollar + "$입니다.");
        System.out.printf("%d원은 $%.2f입니다.", won, dollar);
    }
}
