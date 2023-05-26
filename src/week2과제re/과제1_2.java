package week2과제re;

import java.util.Scanner;

import static week2과제.과제1_2.getBigger;

public class 과제1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째정수:");
        int num1 = sc.nextInt();

        System.out.println("두번째정수:");
        int num2 = sc.nextInt();

       // int result = show(num1, num2);

        //System.out.println("두 정수 중 큰 값은" + result + "입니다.");
    }

    public int show(int num1, int num2) {
        if(num1>num2) {
            return num1;
        }else {
            return num2;
        }
    }
}
