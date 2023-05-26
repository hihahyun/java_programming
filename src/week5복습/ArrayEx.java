package week5복습;

public class ArrayEx {
    public static void main(String[] args) {
        int [] intArray = {1,2,3,4,5};

        int [] intArray2 = new int[100];
        for(int i=0; i<intArray2.length; i++){
            intArray2[i] =(int) Math.round(Math.random()*50);
        }

        for(int n : intArray2)
            System.out.println(n);

        int MinNo = Integer.MIN_VALUE;
        for(int n : intArray2) {
            if (n > MinNo){
                MinNo=n;
            }
        } System.out.println(MinNo);

    }
}
