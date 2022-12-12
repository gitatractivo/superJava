package one.leetcode.strings;

public class sample2 {
    public static void main(String[] args) {
        int n=7,v=0;
        for(int i= 1; i<=n;i++){
            if(i%2!=0)  v=i;
            else v=2*i;
//            v=v+i;
            int c =v;
//            int cont = v;
            for(int j = 0; j<i; j++){
                System.out.print(c--+"   ");
//                cont--;
            }


            System.out.println();
        }
    }
}
