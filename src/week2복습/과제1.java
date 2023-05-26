package week2복습;
//1) 본인 소개 프로그램을 작성하세요. 본인의 학번, 이름, 취미, 그리고 미래 희망 직업을 키보드로 입력받고 이를 각각 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class 과제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학번을 입력하세요 : ");
        String number = sc.nextLine();
        System.out.print("이름을 입력 : ");
        String name = sc.nextLine();
        System.out.print("취미를 입력 : ");
        String hobby = sc.nextLine();

        System.out.println("내 학번은 " + number + " 이고 내 이름은 " + name + " 이고 내 취미는 " + hobby + "입니다.");

    }
}
