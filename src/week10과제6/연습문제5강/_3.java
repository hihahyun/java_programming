package week10과제6.연습문제5강;

//5장 연습문제 3번
//상속을 이용하여 다음 클래스들을 간결한 구조로 재작성하라.

public class _3 {
//    class SharpPencil { //샤프펜슬
//         private int width;
//         private int amount;
//         public int getAmount() {return amount; }
//        public void setAmount(int amount) { this.amount = amount;}
//    }
//
//    class Ballpen{ //볼펜
//        private int amount;
//        private String color;
//        public int getAmount() {return amount;}
//        public void setAmount(int amount) {this.amount = amount;}
//        public String getColor() {return color;}
//        public void setColor(String color) {this.color = color;}
//    }
//
//    class FountainPen { //만년필
//        private int amount;
//        private String color;
//        public int getAmount(){ return amount; }
//        public void setAmount(int amount) {this.amount = amount; }
//        public String getColor() {return color;}
//        public void setColor(String color) {this.color = color; }
//        public void refill(int n) {amount = n;}
//    }

    class Ballpen{ //볼펜
        private int amount;
        private String color;
        public int getAmount() {return amount;}
        public void setAmount(int amount) {this.amount = amount;}
        public String getColor() {return color;}
        public void setColor(String color) {this.color = color;}
    }

    class FountainPen extends Ballpen{ //만년필
        public void refill(int n) {setAmount(n);}
    }
}
