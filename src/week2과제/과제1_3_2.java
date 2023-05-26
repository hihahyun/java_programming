package week2과제;

import java.util.Scanner;

public class 과제1_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("원화를 입력하세요: ");
        int won = input.nextInt();
        double dollar = won/1100.0;

        System.out.println(won +"원은" + "$" +dollar +"입니다.");

    }
}
