public class PracticeQues {
    public static void occurenceOfNumber(int nums[][], int key) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (key == nums[i][j]) {
                    count++;
                }

            }
        }
        System.out.println(count);

    }

    public static void printSum(int num[][]) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if (i == 1) {
                    sum = sum + num[i][j];
                }
            }
            System.out.println(sum);
        }
    }
    public static void transposeMatrix(int nums[][]){
        
    }
    public static void main(String[] args) {
        int[][] nums = {{4, 7, 8}, {8, 8, 7}};
        int[][] num = { {1,4,9},{11,4,3},{2,2,3} };
        occurenceOfNumber(nums, 7);
        printSum(num);
    }
}
