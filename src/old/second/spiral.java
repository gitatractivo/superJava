package old.second;

public class spiral {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[] ans = spiral(arr);
    }
    public static int[] spiral(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[] num = new int[m*n];
        row(arr,num,0,0,m,n,0);
        return num;
    }
    public static int[] row(int[][] arr, int[] num , int i,int j, int rowLength, int colLength, int indexNum){
        int[]  temp =funcrow(arr,num, i,j,rowLength,colLength,indexNum);
        if(i==0){
            return col(arr,num,temp[0],temp[1],rowLength,colLength,temp[2]);
        }
        return col(arr,num,temp[0],temp[1],rowLength-1,colLength,temp[2]);

    }
    public static int[] funcrow(int[][] arr, int[] num , int i,int j, int rowLength, int colLength, int indexNum){
        num[indexNum]=arr[i][j];
        if(j==colLength-1){
            return new int[]{i,j,indexNum};

        }
        return funcrow(arr,num, i,j+1,rowLength,colLength,indexNum);
    }

    public static int[] col(int[][] arr, int[] num , int i,int j, int rowLength, int colLength, int indexNum){
        int[]  temp =funcrow(arr,num, i,j,rowLength,colLength,indexNum);

        return row(arr,num,temp[0],temp[1],rowLength,colLength-1,temp[2]);

    }
    public static int[] funccol(int[][] arr, int[] num , int i,int j, int rowLength, int colLength, int indexNum){
        num[indexNum]=arr[i][j];
        if(i==rowLength-1){
            return new int[]{i,j,indexNum};

        }
        return funcrow(arr,num, i+1,j,rowLength,colLength,indexNum);
    }
}
