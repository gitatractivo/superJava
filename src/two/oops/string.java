package two.oops;

public class string {
    public static void main(String[] args) {
        String s = "gitanshu";
        String s1 = "gitanshu";
        String s2 = new String("gitanshu").intern();
        System.out.println(s==s1);
        System.out.println(s==s2);
    }
}