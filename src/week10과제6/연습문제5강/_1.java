package week10과제6.연습문제5강;

public class _1 {

    class A {
        private  int a;
        public void set(int a) {this.a = a;}
    }

    class B extends A {
        protected int b,c;
    }

    class C extends B {
        public int d, e;
    }

    // (1) A objA = new objA(); 에 의해 생성되는 객체 objA의 멤버들을 모두 나열하라.
    // (1) B objB = new objB(); 에 의해 생성되는 객체 objB의 멤버들을 모두 나열하라.
    // (1) C objC = new objC(); 에 의해 생성되는 객체 objC의 멤버들을 모두 나열하라.
// (4) 클래스 D를 다음과 같이 작성하였을 때, 오류가 발생하는 라인을 모두 찾아라.
    class D extends C {
        public void f() {
            // a = 1;
            set(10);
            b = 20;
            d = 30;
        }
    }


}
