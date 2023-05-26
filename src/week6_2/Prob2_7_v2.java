package week6_2;
/*
  교재 2장의 7번 solution
  Point와 Rectangle 클래스를 사용해서 구현
 */

import java.awt.*;
import java.util.Scanner;

public class Prob2_7_v2 {
    public static void main(String[] args) {
        Rectangle rect;
        Scanner sc = new Scanner(System.in);
        System.out.print("두 점을 입력하세요(공백으로 구분): ");
        Point p = new Point(sc.nextInt(), sc.nextInt());

        // 임의의 사각형에 포함 여부를 결정
        System.out.print("사각형 정보(왼쪽 하단 좌표, 폭, 길이) 입력하세요(공백으로 구분): ");
        rect  = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        if (rect.contains(p))
            System.out.printf("%s는 %s안에 있습니다.\n", p.toString(), rect.toString());
        else
            System.out.printf("%s는 사각형 안에 없습니다.\n", p.toString());
    }
}
