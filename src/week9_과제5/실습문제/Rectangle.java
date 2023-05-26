package week9_과제5.실습문제;
// _4장_실습문제4
public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void show() {
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }

    int square() {
        int size = width * height;
        return size;
    }

    boolean contains(Rectangle r) {
        if ((this.x < r.x) && (this.x + this.width > r.x + r.width) &&
                (this.y < r.y) && (this.y + this.height > r.y + r.height)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if (t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
