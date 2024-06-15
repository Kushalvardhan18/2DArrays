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

 

    public static void main(String[] args) {
        int[][] nums = {{4, 7, 8}, {8, 8, 7}};
        occurenceOfNumber(nums, 7);
        printSum(nums);
    }
}
