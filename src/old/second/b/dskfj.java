package old.second.b;
import java.util.Scanner;
public class dskfj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int C = in.nextInt();

        int A= in.nextInt();
        int B = in.nextInt();
        check(R,C,A,B);

    }
    static void check(int R ,int C, int A , int B){
        int redcount = 0;
        int temp = redcount;
        for (int i = 0; i < R; i++) {
            for (int k = 0; k < A; k++) {
                for (int l = 0; l < C; l++) {
                    for (int m = 0; m <B ; m++) {
                        if (redcount%2==0){
                            System.out.print("X");
                        }else {
                            System.out.print(".");
                        }
                    }redcount++;
                }
                System.out.println();
            }redcount = temp +1;

        }

    }

}
