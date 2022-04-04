package previous;

public class Junglee {

    public static void main(String[] args){
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{1,1,0};
        matrix[1] = new int[]{0,1,0};
        matrix[2] = new int[]{0,0,1};
    //    rotate(matrix);
        boolean result = mazeComplete(matrix,0,0);
        System.out.println(result);
    }

    private static void print(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }

    static int[][] rotate(int[][] matrix){
        int m = matrix.length;
        transpose(matrix);
        swapColumns(matrix);
        return matrix;
    }

    private static void swapColumns(int[][] matrix) {
       int n = matrix.length;
       int startColumn = 0;
       int endColumn = n - 1;
       while (startColumn < endColumn){
           for(int i = 0; i < n; i++){
               int temp = matrix[i][startColumn];
               matrix[i][startColumn] = matrix[i][endColumn];
               matrix[i][endColumn] = temp;
           }
           startColumn++;
           endColumn--;
       }

    }

    private static void transpose(int[][] matrix) {
        int m = matrix.length;
        for(int i = 0; i < m;i++){
            for(int j = i + 1; j < m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static boolean mazeComplete(int[][] mat, int i, int j){
        int n = mat.length;
        if(i == n || j == n){
            return false;
        }
        if(mat[i][j] != 1){
            return false;
        }
        if(i == n - 1 && j == n -1){
            return true;
        }
        return mazeComplete(mat, i, j+ 1) || mazeComplete(mat, i + 1, j);

    }
}
