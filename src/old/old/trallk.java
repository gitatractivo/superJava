package old.old;

import java.util.Scanner;

public class trallk {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long number=input.nextLong();
        long count=0;
        count=number%5;
        for(long j=1 ;j<number;j++)
        {
            if(number==Math.pow(5,j))
            {
                count++;
            }
        }
        System.out.println(count-1);

    }

}