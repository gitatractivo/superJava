package old.second;

public class SearchingRecursive {
    public static void main(String[] args) {
        int[] arr1 = {25, 31, 84, 75, 12, 10, 2, 36, 45, 78};
        System.out.println("Linear:");
        System.out.println(linear(arr1,12,0));
        System.out.println("219303019");
        System.out.println();


        int[] arr2 = {2, 10, 12, 25, 31, 36, 45, 75, 78, 84};
        System.out.println("Binary:");
        System.out.println(binary(arr2,12,0,arr2.length));
        System.out.println("219303019");
        System.out.println();
    }


    static int linear(int[] arr,int target,int i){
        if(arr.length==i){
            return -1;
        }
        if(arr[i]==target) return i;
        return linear(arr,target,i+1);
    }

    static int binary(int[] arr,int target,int s, int e){
        if(s>e) return -1;

        int m = s+(e-s)/2;
        if(target==arr[m])  return m;
        if(target>arr[m]){
            return binary(arr,target,m+1,e);
        }
        return binary(arr,target,s,m-1);

    }

}
