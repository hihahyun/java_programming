package week3_1;

public class forEx {
    /*
    주요개념
    - 클래스의 용도 : 객체 생성 + 유사기능(메소드들)의 grouping
    - 지역 변수의 의미 : 메소드 내에 선언된 변수
                      호출시 생성 + 종료시 소멸
    다음 내용 구하기 연습
    1. 1-10의 숫자 출력
    2. 1-10의 합 출력
    2. 1-10의 홀수의 합
     */

    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        int sum = 0;
        for(int i=1; i<=10; i+=1)
            sum = sum + i;
        System.out.println("1-10의 합 = " + sum);

        sum = 0;
        for(int i=1; i<=10; i+=1)
            if(i % 2 !=0)
                sum = sum + i;
        System.out.println("1-10의 홀수의 합 = " + sum);
    }
}
