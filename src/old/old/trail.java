package old.old;

import java.util.Scanner;
public class trail {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();


        for (int i = 0; i < k; i++) {

            int input = in.nextInt();
            int c = 5;
            int count = 0;
            while ((input / c) > 0) {
                count = count + (input / c);
                c *= 5;
            }
            System.out.println(count);
        }

    }
}
