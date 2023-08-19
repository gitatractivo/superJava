package one.leetcode.twoPointer;

public class _832 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        array = flipAndInvertImage(array);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length, n = image[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m/2;j++){
                int temp = image[i][j];
                image[i][j]=image[i][n-j-1];
                image[i][n-j-1]=temp;




            }
            for (int j = 0; j < n; j++) {
                image[i][j]^=1 ;
            }
        }
        return image;
    }
}
