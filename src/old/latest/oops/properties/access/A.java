package old.latest.oops.properties.access;

public class A {
    int num;
    String name;
    int[] arr;

    protected A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
