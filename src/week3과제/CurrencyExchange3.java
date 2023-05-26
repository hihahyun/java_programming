package week3과제;

import java.util.Scanner;

public class CurrencyExchange3 {

    //달러환율 (won to dollar)
    static int wtd = 1300;
    // 엔 환율 (won to jpy)
    static int wty = 10;
    //유로 환율 (won to eur)
    static int wte = 1400;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("이 프로그램은 환전프로그램입니다. 환전하고 싶은 화폐와 금액을 입력하시면 환전 후 금액이 산출됩니다.");
            System.out.println("바꾸고 싶은 화폐를 선택하세요 : (1:달러, 2:엔, 3:유로)");
            int input = Integer.parseInt(sc.nextLine());

            System.out.println("얼마를 환전하고 싶은지 원화를 입력하세요");
            int won = Integer.parseInt(sc.nextLine());

            change (input, won);


            System.out.println("종료하시겠습니까? no를 입력하세요. 다시 실행시키고 싶으면 아무숫자나 누르세요.");

            String finisher = sc.nextLine();
            if (finisher.equals("no")) {
                System.out.println("종료");
                break;
            }
        }
        sc.close();
    }

    public static void change (int input, int won){

        int dollar = won / wtd;
        int jpy = won / wty;
        int eur = won / wte;

        if (input == 1) {
            System.out.println(dollar + "달러");
        } else if (input == 2) {
            System.out.println(jpy + "엔");
        } else if (input == 3) {
            System.out.println(eur + "유로");
        }

    }
}

