package two.dp;

public class countPaths {
    public static void main(String[] args) {
        System.out.println(countPathsTabulation(11));
    }
    public static int countPathsTabulation(int n){
        int[] arr = new int[n+1];
        arr[0]=1;
        for (int i = 1; i <= n; i++) {
            if(i==1){
                arr[i]=arr[i-1];
                continue;
            }
            if(i==2){
                arr[i]=arr[i-1]+arr[i-2];
                continue;

            }
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];

        }
        return arr[n];

    }
}
