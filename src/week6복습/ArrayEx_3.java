package week6복습;

import java.util.Arrays;
import java.util.Collection;

public class ArrayEx_3 {
    public static void main(String[] args) {
        int Array[] = {8, 7, 5, 9, 16};
        Arrays.sort(Array);
        for(var p : Array){
            System.out.println(p);
        }
        // 위의 작업을 인덱스 0부터 (배열의 크기 - 1)까지 진행하면
//        int min;
//        int i;
//        int temp;
//        for (int j = 0; j < Array.length - 1; j++) {
//            min = j;
//            for (i = j + 1; i < Array.length; i++) {
//                if (Array[i] < Array[j])
//                    min = i;
//            }
//            temp = Array[j];
//            Array[j] = Array[min];
//            Array[min] = temp;
//        }
//        for (int n : Array) {
//            System.out.println(n);
//        }
//
//        System.out.println("========");
//
//        reset(Array);
//        for (int n : Array) {
//            System.out.println(n);
//        }
    }

    //메소드 이용
    public static void reset(int[] Array2) {
        int min;
        int temp;
        for (int j = 0; j < Array2.length - 1; j++) {
            min = j;
            for (int i = j+1; i < Array2.length; i++) {
                if (Array2[i] < Array2[j])
                    min = i;
            }
            temp = Array2[j];
            Array2[j] = Array2[min];
            Array2[min] = temp;
        }
    }
}
