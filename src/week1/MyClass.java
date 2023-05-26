
/* 주석문
    명령어의 유형
    - Input, Output device 처리 관련
    - 변수
    - 연산자
    - 반복문
    - 조건문
    - 메소드: 미리 정의한 작업

 */


package week1;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("First Java Program");
        int a; //a는 정수타입
        a = 1;
        a = a + 2; // 연산자 +, -, *, /, %
        System.out.println(a);

        int result = 5 + 3;
        System.out.println(result);

        result = 5 - 3;
        System.out.println(result);

        result = sum(100, 50);
        result = multiply (100, 50);
        System.out.println(result);

    }
    static int sum(int x, int y) { // static : 객체생성안하고 쓸수있는 매소드
        int hap;
        hap = x + y;
        return hap;
    }
    static int multiply (int x, int y) {
        int hap;
        hap = x * y;
        return hap;
    }
}
