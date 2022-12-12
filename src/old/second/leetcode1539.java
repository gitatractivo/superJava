package old.second;
import java.util.ArrayList;

public class leetcode1539 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int target = 5;
        System.out.println(missing(arr, target));


    }

    public static int missing(int[] arr, int t) {
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 0;
        for (int i = 0; i <= 4 * arr.length - 1; i++) {
            if ((i + 1) != arr[k]) {
                ans.add(i + 1);

            } else {
                if (k < arr.length - 1) k += 1;
            }
        }

        return ans.get(t - 1);
    }

    public static int missing2(int[] arr, int t) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            int missing = (arr[m] - (m + 1));
            if (t > missing) s = m + 1;
            else e = m - 1;
        }
        return e + t + 1;
    }
}























