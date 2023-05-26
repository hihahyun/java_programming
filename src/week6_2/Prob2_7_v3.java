package week6_2;
/*
  - 반복 처리
  - 데이터 입력 시 Error Handling을 포함.
 */
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prob2_7_v3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sQuit = "";
        do {
            Point p = getPoint(sc);
            Rectangle r = getRectangle(sc);
            if (r.contains(p))
                System.out.printf("%s는 %s안에 있습니다.\n", p.toString(), r.toString());
            else
                System.out.printf("%s는 %s안에 없습니다.\n", p.toString(), r.toString());
            System.out.print("그만하려면 quit, 아니면 임의의 키를 입력하세요:");
            sQuit = sc.nextLine();
        }while(!sQuit.equals("quit"));
    }

    static Point getPoint(Scanner scanner) {
        System.out.print("두 점을 입력하세요(공백으로 구분): ");
        int x = 0, y = 0;
        while (true) {
            try {
                x = scanner.nextInt();
                System.out.println(x);  // 주석처리해야
                y = scanner.nextInt();
                System.out.println(y);  // 주석처리해야
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println(e + "의 오류 발생");
                System.out.print("두 점을 다시 입력하세요(공백으로 구분): ");
            }
        } ;
        scanner.nextLine(); // newline을 버퍼에서 제거
        Point p = new Point(x, y);
        return p;
    }
    static Rectangle getRectangle(Scanner scanner){
        System.out.print("사각형 정보(왼쪽 하단 좌표, 폭, 길이) 입력하세요(공백으로 구분): ");
        int x = 0, y = 0, width = 0, height = 0;
        while (true) {
            try {
                x = scanner.nextInt();
                System.out.println(x);  // 주석처리해야
                y = scanner.nextInt();
                System.out.println(y); // 주석처리해야
                width = scanner.nextInt();
                System.out.println(width); // 주석처리해야
                height = scanner.nextInt();
                System.out.println(height); // 주석처리해야
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println(e + "의 오류 발생");
                System.out.print("사각형 정보(왼쪽 하단 좌표, 폭, 길이)를 다시 입력하세요(공백으로 구분): ");
            }
        } ;
        scanner.nextLine();  // newline을 버퍼에서 제거
        Rectangle rect  = new Rectangle(x, y, width, height);
        return rect;
    }

}
