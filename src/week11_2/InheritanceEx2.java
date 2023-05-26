package week11_2;

class Circle {
    public static double PI = 3.14159;
    protected double radius;    // 처음에는 private으로 시작할 것.

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }
    public String toString() {
        return "Circle: " + radius;
    }
}

class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    public double getArea() {
        return 4*PI*Math.pow(super.radius,2);
    }
    public String toString() {
        return "Sphere: " + radius;
    }

}

class Cylinder extends Circle { // 원기둥
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getArea() {
        return 2*PI*Math.pow(super.radius,2) + 2*PI*super.radius*height ;
    }
    public String toString() {
        return "Cylinder: " + radius + ", " + height;
    }
}

// Cone예제는 수업 시간에는 생략해도 될 듯.
class Cone extends Circle {     // 원뿔, 부채꼴의 길이 = sheight로 표시
    private double csHeight;    // Circular Sector의 반지름을 의미

    public Cone(double radius, double csHeight) {
        super(radius);
        this.csHeight = csHeight;
    }

    public double getArea() {
        return PI*Math.pow(super.radius,2) + 2*PI*radius*csHeight;
    }
    public String toString() {
        return "Cone: " + radius + ", " + csHeight;
    }
}


public class InheritanceEx2 {
    public static Circle [] genCircleShapedObjects() {
        Circle[] temp =  { new Circle(3), new Sphere(5), new Cylinder(4, 10)};
        return temp;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getArea());

        Cone c2 = new Cone(5, 3);
        System.out.println(c2.getArea());

        Cylinder c3 = new Cylinder(5, 10);
        System.out.println(c3.getArea());

        Sphere c4 = new Sphere(4);
        System.out.println(c4.getArea());

        System.out.println("======================");

        Circle[] cList = new Circle[4];
        cList[0] = c;
        cList[1] = c2;
        cList[2] = c3;
        cList[3] = c4;

        for(Circle d: cList)
            System.out.println(d.getArea());

        for(Circle d: cList)
            System.out.println(d);
    }
}
