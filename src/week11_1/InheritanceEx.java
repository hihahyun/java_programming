package week11_1;

class Circle {
    int radius;
    public Circle() {
        this(1);
    }
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle:" + radius;
    }
}

class ColorCircle extends Circle {
    String color;

    public ColorCircle() {
        super();
        color = "white";
    }
    public ColorCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString());

        ColorCircle c2 = new ColorCircle();
        System.out.println(c2);

        ColorCircle c3 = new ColorCircle(5, "Red");
        System.out.println(c3);
        System.out.println(c3.color);

        Circle c4 = new ColorCircle(10, "Black");
        System.out.println(c4);
        System.out.println(c4.radius);
//        System.out.println(c4.color);
    }
}
