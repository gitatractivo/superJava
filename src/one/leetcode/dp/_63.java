package one.leetcode.dp;

public class _63 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println(uniquePathsWithObstacles(matrix));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        for(int i =0;i<m;i++ ){
            int[] temp = new int[n];

            for(int j =0;j<n;j++ ){
                if(i==0&& j==0) temp[j]=1;
                if(obstacleGrid[i][j]==1) {
                    temp[j]=0;
                    continue;
                }
                temp[j]+=dp[j];
                if(j>0){
                    temp[j]+=temp[j-1];
                }
            }
            dp = temp;
        }
        return dp[n-1];
    }
}
