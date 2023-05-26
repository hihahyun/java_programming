package week5과제팀;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileUse {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:\\Study\\formula.txt");
            Scanner sc = new Scanner(fr)){
            for(int i = 0; sc.hasNextLine(); i++) {
                String str = sc.nextLine();

                String[] stChange = str.split(" ");
                int x = Integer.parseInt(stChange[0]);
                int y = Integer.parseInt(stChange[2]);
                try {
                    switch (stChange[1]) {
                        case "+" -> System.out.printf("%d + %d = %d\n", x, y, x + y);
                        case "-" -> System.out.printf("%d - %d = %d\n", x, y, x - y);
                        case "*" -> System.out.printf("%d * %d = %d\n", x, y, x * y);
                        case "/" -> System.out.printf("%d / %d = %d\n", x, y, x / y);
                    }
                }catch(ArithmeticException e) {
                    System.out.println("0으로는 나눌 수 없습니다.");
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}