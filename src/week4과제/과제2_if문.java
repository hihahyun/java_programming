package week4과제;

import java.util.Scanner;

public class 과제2_if문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산 >> ");
        double operand1 = sc.nextDouble();
        String operator = sc.next();
        double operand2 = sc.nextDouble();

        if (operator.equals("+")) {
            System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + (operand1 + operand2));
        } else if (operator.equals("-")) {
            System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + (operand1 - operand2));
        } else if (operator.equals("*")) {
            System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + (operand1 * operand2));
        } else if (operator.equals("/")) {
            if (operand2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + (operand1 / operand2));
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
        }
    }
}
