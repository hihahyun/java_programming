package week6_2;

public class StringEx {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String sObj1 = new String("java");
        String sObj2 = new String("java");

        // 주소 비교 시 특징 확인
        System.out.println(s1 == s2);
        System.out.println(s1 == sObj1);
        System.out.println(sObj1 == sObj2);

        // 리터럴 값의 비교 시 equals 사용
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(sObj1));
        System.out.println(sObj1.equals(sObj2));

        // 수정 시 String literal의 변화 시 String Constant Pool의 새로운 리터럴을 참조
        String s3 = s1;
        s3 = s3 + " is not easy!";
        System.out.println("s1 = " + s1);
        System.out.println("s3 = " + s3);

        // 값의 교환
        String temp = s1;
        s1 = s3;
        s3 = temp;
        System.out.println("s1 = " + s1);
        System.out.println("s3 = " + s3);

        stringSwap(s1, s3);
        System.out.println("s1 = " + s1);
        System.out.println("s3 = " + s3);
    }
    // 메소드 내에서의 String 변화는 유지되지 않음.
    public static void stringSwap(String str1, String str2) {
        String temp = str1;
        str1 = str2;
        str2 = temp;
    }
}