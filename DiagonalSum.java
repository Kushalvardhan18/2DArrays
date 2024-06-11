public class DiagonalSum {
    public static void sumDiagonal(int[][] matrix) {
        int priSum = 0, secSum=0;
        int n = matrix.length, m = matrix[0].length;
        if (n == m) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (i == j) {
//                        priSum += matrix[i][j];
//                    }
//                    else if (i+j == n-1){
//                        secSum += matrix[i][j];
//                    }
//                }
//            }
            for (int i =0;i<m;i++){
                priSum += matrix[i][i];
                if(i != n-1-i) {
                    secSum += matrix[i][n - 1 - i];
                }
            }

            System.out.println("The sum of primary diagonal : " + priSum);
            System.out.println("The sum of secondary diagonal : " + secSum);
        }
        System.out.println("Total sum of diagonals is : "+ (priSum+secSum));
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11,}};
        sumDiagonal(matrix);
    }
}
