package week9_과제5.실습문제;
// _4장_실습문제1
public class TV {
    String company;
    int year;
    int size;

    TV(String company, int year, int size) {
        this.company = company;
        this.year = year;
        this.size = size;
    }

    public void show() {
        System.out.println(company + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }

    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
        myTV.show();
    }
}
