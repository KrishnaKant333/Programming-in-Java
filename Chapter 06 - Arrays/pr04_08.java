public class pr04_08 {
    public static void main(String[] args) {
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{16, 3, 5},
                         {0, 8, 8}};
        int [][] matr = {{0, 0 ,0},
                         {0, 0 ,0}};

        for(int i = 0; i<mat1.length; i++) {
            for(int j = 0; j<mat1[i].length; j++) {
                matr[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}