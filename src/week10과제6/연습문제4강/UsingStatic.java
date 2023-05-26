package week10과제6.연습문제4강;
class StaticSample {
    public int x;
    public static int y;
    public static int f( ) {return y; }
}

public class UsingStatic {
    public static void main(String[] args) {
        StaticSample b = new StaticSample();
        b.x = 5;
       // StaticSample.x = 5;
        StaticSample.y = 10;
        int tmp = StaticSample.f( );
        StaticSample a = new StaticSample();
        tmp = a.y;

    }
}
