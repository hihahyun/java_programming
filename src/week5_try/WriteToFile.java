package week5_try;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("a.txt");
            myWriter.write("chocopie");
            myWriter.close();
            System.out.println("종료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}