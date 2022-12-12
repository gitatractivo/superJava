package old.latest.oops.properties.extendemo2.extendemo;

public interface A {
    static String greeting(){
       return "this is good";
    }
    default void fun() {
        System.out.println("I am in A");
    }

}
