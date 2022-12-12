package old.old;

public class no1 {
    public static void main(String[] args) {
        int n = 5;
        func(5);
    }
    static void func(int n){
        if(n==0){
            return;
        }
        func(n-1);
        System.out.println(n);

    }
}
