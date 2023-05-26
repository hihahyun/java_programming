package week11과제7._5장_연습문제;
//5장 연습문제 12번
public class _12_ {
}
class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}
class Circle extends Shape {
    public void paint() {
        //빈칸
        System.out.println("Circle");
        super.draw();
    }
    public void draw() {
        System.out.println("Circle");
    }
}

//(1) Shape s = new Circle(); s.draw() 가 호출되면 출력되는 내용은?
//(2) s.paint() 가 호출되면  "Circle"이 출력되도록 빈 칸에 적절한 코드를 삽입하라.
//(3) s.paint() 가 호출되면 "Shape"이 출력되도록 빈 칸에 적절한 코드를 삽입하라.
