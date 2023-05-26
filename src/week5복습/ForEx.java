package week5복습;

public class ForEx {
    public static void main(String[] args) {
        int sum = 0;
        int count;
        for (count = 1; count < 11; count++) {
            sum += count;
        }
        System.out.println(count);
        System.out.println(sum);

        sum = 0;
        for (int count2 = 1; count2 < 11; count2++) {
            sum += count2;
        }
        System.out.println(sum);

        sum = 0;
        for (count = 1; count < 11; count++) {
            sum += count;

            System.out.print(count + ((count < 10) ? "+" : "="));}
            System.out.println(sum);
    }
}