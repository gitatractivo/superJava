package two.oops;

public class random {
    int a = 10;
    public static void main(String[] args) {
//        final int a = fun();
//        print(4, 1,0);
        float a = 300f;
        System.out.println(a);

    }
    static int fun(){
        return 10;
    }
    static void print(int n, int r,  int c){
        if(r==n+1) return;
        if(c==r) {
            System.out.println();
            print(n,r+1,0);
            return;

        }
        System.out.print(c+1 + "\t");
        print(n,r,c+1);
    }

}

