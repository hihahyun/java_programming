package week5_1;
/*
   for의 control variable의 scope 이슈
   ppt7의 재구성
 */

public class ForEx {

        public static void main(String[] args) {
        int sum = 0;
        int count;
        for (count = 1; count < 11; count++)
            sum += count;
        System.out.println(count);
        System.out.println(sum);

        sum = 0;
        for (int count2 = 1; count2 < 11; count2++)
            sum += count2;
//        System.out.println(count2);    // count2의 scope은 for문 내에 국한됨.
        System.out.println(sum);

        sum = 0;
        for (count = 1; count < 11; count++) {
            sum += count;
            System.out.print(count + ((count <10)?"+":"=")); // 연산자 우선 순위 강조
        }
        System.out.println(sum); // 반복문 안의 경우 println의 처리를 다시 해야.

    }
}
