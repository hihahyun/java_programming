package week5_1;
/*
   Double vs double
   double: 기본 타입. 변수에 값이 저장됨
   Double: 클래스. 변수에 객체의 참조 정보가 저장됨.
           double 관련 주요 메소드와 상수들이 정의됨.
 */
public class DoubleEx {

    public static void main(String[] args) {
        double d = 100.0;
        double d2 = 0.0;

        System.out.println(d/d2);
        System.out.println(d/d2 == Double.POSITIVE_INFINITY);
        System.out.println(Double.isInfinite(d/d2));

        System.out.println(0.0/0.0);
        System.out.println(0.0/0.0 == Double.NaN); // always false. 아마도 숫자가 아닌 걸 비교해서 ...
        System.out.println(Double.isNaN(0.0/0.0));

        String strD = "12.45";
        d = Double.parseDouble(strD);

        Double d3 = d; // Boxing
        d = d3; // Unboxing
    }
}

