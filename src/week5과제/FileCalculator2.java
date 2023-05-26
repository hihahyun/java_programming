package week5과제;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCalculator2 {

        public static void main(String[] args) {
            int[] operands1 = new int[10]; // 첫 번째 피연산자 배열
            int[] operands2 = new int[10]; // 두 번째 피연산자 배열
            String[] operators = new String[10]; // 연산자 배열
            int numExpressions = readFromFile("C:\\DKU2\\프로그래밍 자바\\프로그래밍 학교강의\\src\\week5과제\\test.txt", operands1, operands2, operators); // 파일 읽기

            for (int i = 0; i < numExpressions; i++) {
                int operand1 = operands1[i];
                int operand2 = operands2[i];
                String operator = operators[i];
                int result = calculate(operand1, operand2, operator); // 계산
                System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
            }
        }

        public static int readFromFile(String fileName, int[] operands1, int[] operands2, String[] operators) {
            int numExpressions = 0;
            try {
                File file = new File(fileName);
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(" ");
                    int operand1 = Integer.parseInt(parts[0]);
                    String operator = parts[1];
                    int operand2 = Integer.parseInt(parts[2]);

                    operands1[numExpressions] = operand1;
                    operands2[numExpressions] = operand2;
                    operators[numExpressions] = operator;
                    numExpressions++;
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + fileName);
            }
            return numExpressions;
        }

        public static int calculate(int operand1, int operand2, String operator) {
            int result = 0;
            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    try {
                        result = operand1 / operand2;
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
            }
            return result;
        }
    }

