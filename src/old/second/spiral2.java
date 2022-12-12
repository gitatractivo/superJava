package old.second;

import java.util.ArrayList;
import java.util.List;

public class spiral2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        List<Integer> ans =  spiral2(arr);
        String list = ans.toString();
        System.out.println("String: " + list);
    }
    public static List<Integer> spiral2(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;
        List<Integer> num= new ArrayList<Integer>(m*n);
        row(arr,num,0,0,0,m,n);

        return num;

    }
    public static List<Integer> row(int[][] arr, List<Integer> num , int i, int j,int in , int r,int c){
        int m = arr.length;
        int n = arr[0].length;
        if(in==m*n)
            return num;

        int temp=0 ;
        if(i==0){
            int count=0;
            for(int k=j; k<=n;k++){
                num.add(arr[i][k]);
                temp = k;
                ++in;
                count++;
                if(count==c)
                    break;
            }
        }


        else if(i<(m+1)/2){
            int count=0;
            for(int k=j+1; k<=n;k++){
                num.add(arr[i][k]);
                temp = k;
                ++in;
                count++;
                if(count==c-1)
                    break;
            }
        }
        else{
            int count=0;
            for(int k=j-1; k>=0;k--){
                num.add(arr[i][k]);
                temp = k;
                ++in;
                count++;
                if(count==c-1)
                    break;
            }
        }
        j=temp;
        if (i == 0) {
            return col(arr,num,i,j,in,r,c);
        }

        return col(arr,num,i,j,in,r,--c);
    }
    public static List<Integer> col(int[][] arr, List<Integer> num , int i, int j,int in , int r,int c){
        int m = arr.length;
        int n = arr[0].length;
        if(in==m*n)
            return num;
        int temp=0 ;

        if(j<n/2){
            int count=0;
            for(int k=i-1; k>=0;k--){
                num.add(arr[k][j]);
                temp = k;
                ++in;
                count++;
                if(count==r-1)
                    break;
            }

        }
        else{
            int count=0;
            for(int k=i+1; k<=m;k++){
                num.add(arr[k][j]);
                temp = k;
                ++in;
                count++;
                if(count==r-1)
                    break;
            }

        }

        i=temp;
        return row(arr,num,i,j,in,--r,c);
    }
}


//    public static int[] spiral (int[][] arr){
//        int m = arr.length;
//        int n = arr[0].length;
//        int[] num = new int[m*n];
//        row(arr,num,0,0,0,m,n);//row and col length , start index row , start index col, start index
//
//        return num;
//
//    }
//    public static int[] row(int[][] arr, int[] num , int i, int j,int in , int r,int c){
//        if(in==num.length)
//            return num;
//        int m = arr.length;
//        int n = arr[0].length;
//        int temp=0 ;
//        if(i==0){
//            int count=0;
//            for(int k=j; k<=n;k++){
//                num[in]=arr[i][k];
//                temp = k;
//                ++in;
//                count++;
//                if(count==c)
//                    break;
//            }
//        }
//
//
//        else if(i<(m+1)/2){
//            int count=0;
//            for(int k=j+1; k<=n;k++){
//                num[in]=arr[i][k];
//                temp = k;
//                ++in;
//                count++;
//                if(count==c-1)
//                    break;
//            }
//        }
//        else{
//            int count=0;
//            for(int k=j-1; k>=0;k--){
//                num[in]=arr[i][k];
//                temp = k;
//                ++in;
//                count++;
//                if(count==c-1)
//                    break;
//            }
//        }
//        j=temp;
//        if (i == 0) {
//            return col(arr,num,i,j,in,r,c);
//        }
//
//        return col(arr,num,i,j,in,r,--c);
//    }
//    public static int[] col(int[][] arr, int[] num , int i, int j,int in , int r,int c){
//        if(in==num.length)
//            return num;
//        int m = arr.length;
//        int n = arr[0].length;
//        int temp=0 ;
//
//        if(j<n/2){
//            int count=0;
//            for(int k=i-1; k>=0;k--){
//                num[in]=arr[k][j];
//                temp = k;
//                ++in;
//                count++;
//                if(count==r-1)
//                    break;
//            }
//
//        }
//        else{
//            int count=0;
//            for(int k=i+1; k<=m;k++){
//                num[in]=arr[k][j];
//                temp = k;
//                ++in;
//                count++;
//                if(count==r-1)
//                    break;
//            }
//
//        }
//
//        i=temp;
//        return row(arr,num,i,j,in,--r,c);
//    }
//}


