package week5_1;

/*
   정수 배열의 초기화
   크기가 지정된 정수 배열 생성
   난수 생성을 통한 배열의 값 설정
   최대값 구하기

 */

public class ArrayEx {
    public static void main(String[] args) {
        int [] intArray = {5, 3, 1, 6, 8};
        int [] intArray2 = new int[100];
        for (int i = 0; i < intArray2.length; i++)
            intArray2[i] =  (int) Math.round(Math.random() * 50);

        for(int n: intArray2)
            System.out.println(n);

        int maxNo = Integer.MIN_VALUE;
        for(int n: intArray2)
            if (n > maxNo)
                maxNo = n;
        System.out.println(maxNo);
    }
}
