package week5과제;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class FileCalculator {
        public static void main(String[] args) {
            try {
                File inputFile = new File("C:\\DKU2\\프로그래밍 자바\\프로그래밍 학교강의\\src\\week5과제\\test.txt");
                Scanner scanner = new Scanner(inputFile);

                while (scanner.hasNext()) {
                    int num1 = scanner.nextInt();
                    String operator = scanner.next();
                    int num2 = scanner.nextInt();
                    int result = 0;

                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            try {
                                result = num1 / num2;
                            } catch (ArithmeticException e) {
                                System.out.println("Error: Divide by zeroSsS");
                                continue;
                            }
                            break;
                        default:
                            System.out.println("Error: Invalid operator");
                            continue;
                    }

                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found");
            }
        }
    }

