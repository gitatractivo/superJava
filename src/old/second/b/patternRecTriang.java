package old.second.b;

public class patternRecTriang {
    public static void main(String[] args) {
        int n = 4;
        triag(n);
        System.out.println();
        System.out.println();
        System.out.println();
        triag2(n);
        System.out.println();
        System.out.println();
        System.out.println();
        triag3(n);
    }
    public static void triag(int n){
        if(n==0) return;
        col(n);
        System.out.println();
        triag(--n);
    }
    public static void col(int n){
        if(n==0) return;
        System.out.print("* ");
        col(--n);
    }

    public static void triag2(int n){
        col2(n,0);
    }
    public static void col2(int r, int c){
        if (r==0) return;
        if(c<r) {
            System.out.print("* ");
            col2(r,++c);
        }
        else{
            System.out.println();
            col2(--r,0);
        }
    }
    public static void triag3(int n){
        col3(n,0);
    }
    public static void col3(int r, int c){
        if (r==0) return;
        if(c<r) {
            col3(r,++c);
            System.out.print("* ");
        }
        else{
            col3(--r,0);
            System.out.println();
        }
    }

}
