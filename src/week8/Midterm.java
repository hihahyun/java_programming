package week8;

public class Midterm {
    public static void main(String[] args) {
        //4
//        int a = Math.random(); System.out.println(a);
//        float b = 12.0; System.out.println(b);
        System.out.println(1/3.0F == 1.0/3);
        System.out.println(1/3.0F);
        System.out.println(1.0/3);
        int c = 5;System.out.println(c++);

        int[] numList;
        // B.[3]
        numList = new int[50];
        getNumbers(numList, 50);
        // B.[4] 확인
        for(int n: numList)
            System.out.print(n + " ");
        System.out.println();

        // B.[5] 확인+ B.[6]
        double avg = getAvg(numList); //System.out.println(avg);

        double dev = 0.0;
        double sum2 = 0.0;
        for(int n: numList)
            sum2 = sum2 + myAbs(n - avg);
        try {
            dev = sum2/numList.length;
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("절대표준편차: " + dev);



    }
    // B.[1]
    public static int rndInt() {
        return -10 + (int) (Math.random() * 21);
    }
    // B.[2]
    public static void getNumbers(int[] data, int n) {
        for(int i = 0; i < n; i++)
            data[i] = rndInt();
    }
    // B.[4]
    public static double myAbs(double n) {
        return (n < 0)?-n:n;
    }
    // B.[5]
    public static double getAvg(int[] data) {
        int sum = 0;
        for(int n: data)
            sum += n;
        return (double)sum/data.length;
    }
}
