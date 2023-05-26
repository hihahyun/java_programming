package week3_1;

public class StaticPublicTestUse {
    public static void main(String[] args) {
        System.out.println(StaticPublicTest.num);

        StaticPublicTest.printDummy();

        StaticPublicTest a = new StaticPublicTest();
        a.printDummy2();
    }
}
