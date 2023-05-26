package week4과제3re;

import java.util.Scanner;

public class 과제2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {
                System.out.print("점의 좌표를 입력하세요. : ");
                String str = sc.nextLine();
                String[] input = str.split(" ");

                Point point = new Point();

                point.setX(Integer.parseInt(input[0]));
                point.setY(Integer.parseInt(input[1]));

                String output = "(" + point.getX() + "," + point.getY() + ")";

                if (point.getX() >= 100 && point.getX() <= 200 && point.getY() >= 100 && point.getY() <= 200) {
                    System.out.println(output + "는 사각형 안에 있습니다.");
                } else {
                    System.out.println(output + "는 사각형 안에 없습니다. 다시 입력해주세요.");
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 좌표를 입력해주세요.");
                continue;
            }

            System.out.println("중지하려면 quit을 입력하세요. 다시 실행하려면 아무키나 누르세요.");
            String finisher = sc.nextLine();
            if (finisher.equals("quit")) {
                System.out.println("종료");
                break;
            }
        }
        sc.close();
    }
}
