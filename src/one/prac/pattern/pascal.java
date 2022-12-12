package one.prac.pattern;

public class pascal {
    public static void main(String[] args) {
        System.out.println(ncr(5,2));
        pascal(6);
    }
    static int factorial(int n){
        if(n<2) return 1;
        return n*factorial(--n);
    }
    static int ncr(int i,int j){
        return factorial(i)/(factorial(j)*factorial(i-j));
    }
    static void pascal(int n){
        for(int i=0; i<n; i++){
            int k=0;
            int j = 0;
            for(;j<n-i-1; j++) System.out.print("  ");
            for(;j<n;j++){
                System.out.print(ncr(i,k++));
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
