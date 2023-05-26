package week2과제;

import java.util.Scanner;

public class 과제1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("두 자리 정수를 입력하세요: ");
        int number = input.nextInt();

        if (number < 10 || number > 99) {
            System.out.println("잘못된 입력입니다.");
        } else if (number / 10 == number % 10) {
            System.out.println("십의 자리와 일의 자리가 같습니다.");
        } else {
            System.out.println("십의 자리와 일의 자리가 다릅니다.");
        }

    }
}
