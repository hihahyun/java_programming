package week9_과제5.연습문제;

//_4장_연습문제8
//    class Power {
//        public int kick;
//        public int punch;
//    }
//
//    public class Example {
//        public static void main(String[] args) {
//            Power robot = new Power();
//            robot.kick = 10;
//            robot.punch = 20;
//        }
//    }

public class Power {
    private int kick;
    private int punch;

    public int getKick() {
        return kick;
    }

    public void setKick(int kick) {
        this.kick = kick;
    }

    public int getPunch() {
        return punch;
    }

    public void setPunch(int punch) {
        this.punch = punch;
    }

    public static void main(String[] args) {
        Power robot = new Power();
        robot.setKick(10);
        robot.setPunch(20);
    }
}


//class Power {
//    private int kick;
//    private int punch;
//
//    public int getKick() {
//        return kick;
//    }
//
//    public void setKick(int kick) {
//        this.kick = kick;
//    }
//
//    public int getPunch() {
//        return punch;
//    }
//
//    public void setPunch(int punch) {
//        this.punch = punch;
//    }
//}
//
//public class Example {
//    public static void main(String[] args) {
//        Power robot = new Power();
//        robot.setKick(10);
//        robot.setPunch(20);
//    }
//}
