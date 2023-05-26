package week4_1;

/*
   Solution은 for문을 기반으로 구현: 2023.3.23 환율 사용
   while문 - 추후 제시
 */
import java.util.Scanner;

public class b_CurrencyCom {
    public static double USD_RATE = 1307.10; // WON/USD
    public static double JPY_RATE = 994.94;  // WON/JPY
    public static double EUR_RATE = 1419.77; // WON/EUR

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("환율 계산 프로그램입니다. ");
        System.out.println("환전대상 화폐(1:USD, 2:JYP, 3: EUR)와 원화 입력 시 환전 금액을 계산합니다.");

        int currency, amount;
        double computedAmount;

        for(int i = 0; i < 3; i++) {
            System.out.print("환전 화폐(1:USD, 2:JYP, 3: EUR) 입력: ");
            currency = sc.nextInt();
            System.out.print("원화 환전 금액 입력: ");
            amount = sc.nextInt();

            computedAmount = computeCurrency(currency, amount);
            System.out.println("환전 금액 = " + computedAmount);
        }
        sc.close();
    }
    public static double computeCurrency(int cur, int amt) {
        if (cur == 1)
            return amt/USD_RATE;
        if (cur == 2)
            return amt/JPY_RATE;
        if (cur == 3)
            return amt/EUR_RATE;
        return 0;
    }
}
