package one.prac.pattern;

public class random {
    public static void main(String[] args) {
        random(10);

//        _22kunal(10);
    }

    public static void random(int n){
        int a=1,in=1,b=0;
        for (int i = 0; i < n; i++) {
            int c=a;
            for (int j = 0; j < i+1; j++) {
                System.out.print(c + " ");
                c+=2;
            }
            System.out.println();
            a+=in;
            if(b==0)    b=1;
            else if(b==1){
                b=0;
                in+=2;
            }
        }
    }
    public static void _22kunal(int n){
        int a=1;
        for (int i = 0; i < n; i++) {
            int c=a;
            for (int j = 0; j < i+1; j++) {
                System.out.print(c + " ");
                if(c==1)    c=0;
                else    c=1;
            }
            System.out.println();
            if(a==1)    a=0;
            else    a=1;
        }
    }

}
