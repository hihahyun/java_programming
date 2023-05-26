package week5복습;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("hh2.txt");
            myWriter.write("하하하");
            myWriter.close();
            System.out.println("성공");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
