package chap1;

/**
 * If an element in an M*N matrix is 0, its entire row and column are set to 0
 */
public class Q8 {
    public int[][] checkZero(int[][] inputMatrix){
        int i, j;
        int stop_point = 0;
        for (i = 0; i < inputMatrix.length; i++){
            for (j = stop_point; j < inputMatrix[0].length; j++){
                if (inputMatrix[i][j] == 0){
                    inputMatrix = setZero(inputMatrix,i,j);
                    i++;
                    //j++;
                    stop_point++;
                }
            }
        }
        return inputMatrix;
    }

    public int[][] setZero(int[][] inputMatrix, int i, int j){
        int row, col;
        //j unchanged
        for (row = 0; row < inputMatrix.length; row++){
             System.out.println("count row "+row);
            inputMatrix[row][j] = 0;
        }
        //i unchanged
        for (col = 0; col < inputMatrix[0].length; col++){
            System.out.println("count col "+col);
            inputMatrix[i][col] = 0;
        }
        System.out.println("return here");
        return inputMatrix;
    }

    public void printMatrix(int[][] input_matrix, int row_length, int col_length){
        int i, j;
        System.out.println("printing.......");
        for (i = 0; i < row_length; i++){
            for (j = 0; j < col_length; j++){
                System.out.print(input_matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args){
        Q8 q8 = new Q8();
        int[][] inputMatrix = {{0,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        q8.printMatrix(q8.checkZero(inputMatrix), inputMatrix.length, inputMatrix[0].length);
    }
}
