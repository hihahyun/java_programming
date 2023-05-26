package week10과제6.실습문제4강;
//4강 실습문제 5번,
//다음 설명대로 Circle 클래스와 CircleManager 클래스를 완성하라.

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        //x, y, radius 초기화
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }
}

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];  // 3개의 Circle 배열 선언
        int radius = 0;
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >> ");

            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            Double x = Double.parseDouble(parts[0]);
            Double y = Double.parseDouble(parts[1]);
            radius = Integer.parseInt(parts[2]);

            c[i] = new Circle(x, y, radius);    // Circle 객체 생성
        }
        for (int i = 0; i < c.length; i++) {
            c[i].show();
        }
        scanner.close();
    }
}

//4강 실습문제 6번
//import java.util.Scanner;
//
//class Circle {
//    private double x,y;
//    private int radius;
//    public Circle(double x, double y, int radius){
//        //x, y, radius 초기화
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//    public void show() {
//        System.out.println("(" + x + "," + y + ")" + radius);
//    }
//}
//
//public class CircleManager {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Circle c [] = new Circle[3];  // 3개의 Circle 배열 선언
//        for(int i=0; i<c.length; i++) {
//            System.out.print("x, y, radius >> ");
//
//            String line = scanner.nextLine();
//            String[] parts = line.split(" ");
//            Double x = Double.parseDouble(parts[0]);
//            Double y = Double.parseDouble(parts[1]);
//            int radius = Integer.parseInt(parts[2]);
//
//            c[i] = new Circle(x, y, radius);    // Circle 객체 생성
//        }
//        double maxArea = 0;
//        int maxIndex = 0;
//        for (int i=0; i<c.length; i++) {
//            double area = c[i].getArea();
//            if (area > maxArea) {
//                maxArea = area;
//                maxIndex = i;
//            }
//        }
//        System.out.println("가장 면적이 큰 원은 ");
//        c[maxIndex].show();
//        scanner.close();
//    }
// }
