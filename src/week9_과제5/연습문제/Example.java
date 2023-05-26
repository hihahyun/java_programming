package week9_과제5.연습문제;

// 4장 연습문제 7번
//public class Example {
//
//    static class Person {
//        private int age;
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//    }
//
//    public static void main(String[] args) {
//        Person aPerson = new Person();
//        aPerson.setAge(17);
//    }
//}


public class Example {
    static class Power {
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
    }

    public static void main(String[] args) {
        Power robot = new Power();
        robot.setKick(10);
        robot.setPunch(20);
    }
}


