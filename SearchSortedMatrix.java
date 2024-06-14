public class SearchSortedMatrix {
    public static void searchMatrix(int[][] matrix, int key) {
//        BruteForce :-----> (linear Search)
        int n = matrix.length ;
        int m = matrix[0].length ;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (key == matrix[i][j]) {
//                    System.out.println("Key found at:(" + i + "," + j + ")");
//                }
//            }
//        }

//        Another way:------>(Binary Search)
//        Another way (staircase search)
        int i =0, j=m-1;
      while(i<n  && j>=0){
          if(matrix[i][j] == key ){
              System.out.println("Key found at : (" + i +","+ j+ ")");
              return;
          }else if( matrix[i][j] > key ){
              j--;
          }else if(matrix[i][j] <key  ){
              i++;
          }
      }
        System.out.println("Key not found");
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        searchMatrix(matrix, 15);
    }

}