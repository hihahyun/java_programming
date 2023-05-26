package week4복습;

import java.util.Scanner;

public class CurrencyCom4 {
    public static double USD_RATE = 1307.10; // WON/USD
    public static double JPY_RATE = 994.94;  // WON/JPY
    public static double EUR_RATE = 1419.77; // WON/EUR


    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("환전하고 싶은 화폐를 입력하세요. 1은 달러, 2는 옌, 3은 유로화 >>");
            int input = Integer.parseInt(sc.nextLine());
            System.out.println("환전하고 싶은 원화의 금액을 입력하세요");
            int won = Integer.parseInt(sc.nextLine());

            Currency5(input, won);

            System.out.println("종료하려면 q, 계속하려면 아무키나 누르세요 : ");
            String finisher = sc.nextLine();

            if (finisher.equals("q")) {
                System.out.println("종료");
                break;
            }
        }
        //sc.close(); //while문이 끝나고 닫아야한다.
    }


    public static double Currency3 ( int input, double won){
        if (input == 1) {
            return won * USD_RATE;
        } else if (input == 2) {
            return won * JPY_RATE;
        } else if (input == 3) {
            return won * EUR_RATE;
        } else return 0; // static void는 else return 안해줘도됨. static int static double은 else return 해줘야함.
    }

    public static double Currency4 ( int input, double won){
        if (input == 1) {
            return won * USD_RATE;
        }
        if (input == 2) {
            return won * JPY_RATE;
        }
        if (input == 3) {
            return won * EUR_RATE;
        }
        return 0;
    }

    public static void Currency5 (int input, double won) {
        double dollar = won / USD_RATE;
        double jpy = won / JPY_RATE;
        double euro = won / EUR_RATE;

        if (input == 1) {
            System.out.println(dollar + "달러");
        } else if (input == 2) {
            System.out.println(jpy + "엔");
        } else if (input == 3) {
            System.out.println(euro + "유로");
        } else {
            System.out.println("몰라");
        }
    }

    public static void Currency6 (int input, double won) {
        double dollar = won / USD_RATE;
        double jpy = won / JPY_RATE;
        double euro = won / EUR_RATE;

        if (input == 1) {
            System.out.println(dollar + "달러");
        } else if (input == 2) {
            System.out.println(jpy + "엔");
        } else if (input == 3) {
            System.out.println(euro + "유로");
        } else {
            System.out.println("몰라");
        }
    }
}
