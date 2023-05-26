package week3_1;

public class StaticPublicTest {
    /*
    static, public, private 의 의미 + 차이점 설명
    static : 객체 생성 없이 사용 가능
    public : 누구나 사용 가능
    private : 동일 클래스의 메소드에서만 사용 가능

    입력 system.in (system클래스의 in필드 -> public static o)
    출력 system.out
     */
        public static int num = 100; //private으로 변경시 어떤 문제가 생기는가? 다른 곳에선 작동하지 않는다.

        public static void main(String[] args) {
            int n = num;
            System.out.println(n);

            printDummy();

            //printDummy2를 사용하려면 객체 생성 필요
            StaticPublicTest spt = new StaticPublicTest();
            spt.printDummy2();
        }

        public static void printDummy(){
            System.out.println("printDummy is printed.");
        }
        public void printDummy2(){
            System.out.println("printDummy2 is printed.");
        }
    }

