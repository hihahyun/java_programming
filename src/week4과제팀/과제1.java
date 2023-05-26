package week4과제팀;

import java.util.Scanner;

public class 과제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        while(true) {
            System.out.println("x좌표와 y좌표 입력 (끝내려면 quit)");
            x = sc.next();
            if(x.equals("quit")) break;
            y = sc.nextInt();

            System.out.println("제시된 점이 직사각형 안에 있는가? :" + check(Integer.parseInt(x), y));
        }
    }

    public static boolean check(int x, int y) {
        if ((x>=100 && x<=200 && y>=100 && y<=200))
                return true;
        else return false;
    }
}
