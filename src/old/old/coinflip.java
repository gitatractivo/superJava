package old.old;

import java.util.Scanner;
public class coinflip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for(int z= 0; z<t ; z++){
            int g = in.nextInt();
            for(int j = 0; j< g ; j++){
                int i = in.nextInt();
                int n = in.nextInt();
                int q = in.nextInt();
                int o = 0;

                if(i==q){
                    o = n/2;
                }
                else{
                    o= (n+1)/2;
                }
                System.out.println(o);
            }
        }
    }
}
