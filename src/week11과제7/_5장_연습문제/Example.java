package week11과제7._5장_연습문제;
//5장 연습문제 7번
class A {
    public A() {
        System.out.println("A");
    }
    public A(int x) {
        System.out.println("A : " + x );
    }
}

class B extends A {
    public B() {super(100);}
    public B(int x) {
        System.out.println("B: " + x );
    }
}
public class Example {
    public static void main(String[] args) {
        B b = new B(11);
    }
}
