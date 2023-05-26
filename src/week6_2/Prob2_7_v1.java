package week6_2;

import java.util.Scanner;

public class Prob2_7_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 점을 입력하세요(공백으로 구분): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 지정된 사각형 내에 포함 여부를 판단
        if ((x > 100)&&(y > 100) && (x < 200) && (y < 200))
            System.out.printf("(%d, %d)는 사각형 안에 있습니다.\n",x, y);
        else
            System.out.printf("(%d, %d)는 사각형 안에 없습니다.\n",x, y);
    }
}