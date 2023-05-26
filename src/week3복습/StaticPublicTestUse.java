package week3복습;

public class StaticPublicTestUse {
    public static void main(String[] args) {
        //StaticPublicTest클래스의 num출력
        System.out.println(StaticPublicTest.num);

        //printDummy 출력
        StaticPublicTest.printDummy();

        //printDummy2 출력
        StaticPublicTest 객체2 = new StaticPublicTest();
        객체2.printDummy2();

    }
}
