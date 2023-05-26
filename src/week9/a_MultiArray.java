package week9;

public class a_MultiArray {
    public static void main(String[] args) {
        // 다음 진행 과정을 stack, heap을 통해 다시 설명할 것.
        // 1. 선언되 배열에 같은 타입의 생성된 배열 객체 대입 가능
        String[] students = initializeStudents();
        for (String s:students) {
            System.out.println(s);
        }
        // 2. 메소드를 통해 배열의 일부 내용 수정 가능
        modifyStudents(students, 1, "박진영");
        for (String s:students) {
            System.out.println(s);
        }
        // initializeData 메소드 사용 시의 문제점 설명

        // 3. 1차원 배열로 구현 시 어려움 설명.
        String[] courseNames = {"Java", "Python"};
        int[] javaRecord = {90,75, 85};
        int[] pythonRecord = {78, 66, 100};
        // ... 모든 과목을 1차원 배열의 표현 비현실적임. 과목의 수는 유동적.

        /*  2차원 배열 설명. 이는 다차원 배열로 확장 가능 */
        // 1. 선언과 동시에 배열 초기화 가능 - 의미 그림으로 설명
        int[][] academicRecord = {{90, 78},
                {75, 66},
                {85, 100}};
        // 2. 선언과 배열 초기와 분리는 불가능
//        int[][] academicRecord2;
//        academicRecord2 = { {10, 20}, {20, 30}};

        // 3. academicRecord[0]의 의미는?
        System.out.println(academicRecord.length);
        System.out.println(academicRecord[0].length);
        System.out.println(academicRecord[0]);  // 주소 값이 출력

        // 4. academicRecord[0] - 이는 배열 즉 김동현 학생의 성적을 출력.
        for(int n: academicRecord[0])
            System.out.print(n + " ");
        System.out.println();

        // 5. 모든 학생의 "python" 성적 구하기.
        for(int i = 0; i < academicRecord.length; i++)
            System.out.print(academicRecord[i][1] + " ");
        System.out.println("\n");

        // 6. 모든 학생의 과목 성적 출력 - 표 형태로 출력
        // 우선 표의 헤더(과목명) 출력
        System.out.print("       ");
        for(String s: courseNames)
            System.out.printf("%7s", s);  // c언어 printf의 구조와 동일.
        System.out.println();

        // 학생 명과 학생의 성적 출력
        for (int i = 0; i < students.length; i++){  // academicRecord.length 비교 가능
            System.out.printf("%s", students[i]);
            for (int j = 0; j < academicRecord[i].length; j++)
                System.out.printf("%7d", academicRecord[i][j]);
            System.out.println();
        }
    }
    public static String[] initializeStudents(){
        String[] temp = {"김동현", "홍예지", "조자영"};
        return temp;
    }
    public static void modifyStudents(String[] students, int no, String newName)
    {
        students[no] = newName;
    }
/* call by value이므로 매개변수 값이 변경되지 않음. 이 방법 불가능
    public static void initializeData(String[] studNames, String[] coNames, int[][] data){
        String [] data1 = {"김동현", "홍예지", "조자영"};
        String [] data2 = {"Java", "Python"};
        int [][] data3 = { {90, 78}, {70, 66}, {90, 100} };
        studNames = data1;
        coNames = data2;
        data = data3;
    }
*/
}
