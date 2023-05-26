package week2과제;

import java.util.Scanner;

public class 과제1_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("첫 번째 정수를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 정수를 입력하세요: ");
            int num2 = scanner.nextInt();

            int result = getBigger(num1, num2);

            System.out.println("두 정수 중 큰 값은 " + result + " 입니다.");
        }

        public static int getBigger(int num1, int num2) {
            if (num1 > num2) {
                return num1;
            } else {
                return num2;
            }
            //return Math.max(num1, num2);
        }
    }