package week9;

/*
    클래스 특징 설명 - 순서대로 설명
    1. 필드 정의 후 메인에서 테스트 - 생성자 정의 없이도 생성 가능
    2. 객체 생성 후 필드 수정해 볼 것.
    3. 매개변수 2개의 생성자 정의 - 컴파일 오류 발생.
       기존 코드에서 디폴트 생성자 사용
    4. 디폴트 생성자 정의 시 컴파일 오류 사라짐. this() 기능도 설명
    5. toString() 메소드 구현 -> Circle(3, Red)의 형식을 반환,  c, c2에 적용
    6. expand(int n) 반지름 길이를 변환
    7. 좌표 필드를 추가. Point로 설정. 이에 맞추어 생성자 수정. toString()도 수정해야

 */

import java.awt.*;

public class Circle {
    // 1
    private int radius;
    public String name;
    Point p;
    // 3
    public Circle(int r, String name){
        radius = r;
        this.name = name;
        p = new Point(0,0);
    }
    // 7.
    public Circle(int r, String name, Point p){
        radius = r;
        this.name = name;
        this.p = p ; // this.p = p;와의 다음 라인의 의미의 차이는??
        // this.p = new Point(p);
    }
    // 4
//    public Circle() {
//        radius = 0;
//        name = "";
//    }
    // 4
    public Circle() {
        this(0, "");
    }
    // 5, 7
    public String toString() {
        return "Circle(" + radius  + ", " + name + ", " + p + ")";
    }
    // p <-> p.toString()

    // 6
    public void expand(int n) {
        radius += n;
    }


    public static void main(String[] args) {
        // 2.
        Circle c = new Circle();  // default 생성자 사용
        c.radius = 1;   // 가능. 같은 클래스 메소드이므로.
        // TestCircle 클래스에서는 불가

        // 4
        Circle c2 = new Circle(5, "Red");

        // 5
        System.out.println(c.toString());
        System.out.println(c2.toString());

        // 6
        c2.expand(5);
        System.out.println(c2.toString());

        // 7
        Point p = new Point(3,5);
        Circle c3 = new Circle(10, "Black", p);

        System.out.println(c3.toString());
        p.move(10, 20);
        System.out.println(c3.toString());

    }
}
