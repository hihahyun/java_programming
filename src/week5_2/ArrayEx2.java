package week5_2;

public class ArrayEx2 {
    public static void main(String[] args) {
        int [] intArray = {1,2,3,4,5};

        int [] intArray2;

        intArray2 = intArray;
        for(int n : intArray2)
            System.out.println(n);

        intArray2[0] = 100;

        for(int n : intArray)
            System.out.println(n);

        changeArrayElement(intArray);

        for(int n : intArray2)
            System.out.println(n);

    }

    public static void changeArrayElement(int [] intArry){
        intArry[0] =  200;
    }
}
