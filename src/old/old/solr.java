package old.old;

import java.util.Scanner;

public class solr {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a-b ;
        if (c%10 >  5){
            c--;
        }
        else {
            c++;
        }
        System.out.println(c);
    }
}
