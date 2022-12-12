package two.oops;
import java.util.Arrays;
public class twoDIregular {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40,50,150},
                {3,6,9,12,15,18,21,24},
                {5,10,15,30},
                {2,4,6,8,10,12,42},
                {1,1}};
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            int rsum=0;
            for (int j = 0; j < arr[i].length; j++) {
                rsum+=arr[i][j];
            }
            arr[i]=Arrays.copyOf(arr[i],arr[i].length+1);
            arr[i][arr[i].length-1]=rsum;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
