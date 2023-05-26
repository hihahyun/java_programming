package week6_1;

/*  학번:
    이름:
    주의사항:
        1) 자신 이름의 클래스를 생성하고 이를 기반으로 제시된 내용들을 구현할 것.
        2) main 메소드를 제외하고 새로 구현할 메소드들의 이름과 매개변수들에는 자신의 학번의
          마지막 자리 수를 추가할 것. 예) genProbFromRandNo_9(...)
        3) main 메소드의 모든 변수 명에도 학번의 마지막 자리 수를 추가할 것.
        4) 미리 제시된 메소드의 명칭은 변경할 필요 없음.
    시험진행 방법:
        1) 자신 이름의 클래스 생성. java 파일 생성을 의미함.
        2) 제시된 문제의 내용을 복사(단 클래스 명은 제외).
        3) 메소드, 매개변수, 주요 변수들의 명칭 변경
        4) 문제 풀이 진행
        5) 완료 후 자신 이름의 .java 파일 온라인 제출
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    // ************************************************************************
    // 1.(6) 100미만의 임의의 0 이상의 정수를 반환하는 메소드(rndInt())를 구현하시오.
    public static int rndInt0() {
        return (int) (100 * Math.random());
    }

    // ************************************************************************
    // 2.(10) 정수의 기본 연산자들 "+", "-", "*", "/", "%" 중 임의의 연산자를 반환하는
    //    메소드(rndOp())을 구현하시오.
    public static String rndOp() {
        int n = (int) (5 * Math.random());
        if (n == 0)
            return "+";
        if (n == 1)
            return "-";
        if (n == 2)
            return "*";
        if (n == 3)
            return "/";
        return "%";
    }

    // ************************************************************************
    // 3.(8) 매개변수 n의 갯수 만큼의 임의의 정수(10이상 100미만) 배열을 반환하는
    //    메소드 getNumbers(int n)를 구현하시오. 위에서 구현한 메소드를 사용하시오.
    public static int[] getNumbers(int n) {
        int[] numArray = new int[n];
        for(int i = 0; i < n; i++)
            numArray[i] = rndInt0();
        return numArray;
    }

    // ************************************************************************
    // 4.(6) void getOpList(String[] strL, int n)을 구현하는데 이는
    //    문자열 배열 strL에 n개의 임의의 연산자를 저장한다.
    public static void getOpList(String[] strL, int n) {
        for(int i = 0; i < n; i++){
            strL[i] = rndOp();
        }
    }

    // ************************************************************************
    // 5.(12) 매개변수의 파일명의 파일을 열고 매개변수 n의 갯수만큼 읽어서
    //    이를 정수의 배열로 반환하는 메소드(getNumbers(fileName, n))를 구현하시오.
    public static int[] getNumbers(String fileName, int n) {
        int[] numArray = new int[n];
        File f = new File(fileName);
        Scanner sc = null;

        try {
            sc = new Scanner(f);
            for (int i = 0; i < n; i++) {
                numArray[i] = sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
        return numArray;
    }

    // 수정 불 필요.
    public static int compute(int n1, String op, int n2){
        if (op == "+")
            return n1 + n2;
        else if (op == "-")
            return n1 - n2;
        else if (op == "*")
            return n1 * n2;
        else if (op == "/")
            return n1 / n2;
        else
            return n1 % n2;
    }

    public static void main(String[] args) {
        int [] n1List;
        String [] opList;

        // ********************************************************************
        // 6.(8) n1List는 난수를 사용한 getNumbers를, opList는 getOpList를, n2List는
        // 파일(data.txt)을 사용한 getNumbers를 사용하여 각각 10개의 배열 데이터를 생성하시오.
        n1List = getNumbers(10);
        opList = new String[10];
        getOpList(opList, 10);
        int[] n2List = getNumbers("filename.txt", 10);


        // 확인용도: 6의 답이 구현되면 계산 결과를 한 줄로 출력시킴.
        for(int i = 0; i < 10; i++)
            System.out.println(n1List[i] + " " + opList[i] + " " + n2List[i] +
                    " = " + compute(n1List[i], opList[i],n2List[i] ));

        // ***********************************************************************
        // 7.(10)  한번의 반복문을 통해 n2List의 최대와 평균 값을 구하고 결과를 출력하세요.
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum = sum + n2List[i];
            if (max < n2List[i])
                max = n2List[i];
        }
        System.out.println("최대 값 = " + max + ", 평균 값 = " + sum/10.0);

        // 확인 용도: n2List에 대해 평균 절대 편차값 구하기.
        System.out.println("평균 절대 편차 값은 = " + getAvgAbsoluteDeviation(n2List, 10));
    }

    // *****************************************************************
    // 8. 평균 절대 편차(average absolute deviation)을 구하는 다음의 메소드를 완성하시오.
    // 평균 절대 편차의 의미는 다음 사이트를 참고하세요.
    // 참고 https://ko.khanacademy.org/math/statistics-probability/summarizing-quantitative-data/other-measures-of-spread/a/mean-absolute-deviation-mad-review
    public static double getAvgAbsoluteDeviation(int[] data, int n){
        int sum = 0;
        double avg = 0.0;
        for(int i = 0; i < n; i++)
            sum = sum + data[i];
        avg = sum / (double) n;

        double temp = 0.0;
        for(int i = 0; i < n; i++)
            temp =  temp + Math.abs(data[i] - avg);
        return temp/n;
    }
}
