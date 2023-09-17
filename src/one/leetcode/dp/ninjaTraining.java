package one.leetcode.dp;

public class ninjaTraining {
    public static void main(String[] args) {
        int[][] matrix = {
                {73, 57, 31},
                {61, 30, 34},
                {87, 64, 41},
                {9, 69, 12},
                {33, 22, 62},
                {8, 15, 59},
                {74, 74, 51},
                {72, 5, 62},
                {23, 72, 93}
        };
        System.out.println(ninjaTraining(matrix.length, matrix));
    }
    public static int ninjaTraining(int n, int arr[][]) {
        int l = -1; // Index of the first maximum element
        int m = -1; // Index of the second maximum element

        int max1 = Integer.MIN_VALUE; // First maximum element
        int max2 = Integer.MIN_VALUE; // Second maximum element


        for(int j = 0; j<n;j++){
            for (int i = 0; i < 3; i++) {
                if(j==0) break;
                if(i==l) arr[j][i]+=arr[j-1][m];
                else arr[j][i]+=arr[j-1][l];
            }
            l = -1; // Index of the first maximum element
            m = -1; // Index of the second maximum element

            max1 = Integer.MIN_VALUE; // First maximum element
            max2 = Integer.MIN_VALUE; // Second maximum element

            for (int i = 0; i < 3; i++) {
                if (arr[j][i] > max1) {
                    max2 = max1;
                    max1 = arr[j][i];
                    m = l;
                    l = i;
                } else if (arr[j][i] > max2 && arr[j][i] != max1) {
                    max2 = arr[j][i];
                    m = i;
                }
            }
        }
        return arr[n-1][l];
    }
}
