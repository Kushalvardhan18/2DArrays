public class DiagonalSum {
    public static void sumDiagonal(int[][] matrix) {
        int priSum = 0, secSum=0;
        int n = matrix.length, m = matrix[0].length;
        if (n == m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == j) {
                        priSum += matrix[i][j];
                    }
                    if (i+j == n-1){
                        secSum += matrix[i][j];
                    }
                }
            }
            System.out.println("The sum of primary diagonal : " + priSum);
            System.out.print("The sum of secondary diagonal : " + secSum);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        sumDiagonal(matrix);
    }
}
