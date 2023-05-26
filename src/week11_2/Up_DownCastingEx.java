package week11_2;

import java.awt.*;

public class Up_DownCastingEx {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.toString());       // Object의 toString() 구현 확인해볼 것.

        Point p = new Point(1,2);
        System.out.println(p.toString());       // Point의 toString() 구현 확인
        System.out.println(p.x);

        Rectangle r = new Rectangle(1,2,3,4);
        System.out.println(r.toString());

        // 업캐스팅 예제    -- Point 클래스의 메소드들 JDK에서 확인해볼 것.
        Object o2 = p;
//        o2.x = 3;
        System.out.println(o2.toString());

        // 다운캐스팅의 예제
//        Point p2 = o2;
        Point p2 = (Point) o2;
        System.out.println(p2.x);

        // 다운캐스팅의 주의 점
//        Rectangle r2 = (Rectangle) o2;  // runtime 오류 발생에 주의
//        System.out.println(r2.toString());

        System.out.println(o2 instanceof Point); //true
        System.out.println(o2 instanceof Object); // true
        System.out.println(o2 instanceof Rectangle); // false


    }
}