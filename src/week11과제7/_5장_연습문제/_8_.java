package week11과제7._5장_연습문제;

public class _8_ {
//    class A {
//        private int a;
//        protected A (int i) {a = i;}
//    }
//
//    class B extends A {
//        private int b;
//        public B() {b = 0;}
//    }

    class A {
        private int a;
        protected A(int i) {
            a = i;
        }
    }

    class B extends A {
        private int b;

        public B() {
            super(0); // A 클래스의 생성자 호출
            b = 0;
        }
    }

}
