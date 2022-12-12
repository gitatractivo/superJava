package two.oops.assignm;

public class stat {
    public static int one = 10;
    public int two ;
    static {
        System.out.println("From static block");
    }
    public stat(int two) {
        this.two = two;
    }
    public static void fun(){
        System.out.println("from fun");
    }
    public void greeting(){
        System.out.println("from greeting");
    }
    public static void main(String[] args) {
        stat a = new stat(20);
        stat b = new stat(15);
        a.one++;
        System.out.println(b.one);
        fun();//can access static method inside of a static context
        //greeting() //we cannot call non static method inside static context
        a.greeting();//but we can use use non static method using object of that class
    }
}
