package week2과제;

import java.util.Scanner;

public class 과제1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학번을 입력하세요 :");
        String studentId = sc.nextLine();

        System.out.print("이름을 입력하세요 :");
        String name = sc.nextLine();

        System.out.print("취미를 입력하세요 :");
        String hobby = sc.nextLine();

        System.out.print("미래 희망 직업을 입력하세요 :");
        String futureJob = sc.nextLine();

        System.out.println("\n====본인소개====");
        System.out.println("학번: " + studentId);
        System.out.println("이름: " + name);
        System.out.println("취미: " + hobby);
        System.out.println("미래 희망 직업: " + futureJob);
        System.out.println("저는 단국대 소프트웨어학과" + studentId + "학번, " + name + "입니다.");
        System.out.println("취미는 " + hobby + "이고, 미래 희망직업은 " + futureJob + "입니다.");
    }
}
