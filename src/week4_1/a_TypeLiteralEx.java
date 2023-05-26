package week4_1;

// 타입: 저장공간의 크기 및 사용 용도 지정
// 변수: 저장 공간의 명칭(?). 타입 지정 -> 크기와 용도가 결정
// 리터럴: 타입의 구성 값을 의미

import java.util.Date;

public class a_TypeLiteralEx {
    public static void main(String[] args) {

        // 정수 관련 예제
        byte age = 20; // 범위 질문??  -128 ~ 128 - 1 : 나이 표현에 적절
        age = 127;  //범위 밖 확인 시킬 것 - 컴파일러 차원에 확인
        int viewCount = 123456789; // 범위 질문 4byte 크기
        viewCount = 123_456_789; //자리 수 표현 가능
        long viewCount2 = 123456789;
        viewCount2 = 12345678900L; // L 붙여야


        System.out.println(Integer.MAX_VALUE);

        // 실수 관련 예제
        double temperature = 35.5; // 실수 표현은 디폴트로 double 리터럴로 간주
        float temperature2 = 35.5f; //F 또는 f 붙여야

        // 기타
        char letter ='Z';
        boolean isAccepted = true; // false

        // 레퍼런수 타입 관련 예제
        Date now = new Date(); // new의 의미 Heap 공간에 메모리 할당
        // Date() 메소드(생성자) 호출 : 사이트 확인
        System.out.println(now);

    }
}