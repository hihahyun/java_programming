package week4복습;
//과제 2
//교재 p 110의 문제1의 내용을 확장하여 구현하려고 한다. 원화를 달러, 옌, 유로의 화폐로 계산하고자 한다. 다음의 요구 사항을 구현하세요.
//1. 각 화폐의 환율(2023.3.22. 고지 환율)은 프로그램 내에 상수로 표현한다.
//2. 하나의 메소드 내에서 지정된 환율에 따라 환산된 금액을 계산하여 반환하는 메소드를 구현한다. 이 메소드는 두 개의 매개변수(환전 대상 화폐, 원화 금액)를 입력받고 해당 화폐의 금액을 반환한다.
//3. 프로그램 시작 후, 본 프로그램의 기능을 간단히 설명하고 사용자가 환전 대상 화폐와 원화 금액을 입력한 후 이를 메소드로 계산한 후 환전된 값을 보여준다.
// 이때 환전 대상 화폐는 편의상 1은 달러, 2는 옌, 3은 유로화로 정한다.
//4. 3의 작업은 사용자가 no를 입력할 때까지 반복하도록 진행하는데 이를 위해 while문을 사용한다. while문은 교재의 p119쪽을 참고해서 사용하도록 하세요.
// 본 기능의 구현이 while문으로 처리하기 어려운 경우, for문을 3번 수행하여 구현하도록 하세요.


import java.util.Scanner;

public class CurrencyCom {
    public static double USD_RATE = 1307.10; // WON/USD
    public static double JPY_RATE = 994.94;  // WON/JPY
    public static double EUR_RATE = 1419.77; // WON/EUR


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("환전하고 싶은 화폐를 입력하세요. 1은 달러, 2는 옌, 3은 유로화 >>");
        int input = sc.nextInt();
        System.out.println("환전하고 싶은 원화의 금액을 입력하세요");
        int won = sc.nextInt();

        System.out.println(Currency(input, won) + "원입니다.");

    }


    public static double Currency(int input, double won) {
        if (input == 1) {
            return won * USD_RATE;
        }
        else if (input == 2) {
            return won * JPY_RATE;
        }
        else if (input == 3) {
            return won * EUR_RATE;
        }
        else return 0;
    }

    public static double Currency2(int input, double won) {
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
}
