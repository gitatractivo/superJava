package old.second.b;
import java.util.Arrays;

public class sortRecursion {
    public static void main(String[] args) {
        int[] arr = {1,5,8,3,7,9};
        System.out.println(Arrays.toString(bubleSort(arr)));
    }

    static int[] bubleSort(int[] arr) {
        return sort1(arr,arr.length,0);
    }

    private static int[] sort1(int[] arr, int r,int c) {
        if (r==0) return arr;
        else if(c+1<r) {
            if(arr[c+1]<arr[c]){
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            sort1(arr,r,++c);
        }
        else{

            sort1(arr,--r,0);
        }
        return arr;
    }
    static int[] selection(int[] arr) {
        return sort2(arr,arr.length,0);
    }

    private static int[] sort2(int[] arr, int r,int c) {
        if (r==0) return arr;

        return arr;
    }


}
