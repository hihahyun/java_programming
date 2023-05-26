package week6복습;

public class ArrayEx {

        public static void sortArray2(int[] myArray) {
            int minInd = 0;
            for (int j = 0; j < myArray.length - 1; j++) {
                minInd = j;
                for (int i = j + 1; i < myArray.length; i++) {
                    if (myArray[minInd] > myArray[i]) {
                        minInd = i; }
                }
                    int temp = myArray[j];
                    myArray[j] = myArray[minInd];
                    myArray[minInd] = temp;
            }
        }

        public static void main(String[] args) {
            int[] numArray = {10, 3, 6, 2, 5};
            sortArray2(numArray);
            for (int n : numArray) {
                System.out.println(n);
            }
        }
    }
