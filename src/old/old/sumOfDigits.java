package old.old;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 55555;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n<1){
            return 0;
        }
        return sum(n/10)+ (n%10);
    }
}
