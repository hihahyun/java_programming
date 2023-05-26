package week4과제3re;

import java.util.Scanner;

public class 과제3_switchcase문re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("연산 >> ");
                String input = sc.nextLine();

                String[] str = input.split(" ");
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[2]);

                boolean bl = false;

                double answer = 0;
                switch (str[1]) {
                    case "+":
                        answer = a + b;
                        break;
                    case "-":
                        answer = a - b;
                        break;
                    case "*":
                        answer = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            System.out.println("0으로 나눌 수 없음");
                        } else {
                            answer = a / b;
                        }
                        break;
                    default:
                        System.out.println("잘못된 연산자입니다.");
                        bl = true;
                        break;
                }
                if (!bl) {
                    System.out.println(input + "연산 결과는 " + answer);
                    System.out.print("연산을 종료하려면 quit을 입력하세요. 다시 연산을 수행하고싶으면 아무키나 누르세요. ");
                    String quit = sc.nextLine();
                    if (quit.equals("quit")) {
                        System.out.println("종료");
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}

