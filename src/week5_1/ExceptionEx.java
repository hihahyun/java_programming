package week5_1;
import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        try {
            for (int i = 0; i < 11; i++)
                intArray[i] = i;
        } catch(Exception e1) {
            System.out.println(e1.getMessage());
        }
        Scanner sc = new Scanner(System.in);
        try {
            sc.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

