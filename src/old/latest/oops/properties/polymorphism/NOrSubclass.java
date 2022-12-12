package old.latest.oops.properties.polymorphism;

import old.latest.oops.properties.access.A;

public class NOrSubclass extends A {


    public NOrSubclass(int num, String name) {
        super(num, name);

    }

    public static void main(String[] args) {
        NOrSubclass obj = new NOrSubclass(10,"j");
//        int b =obj.num;
    }
}
