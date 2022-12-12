package two.oops.avl;

public class random {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        String s = "10";
        int c =10;
        Integer.parseInt(s);
        System.out.println(a + " " + b);
    }
    public static void swap(Integer a , Integer b){
        Integer temp = a;
        a= b;
        b= a;
        System.out.println(a + " " + b);
    }
}
