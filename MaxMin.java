import java.util.Scanner;

public class MaxMin {
    public static int largestNum(int num[][]){
        int large = Integer.MIN_VALUE;
        for (int i =0;i<num.length;i++){
            for (int j=0;j<num[0].length;j++){
                if (large < num[i][j]){
                    large = num[i][j];
                }
            }
        }
            System.out.println("Maximum Number :"+ large );
            return large;
    }  public static int smallestNum(int num[][]){
        int small = Integer.MAX_VALUE;
        for (int i =0;i<num.length;i++){
            for (int j=0;j<num[0].length;j++){
                if (small >num[i][j]){
                    small = num[i][j];
                }
            }
        }
            System.out.println("Minimum number :"+small );
            return small;
    }
    public static void main(String[] args){
        int [][] num = new int [3][3];
        int n = num.length,m = num[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
                num[i][j] = sc.nextInt();

            }

        }for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        largestNum(num);
        smallestNum(num);
    }
}
