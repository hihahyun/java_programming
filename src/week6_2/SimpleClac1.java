package week6_2;
    /*
   과제 4의 solution - 모든 로직을 메인 메소드에서 구현함.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleClac1 {
        public static void main(String[] args) {
            File file;
            int count = 0;
            int ans = 0;

            try {
                file = new File("data.txt");
                Scanner myReader = new Scanner(file);

                while (myReader.hasNextLine()) {
                    int num1 = myReader.nextInt();
                    String op = myReader.next();
                    int num2 = myReader.nextInt();
                    count++;

                    switch (op) {
                        case "+":
                            ans = num1 + num2;
                            System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
                            break;
                        case "-":
                            ans = num1 - num2;
                            System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
                            break;
                        case "*":
                            ans = num1 * num2;
                            System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
                            break;
                        case "/":
                            try {
                                ans = num1 / num2;
                                System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
                            } catch (ArithmeticException e) {
                                System.out.println("0으로 나누었습니다.");
                            }
                            break;
                        default:
                    }

//                System.out.println(data);
//                String[] elements = data.split(" ");
//              참고 자료 "\\s" 도 가능.
//              http://daplus.net/java-java%EC%9D%98-%EC%A0%95%EA%B7%9C%EC%8B%9D-%ED%91%9C%ED%98%84%EC%8B%9D-s-%EB%8C%80-s/

//                System.out.println("====================");
//                for(String s: elements)
//                    System.out.println(s);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }

    }

