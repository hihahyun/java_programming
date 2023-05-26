package week4과제최종;

import java.util.Scanner;

public class 과제1 { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {

        try {
            System.out.print("점의 좌표를 입력하세요. : ");
            String str = sc.nextLine();
            String[] input = str.split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);


            String output = "(" + x + "," + y + ")";

            if (x >= 100 && x <= 200 && y >= 100 && y <= 200) {
                System.out.println(output + "는 사각형 안에 있습니다.");
            } else {
                System.out.println(output + "는 사각형 안에 없습니다. 다시 입력해주세요.");
            }
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 좌표를 입력해주세요.");
            continue;
        }

        System.out.println("다시 실행하려면 아무키나 누르세요. 중지하려면 quit을 입력하세요.");
        String finisher = sc.nextLine();
        if (finisher.equals("quit")) {
            System.out.println("종료");
            break;
        }
    }
    sc.close();
 }
}

