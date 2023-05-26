package week3과제2;

import java.util.Scanner;

public class CurrencyExchange {
    final static double dollar = 0.00076;
    final static double yen = 0.10;
    final static double euro = 0.00071;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moneySort = {"달러", "엔", "유로"};

        while(true) {
            System.out.println("###환율 계산 프로그램입니다. ###");
            System.out.println("3월 22일 기준으로 원화 > 달러, 엔, 유로 환율을 계산할 수 있습니다.");
            System.out.println("원화를 어떤 화폐로 계산하고 싶으신가요?");
            System.out.println("1.달러 2.엔 3.유로 (끝내고 싶다면 no 입력) >>>");

            int won;
            String sort;
            sort = sc.next();
            if(sort.equals("no")) break;
            if(Integer.parseInt(sort) >= 4) {
                System.out.println("다른 숫자를 입력해주세요\n");
                continue;
            }

            System.out.println("몇 원인지 입력해주세요 :");
            won = sc.nextInt();

            double result = Change(Integer.parseInt(sort), won);

            System.out.println(won + "원은" + String.format("%.2f", result) + moneySort[Integer.parseInt(sort) - 1] + "입니다.\n");
        }
    }


    private static double Change(int x, int y) {
        if(x == 1) return y * dollar;
        if(x == 2) return y * yen;
        else return y * euro;
    }
}