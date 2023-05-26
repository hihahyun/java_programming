package week1복습;

public class MyClass {
    //sum과 multiply 메소드를 만들고 main메소드에서 출력
    //main
    public static void main(String[] args) {
        sum(1,2);
        System.out.println(sum2(2,3));
        multiply(1,2);
        System.out.println(multiply2(2,3));

    }
    //sum메소드
    public static void sum(int a, int b){
        int result;
        result = a + b;
        System.out.println(result);
    }

    public static int sum2(int a, int b){
        int result = a + b;
        return result;
    }

    //multiply메소드
    public static void multiply(int a, int b){
        int result;
        result = a*b;
        System.out.println(result);
    }

    public static int multiply2(int a, int b){
        int result;
        result = a*b;
        return result;
    }

}
