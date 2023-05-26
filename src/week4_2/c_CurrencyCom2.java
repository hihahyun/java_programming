package week4_2;

/*
  키보드 입력 시 버퍼가 사용됨.
  nextInt(), nextLine()이 같이 사용될 때 의도하지 않는 결과가 발생할 수 있음.
  관련 설명: https://reinvestment.tistory.com/44
 */

import java.util.Scanner;
import week4_1.b_CurrencyCom;

public class c_CurrencyCom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("환율 계산 프로그램입니다. ");
        System.out.println("환전대상 화폐(1:USD, 2:JYP, 3: EUR)와 원화 입력 시 환전 금액을 계산합니다.\n");

        int currency, amount;
        double computedAmount;

        while (true) {
            System.out.print("환전 화폐(1:USD, 2:JYP, 3: EUR) 입력: ");
            //currency = sc.nextInt();
            currency = Integer.parseInt(sc.nextLine());
            System.out.print("원화 환전 금액 입력: ");
            //amount = sc.nextInt();
            amount = Integer.parseInt(sc.nextLine());
           // sc.nextLine();  // \n 문자 제거

            computedAmount = b_CurrencyCom.computeCurrency(currency, amount);
            System.out.println("환전 금액 = " + computedAmount + "\n");

            System.out.print("종료하려면 q, 계속하려면 임의 키를 누르세요: ");
            String cont = sc.nextLine();
            System.out.println();

            if (cont.equals("q"))
                break;
        }

        sc.close();
    }
}
