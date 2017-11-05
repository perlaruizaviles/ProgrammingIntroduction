package solutions.matrices;

/**
 * Created by pruiz on 11/4/17.
 */
public class Sum {

    public static void main(String[] args) {

        int[][] matrix1 = {{1,2,3},{2,3,4},{5,6,7}};
        int[][] matrix2 = {{1,2,3},{2,3,4},{5,6,7}};
        int[][] resultMatrix  = new int [3][3];

        for (int i = 0 ; i < matrix1.length ; i++){

            for (int j = 0 ; j < matrix1[i].length ; j++){

                int result = matrix1[i][j] + matrix2[i][j];
                resultMatrix[i][j] = result;
            }

        }

    }

}
