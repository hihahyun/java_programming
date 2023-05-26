package week9;

/*
   1. 2차원 배열의 행 별 평균 구하기
   2. 2차원 배열의 열 별 평균 구하기
 */

public class d_MultiArrayEx {
    public static void main(String[] args) {
        int[][] data = {{52, 37, 90, 100},
                {42, 77, 30, 85},
                {15, 93, 20, 75}};

        double[] rowAvg = {0, 0, 0};
        double[] colAvg = {0, 0, 0, 0};
        int sum = 0;
        int rowCount = data.length;
        int colCount = data[0].length;

        for(int i = 0; i < rowCount; i++){
            for(int j = 0; j < colCount; j++)
                sum += data[i][j];
            rowAvg[i] = sum/(double)colCount;
//            System.out.println(rowAvg[i]);
            sum = 0;
        }

        sum = 0;
        for(int j = 0; j < colCount; j++){
            for(int i = 0; i < rowCount; i++)
                sum = sum + data[i][j];
            colAvg[j] = sum/(double) rowCount;
            System.out.println(colAvg[j]);
            sum = 0;
        }

    }
}
