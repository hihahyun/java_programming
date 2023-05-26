package week10;
import java.util.Random;

class ComplexNo {
    private static Random rnd;
    private double x, y;

    public ComplexNo(double x, double y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "ComplexNo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static ComplexNo[] genComplexNoList(int n) {
        rnd = new Random();
        ComplexNo[] cnList = new ComplexNo[n];
        for (int i = 0; i < n; i++) {
            ComplexNo temp = new ComplexNo(rnd.nextInt(100),
                    rnd.nextInt(100));
//            System.out.println(temp);
            cnList[i] = temp;
        }
        return cnList;
    }

}

public class ComplexNoEx {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(100);
        int y = rnd.nextInt(100);
        ComplexNo cn = new ComplexNo(x, y);
        System.out.println(cn.toString());

        ComplexNo[] cnList = new ComplexNo[10];
        for (int i = 0; i < cnList.length; i++) {
            cnList[i] = new ComplexNo(rnd.nextInt(100), rnd.nextInt(100));
        }

        for(ComplexNo c : cnList)
            System.out.println(c);

//        ComplexNo[] cList = ComplexNo.genComplexNoList(10);
//        for(ComplexNo c: cList)
//            System.out.println(c);
    }
}
