package one.prac.rec;

public class _1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    static int numberOfSteps(int num){
        if (num == 0) return 0;
        if (num%2==0) return numberOfSteps(num/2)+1;
        return numberOfSteps(num-1)+1;
    }
}
