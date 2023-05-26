package week5복습;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        int[] intArray2;
        intArray2 = intArray;
        for (int n : intArray2) {
            System.out.println(n);
        }

        intArray2[0] = 100;
        for(int n : intArray2) {
            System.out.println(n);
        }

        changArrayElement(intArray);

        for (int n : intArray2) {
            System.out.println(n);
        }
    }

    public static void changArrayElement(int[] intArray){
        intArray[0] = 200;
    }
}
