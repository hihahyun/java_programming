package week5과제;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

    public class FileTest {

        static boolean bl = true;

        public static void main(String[] args) {
            File file = new File("C:\\DKU2\\프로그래밍 자바\\프로그래밍 학교강의\\src\\week5과제\\test.txt");
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String str = sc.nextLine();
                    double result = calculate(str);
                    if (bl) {
                        System.out.println(str+" = "+result);
                    }
                    bl = true;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public static double calculate(String str){

            String[] arr = str.split(" ");
            ArrayList<Double> numbers = new ArrayList<>();
            ArrayList<String> operators = new ArrayList<>();

            for (String p : arr) {
                if (isInteger(p)) {
                    numbers.add(Double.parseDouble(p));
                }else{
                    operators.add(p);
                }
            }

            ArrayList<String> expr = new ArrayList<>();
            expr.add(numbers.get(0)+"");

            for (int i=0; i< operators.size(); i++) {
                if(operators.get(i).equals("*")){
                    expr.set(expr.size()-1, (Double.parseDouble(expr.get(expr.size()-1)) * numbers.get(i + 1)) + "");
                }else if(operators.get(i).equals("/")){
                    if (numbers.get(i + 1) == 0) {
                        System.out.println(str + " 식은 잘못되었습니다. 0으로 나눌 수 없습니다.");
                        bl = false;
                    }
                    expr.set(expr.size()-1, (Double.parseDouble(expr.get(expr.size()-1)) / numbers.get(i + 1)) + "");

                }else{
                    expr.add(operators.get(i));
                    expr.add(numbers.get(i+1) + "");
                }
            }

            double result = Double.parseDouble(expr.get(0));
            for (int i = 1; i < expr.size(); i+=2) {
                if (expr.get(i).equals("+")) {
                    result += Double.parseDouble(expr.get(i + 1));
                }else{
                    result -= Double.parseDouble(expr.get(i + 1));
                }
            }

            return result;
        }

        public static boolean isInteger(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0) {
                return false;
            }
            int i = 0;
            if (str.charAt(0) == '-') {
                if (length == 1) {
                    return false;
                }
                i = 1;
            }
            for (; i < length; i++) {
                char c = str.charAt(i);
                if (c < '0' || c > '9') {
                    return false;
                }
            }
            return true;
        }

    }

