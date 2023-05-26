package week6복습;

public class ArrayEx_2 {
    public static void main(String[] args) {

        int Array[] = {8,7,5,9,16};
        // 최솟값 구하기
        int min =Integer.MAX_VALUE;
        for(int i=0; i<Array.length-1; i++) {
            if (Array[i] < min)
                min = Array[i];
        }System.out.println("최솟값은" + min);

        // 위의 내용을 수정. 최소 값의 인덱스 구하기.
        int Min = 0;
        for(int i=0; i<Array.length-1; i++) {
            if(Array[i] < Array[Min])
                Min = i;
        }
        System.out.println("최솟값은" + Array[Min]);

        //최댓값 구하기
        int MinNo = Integer.MIN_VALUE;
        for(int n : Array) {
            if (n > MinNo){
                MinNo=n;
            }
        } System.out.println(MinNo);

        // 위치 교환
        int temp = Array[0];
        Array[0] = Array[Min ];
        Array[Min ] = temp;
        System.out.println("최소 값은" + Array[0]); // 이 시점에는 인덱스 0의 위치가 최대값

    }
}