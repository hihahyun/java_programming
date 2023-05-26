package week11과제7._5장_실습문제;

    class Point {
        protected int x;
        protected int y;

        public Point() {
            this.x = 0;
            this.y = 0;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    class PositivePoint extends Point {

        public PositivePoint() {
            super();
        }

        public PositivePoint(int x, int y) {
            super(x, y);
            if (x < 0 || y < 0) {
                super.move(0, 0);
            }
        }

        public void move(int x, int y) {
            if (x >= 0 && y >= 0) {
                super.move(x, y);
            }
        }

        public String toString() {
            return "(" + super.toString() + ")";
        }
    }

    public class _8_ {
        public static void main(String[] args) {
            PositivePoint p = new PositivePoint();
            p.move(10, 10);
            System.out.println(p.toString() + "의 점입니다.");

            p.move(-5, 5);
            System.out.println(p.toString() + "의 점입니다.");

            PositivePoint p2 = new PositivePoint(-10, -10);
            System.out.println(p2.toString() + "의 점입니다.");
        }
    }

}
