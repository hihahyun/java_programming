package week5복습;

import java.sql.SQLOutput;

public class DoubleEx {
    public static void main(String[] args) {
        double d = 100.0;  // double 변수 d에 값 100.0을 저장합니다.
        double d2 = 0.0;   // double 변수 d2에 값 0.0을 저장합니다.

        System.out.println(d/d2);  // d를 d2로 나누는 연산을 하면 무한대를 출력합니다.
        System.out.println(d/d2 == Double.POSITIVE_INFINITY);  // 위에서 계산한 결과가 Infinity인지 확인합니다.
        System.out.println(Double.isInfinite(d/d2));  // Double.isInfinite() 메소드를 사용하여 Infinity인지 확인합니다.

        System.out.println(0.0/0.0);  // 0을 0으로 나누면 NaN(Not a Number)을 출력합니다.
        System.out.println(0.0/0.0 == Double.NaN);  // NaN은 자기 자신과도 같지 않기 때문에, 이 비교식은 항상 false입니다.
        System.out.println(Double.isNaN(0.0/0.0));  // Double.isNaN() 메소드를 사용하여 NaN인지 확인합니다.

        String strD = "12.45";  // String 변수 strD에 "12.45"라는 문자열을 저장합니다.
        d = Double.parseDouble(strD);  // Double.parseDouble() 메소드를 사용하여 strD를 double 타입으로 변환하고, 그 결과를 d에 저장합니다.

        Double d3 = d;  // Boxing을 사용하여 double 값을 Double 객체에 할당합니다.
        d = d3;  // Unboxing을 사용하여 Double 객체에서 double 값을 가져와서, 다시 d에 저장합니다.

        int a = 10;
        Integer a2 = a;
        a = a2;
    }
}
