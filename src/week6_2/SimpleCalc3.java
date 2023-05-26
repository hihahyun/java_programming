package week6_2;
/*
      과제 4의 solution - 객체지향 스타일로 구현함.
      생성자를 사용하지 않고 선언 시 초기화하고 있는 예제
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleCalc3 {
    final int MAX_SIZE = 100;
    File file;
    int [] num1List = new int[MAX_SIZE];
    int [] num2List = new int[MAX_SIZE];
    String [] opList = new String[MAX_SIZE];
    int count = 0;

    public static void main(String[] args) {
        SimpleCalc3 calc = new SimpleCalc3();
        boolean success = calc.readFromFile();

        if (!success) {
            System.out.println("Error occurred during reading a data file.");
            return;
        }

        // 이 부분도 메소드로 구현 가능
        for(int i = 0; i < calc.count; i++ ){
            calc.evaluateEx(i);
        }
    }

    public boolean readFromFile() {
        File file;
        int n = 0;

        try {
            file = new File("data.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                num1List[n] = myReader.nextInt();
                opList[n] = myReader.next();
                num2List[n] = myReader.nextInt();
                n++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
        count = n;
        return true;
    }
    public void evaluateEx(int n){
        int ans = Integer.MIN_VALUE;
        switch (opList[n]) {
            case "+":
                ans = num1List[n] + num2List[n];
                System.out.println(num1List[n] + " " + opList[n] + " " + num2List[n] + " = " + ans);
                break;
            case "-":
                ans = num1List[n] - num2List[n];
                System.out.println(num1List[n] + " " + opList[n] + " " + num2List[n] + " = " + ans);
                break;
            case "*":
                ans = num1List[n] * num2List[n];
                System.out.println(num1List[n] + " " + opList[n] + " " + num2List[n] + " = " + ans);
                break;
            case "/":
                try {
                    ans = num1List[n] / num2List[n];
                    System.out.println(num1List[n] + " " + opList[n] + " " + num2List[n] + " = " + ans);
                } catch (ArithmeticException e) {
                    System.out.println("0으로 나누었습니다.");
                }
                break;
            default:
        }
    }
}

