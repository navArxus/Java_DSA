public class Set_matrix_zeores_73 {

    public static void convertMatrix(int[][] matrix, int row, int col) {
        // Up
        for (int i = row; i >= 0; i--) {
            matrix[i][col] = 0;
        }
        // Down
        for (int i = row + 1; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
        // Left
        for (int i = col; i >= 0; i--) {
            matrix[row][i] = 0;
        }
        // Right
        for (int i = col + 1; i < matrix.length; i++) {
            matrix[row][i] = 0;
        }
    }

    public static void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int colIndex = 0; colIndex < matrix[0].length; colIndex++) {
                if (matrix[rowIndex][colIndex] == 0) {
                    row[rowIndex] = 1;
                    col[colIndex] = 1;
                }
            }

        }
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                for (int j = 0; j < col.length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < col.length; i++) {
            if (col[i] == 1) {
                for (int j = 0; j < row.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }

    public static void printBoard(int[][] board) {
        System.out.println("---------- Board ----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        // convertMatrix(matrix, 1, 1);
        setZeroes(matrix);
        printBoard(matrix);
    }

}