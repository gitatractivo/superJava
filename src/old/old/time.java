package old.old;
import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        char deg = in.next().charAt(0);

        double c;

        if(deg == 'f'){
            c = (t-32)*5/9;
            System.out.println(c + "C");

        }
        else {
            c = (t*9/5)+32;
            System.out.println(c + "F");

        }

    }
}
