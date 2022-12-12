package old.old;

import java.util.Scanner;
public class chefAndNotebook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i =0 ; i< t ; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int k = in.nextInt();
            int n = in.nextInt();
            int count =0;

            for(int j= 0; j<n ; j++){
                int p = in.nextInt();
                int c = in.nextInt();

                if(c<=k && p>=(x-y)){
                    count++;
                }

            }
            if(count>0){
                System.out.println("LuckyChef");
            }
            else{
                System.out.println("UnluckyChef");
            }

        }
    }
}
