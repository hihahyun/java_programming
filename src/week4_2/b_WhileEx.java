package week4_2;

import java.util.Scanner;

public class b_WhileEx {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++)
            System.out.println(i);

        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        Scanner sc = new Scanner(System.in);

        String str = "any string except q";  // 주의: null은 곤란.
        while (!str.equals("q")) {
            System.out.print("Enter any key, quit for 'q':");
            str = sc.nextLine();
        }
        System.out.println("종료");
    }
}
