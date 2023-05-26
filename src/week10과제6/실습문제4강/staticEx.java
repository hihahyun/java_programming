package week10과제6.실습문제4강;
//4강 실습문제 9번
class ArrayUtil {
    public static int [] concat (int[] a, int[] b) {
        //배열 a와 b를 연결한 새로운 배열 리턴
        int result[] = new int[a.length + b.length];
        int index = 0;
        for (int i=0; i<a.length; i++) {
            result[index++] = a[i];
        }
        for (int i=0; i<b.length; i++) {
            result[index++] = b[i];
        }
        return result;
    }

    public static void print(int[] a) {
        //배열 a출력
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
public class staticEx {
    public static void main(String[] args) {
        int [] array1 = {1, 5, 7, 9};
        int [] array2 = {3,6, -1, 100, 77};
        int [] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
