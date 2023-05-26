package week11과제7._5장_연습문제;
//5장 연습문제 11번
public class _11_ {

    class A {
        int i;
    }

    class B extends A {
        int j;
    }

    class C extends B {
        int k;
    }

    class D extends B {
        int m;
    }

// (1) 다음 중 업캐스팅을 모두 골라라
// 1. A a = new A();
// 2. B b = new C();
// 3. A a = new D();
// 4. D d = new D();

    // (2) 다음 코드를 실행한 결과는?
    public static void main(String[] args) {
        A x = new D();
        System.out.println(x instanceof B); //true
        System.out.println(x instanceof C); //false

        // (3) 다음 코드를 실행한 결과는?
        System.out.println(new D() instanceof Object); //true
        System.out.println("Java" instanceof Object); //true
    }
}