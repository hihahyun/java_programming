package week4_2;

/*
  정수의 음수 표기는 2'complement 방식으로 표시함.
  https://kevinkim95-dev.tistory.com/3
 */

public class a_TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;

        System.out.println(b+i);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0x12340041);
        System.out.println((byte)(b+i));
        byte b2 = (byte) (b+i);
        System.out.println(Integer.toBinaryString(b + i)); // 1110 0011  2's complement의 표기
        /*
          1110 0011 -> MSB 제거 -> 110 0011 -> 1빼기 -> 110 0010 ->
          반전(0->1, 1->0) -> 001 1101 -> 16+8+4+1 = 29 -> MSB가 1이므로 음수 표기 -> -29
         */
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }

}
