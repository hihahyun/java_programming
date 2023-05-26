package week3복습;

public class forEx {
    public static void main(String[] args) {

    //1부터 10까지 숫자 입력
    for(int i=1; i<11; i++){
        System.out.println(i);
    }

    //1부터 10까지 수의 합
    int sum = 0;
    for(int i=0; i<=10; i++){
        sum = sum+i;
        System.out.println(sum);
    }
        System.out.println(sum);

    //1부터 10까지의 짝수의 합
    sum = 0;
    for(int i=0; i<=10; i++){
        if(i%2==0){
            sum = sum + i;
            System.out.println(sum);
        }
    }
        System.out.println(sum);
}
}