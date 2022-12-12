package old.old;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class noOfSteps {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num){
        return helper(num, 0);
    }
    public static int helper(int n , int c){
        if(n==0){
            return c;
        }
        else if(n%2==0){
            return helper(n/2,c+1);
        }
        return helper(n-1,c+1);
    }
}
