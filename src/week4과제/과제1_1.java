package week4과제;

import java.util.Scanner;

public class 과제1_1 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {

        System.out.print("점 (x,y)의 좌표를 입력하시요. (종료: quit) >>");

        try {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());

            if (x >= 100 && x <= 200 && y >= 100 && y <= 200) {
                System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
            } else {
                System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다. 다시 입력해주세요.");
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            sc.nextLine();
            continue;
        }

        System.out.println("중지하려면 quit을 입력하세요.");
        String finisher = sc.nextLine().trim();
        if (finisher.equals("quit")) {
            System.out.println("종료");
            break;
        }
    }
}
}
