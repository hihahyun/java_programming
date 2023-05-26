package week11과제7._5장_연습문제;
//5장 연습문제 10번

//abstract class OddDetector {
//    protected int n;
//    public OddDetector (int n) {
//        this.n = n;
//    }
//    public abstract boolean isOdd(); // 홀수이면  true 리턴
//}
//
//public class B extends OddDetector {
//    public B (int n) {
//        super (n);
//    }
//
//    public static void main(String[] args) {
//        B b = new B(10);
//        System.out.println(b.isOdd()); // B가 짝수이므로 false 출력
//    }
//}

abstract class OddDetector {
    protected int n;

    public OddDetector(int n) {
        this.n = n;
    }

    public abstract boolean isOdd(); // 홀수이면 true 리턴
}

public class B extends OddDetector {
    public B(int n) {
        super(n);
    }

    public boolean isOdd() {
        return n % 2 != 0; // n이 홀수면 true를 리턴
    }

    public static void main(String[] args) {
        B b = new B(10);
        System.out.println(b.isOdd()); // B가 짝수이므로 false 출력
    }
}
