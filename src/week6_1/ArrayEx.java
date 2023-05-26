package week6_1;

/*
  배열 복습
  1) 배열의 최소값 구하기
  2) 배열의 최소값의 인덱스 구하기
  3) 정렬
     - 최대값을 첫번째 요소와 위치 교환
     - 위의 과정을 배열의 인덱스를 증가시키면서 반복
     - selection sort 알고리즘 다음 참고
     https://www.tutorialspoint.com/data_structures_algorithms/selection_sort_algorithm.htm

 */

public class ArrayEx {
    public static void sortArray(int[] myArray) {
        int minInd = 0;
        for (int j = 0; j < myArray.length - 1; j++) {
            minInd = j;
            for (int i = j + 1; i < myArray.length; i++) {
                if (myArray[minInd] > myArray[i])
                    minInd = i;
                int temp = myArray[j];
                myArray[j] = myArray[minInd];
                myArray[minInd] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] numArray = {10, -5, -1, 34, 2, 4, 3, 6, -2, 9};

        // 최소값 구하기.
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < numArray.length; i++)
            if (minVal > numArray[i])
                minVal = numArray[i];
        System.out.println("최소 값은" + minVal);

        // 위의 내용을 수정. 최소 값의 인덱스 구하기. 첫 번째 값과는 비교할 필요가 없음.
        int minInd = 0;
        for (int i = 1; i < numArray.length; i++)
            if (numArray[minInd] > numArray[i])
                minInd = i;
        System.out.println("최소 값은" + numArray[minInd]);

        // 위치 교환
        int temp = numArray[0];
        numArray[0] = numArray[minInd ];
        numArray[minInd ] = temp;
        System.out.println("최소 값은" + numArray[0]);
        // 이 시점에는 인덱스 0의 위치가 최대값

//        // 위의 작업을 인덱스 0부터 (배열의 크기 - 1)까지 진행하면
//        for (int j = 0; j < numArray.length - 1; j++) {
//            minInd = j;
//            for (int i = j + 1; i < numArray.length; i++)
//                if (numArray[minInd] > numArray[i])
//                    minInd = i;
//            temp = numArray[j];
//            numArray[j] = numArray[minInd];
//            numArray[minInd] = temp;
//        }
        sortArray(numArray);
        for(int n: numArray) {
            System.out.print(n + " ");
        }
    }
}