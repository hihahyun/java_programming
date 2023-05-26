package week4과제최종;

import java.util.Scanner;

public class 과제3_if문re_최종 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                // 사용자 입력받기
                System.out.print("연산 >> ");

                try {
                    String str = sc.nextLine();
                    String[] input = str.split(" ");
                    double operand1 = Double.parseDouble(input[0]);
                    String operator = input[1];
                    double operand2 = Double.parseDouble(input[2]);

                    // 산술 연산 수행
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
                        continue;
                    }

                } catch (Exception e) {
                    System.out.println("잘못된 입력입니다.");
                    sc.nextLine();
                    continue;
                }

                // 사용자가 프로그램을 종료할지 계속 실행할지 입력 받기
                System.out.println("종료하려면 quit을 입력하세요. 다시 실행하려면 아무키나 누르세요.");
                String finisher = sc.nextLine();
                if (finisher.equals("quit")) {
                    System.out.println("종료");
                    break;
                }
            }
            sc.close();
        }
    }

