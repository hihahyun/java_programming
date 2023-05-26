package week9_과제5.연습문제;

//4장_연습문제7
//    class person{
//        private int age;
//    }
//
//    public class Example {
//        public static void main(String[] args) {
//            Person aPerson = new Person();
//            aPerson.age = 17;
//        }
//    }

public class Person {
    private int age;
    public void setAge (int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.setAge(17);
    }
}

//class Person {
//    private int age;
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//
//public class Example {
//    public static void main(String[] args) {
//        Person aPerson = new Person();
//        aPerson.setAge(17);
//    }
//}

