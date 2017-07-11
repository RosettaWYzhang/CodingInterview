package chap1;
/**
 * Rotate a n*n matrix by 90 degree clockwise
 * Do this in place?
 */
public class Q7 {

    public int[][] rotate(int[][] original, int matrix_length){
        int i, j;

        //initialise the transformed matrix
        int[][] transformed = new int[matrix_length][matrix_length];

        for (i = 0; i < matrix_length; i++){
            for (j = 0; j < matrix_length; j++){
                transformed[j][matrix_length - i - 1] = original[i][j];
            }
        }


        return transformed;
    }

    public void printMatrix(int[][] input_matrix, int matrix_length){
        int i, j;
        System.out.println("printing.......");
        for (i = 0; i < matrix_length; i++){
            for (j = 0; j < matrix_length; j++){
                System.out.println(input_matrix[i][j]);

            }
        }

    }

    public static void main(String[] args){
        Q7 q7 = new Q7();
        int[][] original = {{1,2,3}, {4,5,6}, {7,8,9}};
        int matrix_length = 3;


        q7.printMatrix(original, matrix_length);
        int[][] transformed = q7.rotate(original, matrix_length);
        q7.printMatrix(transformed, matrix_length);


    }
}
