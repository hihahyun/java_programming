package week3복습;

public class StaticPublicTest {
    /*
    static, public, private 의 의미 + 차이점 설명
    static : 객체 생성 없이 사용 가능
    public : 누구나 사용 가능
    private : 동일 클래스의 메소드에서만 사용 가능

    입력 system.in (system클래스의 in필드 -> public static o)
    출력 system.out
     */
    public static int num = 100; //private으로 변경시 어떤 문제가 생기는가? 다른 곳에선 작동하지 않는다.

    public static void main(String[] args) {
        //num 100출력
        System.out.println(num);

        int n = num;
        System.out.println(num);

        //static 메소드 출력
        printDummy();

        //static 메소드 객체생성하고 출력
        StaticPublicTest 객체 = new StaticPublicTest(); //클래스 객체 = new 클래스
        객체.printDummy2(); // 객체.메소드

    }

    // printDummy static(0)
    public static void printDummy() {
        System.out.println("printDummy");
    }

    // printDummy2 static(x)
    public void printDummy2() {
        System.out.println("printDummy2");
    }
}
