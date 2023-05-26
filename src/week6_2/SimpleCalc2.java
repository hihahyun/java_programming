package week6_2;
/*
      과제 4의 solution - 모든 로직을 C 스타일의 절차적인 방법으로 구현함.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleCalc2 {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        int [] num1List = new int[100];
        int [] num2List = new int[100];
        String [] opList = new String[100];
        int count = 0;

        count = readFromFile(num1List, num2List, opList);

        for(int i = 0; i < count; i++ ){
            evaluateEx(num1List[i], opList[i], num2List[i]);
        }
    }
    public static int readFromFile(int [] n1List, int [] n2List, String[] oList) {
        //File file;
        int n = 0;

        try {
            File file = new File("test.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                n1List[n] = myReader.nextInt();
                oList[n] = myReader.nextLine();
                n2List[n] = myReader.nextInt();
                n++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return n;
    }

    public static void evaluateEx(int n1, String op, int n2){
        int ans = Integer.MIN_VALUE;
        switch (op) {
            case "+":
                ans = n1 + n2;
                System.out.println(n1 + " " + op + " " + n2 + " = " + ans);
                break;
            case "-":
                ans = n1 - n2;
                System.out.println(n1 + " " + op + " " + n2 + " = " + ans);
                break;
            case "*":
                ans = n1 * n2;
                System.out.println(n1 + " " + op + " " + n2 + " = " + ans);
                break;
            case "/":
                try {
                    ans = n1 / n2;
                    System.out.println(n1 + " " + op + " " + n2 + " = " + ans);
                } catch (ArithmeticException e) {
                    System.out.println("0으로 나누었습니다.");
                }
                break;
            default:
        }
    }
}
