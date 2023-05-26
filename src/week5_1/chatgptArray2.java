package week5_1;

public class chatgptArray2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int maxNo = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxNo) {
                maxNo = number;
            }
        }
        System.out.println(maxNo);
    }
}
