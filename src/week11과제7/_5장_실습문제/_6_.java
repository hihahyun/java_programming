package week11과제7._5장_실습문제;

//public class _6_ {
//    public static void main(String[] args) {
//        ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK색 점
//        System.out.println(zeroPoint.toString());
//
//        ColorPoint cp = new ColorPoint(10, 10); //(10,10) 위치의 BLACK 색 점
//        cp.setXY(5, 5);
//        cp.setColor("RED");
//        System.out.println(cp.toString() + "입니다.");
//    }
//}
//

//
//class Point {
//    private int x;
//    private int y;
//
//    public Point() {
//        this.x = 0;
//        this.y = 0;
//    }
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public void setXY(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public String toString() {
//        return "(" + x + "," + y + ")";
//    }
//}
//
//class ColorPoint extends Point {
//    private String color;
//
//    public ColorPoint() {
//        super();
//        this.color = "BLACK";
//    }
//
//    public ColorPoint(int x, int y) {
//        super(x, y);
//        this.color = "BLACK";
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String toString() {
//        return color + " 색의 " + super.toString() + "의 점";
//    }
//}
//
//public class _6_ {
//    public static void main(String[] args) {
//        ColorPoint zeroPoint = new ColorPoint();
//        System.out.println(zeroPoint.toString());
//
//        ColorPoint cp = new ColorPoint(10, 10);
//        cp.setXY(5, 5);
//        cp.setColor("RED");
//        System.out.println(cp.toString() + "입니다.");
//    }
//}
