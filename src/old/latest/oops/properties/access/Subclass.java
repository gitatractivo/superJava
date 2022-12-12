package old.latest.oops.properties.access;

public class Subclass extends A {


    public Subclass(int num, String name) {
        super(num, name);

    }

    public static void main(String[] args) {
        A obj = new Subclass(10,"j");
        int b =obj.num;
    }
}
