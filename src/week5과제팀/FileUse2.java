package week5과제팀;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileUse2 {
    public static void main(String[] args) {
        int[] num1 = new int[100];
        int[] num2 = new int[100];
        String[] str = new String[100];

        System.out.printf("수식은 %d개 입니다.\n", read(num1, num2, str));

        for(int i = 0; i < read(num1, num2, str); i++) {
            result(num1[i], num2[i], str[i]);
        }
    }
    public static int read(int[] x, int[] y, String[] s) {
        int sum = 0;
        try(FileReader fr = new FileReader("C:\\Study\\formula.txt");
            Scanner sc = new Scanner(fr)){
            for(int i = 0; sc.hasNextLine(); i++) {
                String str = sc.nextLine();

                String[] stChange = str.split(" ");

                x[i] = Integer.parseInt(stChange[0]);
                s[i] = stChange[1];
                y[i] = Integer.parseInt(stChange[2]);
                sum++;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return sum;
    }
    public static void result(int x, int y, String s) {
        try {
            if(s.equals("+")) System.out.printf("%d + %d = %d\n", x, y, x + y);
            if(s.equals("-")) System.out.printf("%d - %d = %d\n", x, y, x - y);
            if(s.equals("*")) System.out.printf("%d * %d = %d\n", x, y, x * y);
            if(s.equals("/")) System.out.printf("%d / %d = %d\n", x, y, x / y);
        }catch(ArithmeticException e) {
            System.out.println("0으로는 나눌 수 없습니다.");
        }
    }
}