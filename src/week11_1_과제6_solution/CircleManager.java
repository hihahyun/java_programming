package week11_1_과제6_solution;

//import java.util.Scanner;
//class Circle {
//    private double x, y;
//    private int radius;
//    public Circle(double x, double y, int radius) {
//        this.x = x; this.y = y; this.radius = radius;
//    }
//    public void show() {
//        System.out.println("(" + x + "," + y + ")"+ radius);
//    }
//}
//public class CircleManager {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Circle c [] = new Circle [3];
//        for(int i=0; i<c.length; i++) {
//            System.out.print("x, y, radius >>");
//            double x = scanner.nextDouble();
//            double y = scanner.nextDouble();
//            int radius = scanner.nextInt();
//            c[i] = new Circle(x,y,radius);
//        }
//        for(int i=0; i<c.length; i++) c[i].show();
//        scanner.close();
//    }
//}

import java.util.Scanner;
class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x; this.y = y; this.radius = radius;
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")"+ radius);
    }
    public double getArea() {
        return Math.PI*radius; // Math.PI는 3.14
    }
}
public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c [] = new Circle [3];
        for(int i=0; i<c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x,y,radius);
        }
        int biggestIndex=0;
        for(int i=1; i<c.length; i++) {
            if(c[biggestIndex].getArea() < c[i].getArea())
                biggestIndex = i;
        }

        System.out.print("가장 면적인 큰 원은 ");
        c[biggestIndex].show();
        scanner.close();
    }
}