package two.oops;

public class A {
    final int a ;
    static int b;
    private int c;
//    static class B{
//        B(){
//            System.out.println(a);
//        }
//    }
//    static int count=0;
//     int id;
//
//    public A() {
//        this.id= count++;
//    }
//
//    public static void main(String[] args) {
//        A good = new A();
//    }
//
//    public void show(){
//        System.out.println("show");
//        display();
//    }
//    public void display(){
//        System.out.println("display");
//    }
//
//    public void finalize(){
//        System.out.println(this.id + " object destroyed");
//    }

//    public static void main(String[] args) {
//        A object = new A();
//        object.greeting();
//    }
//    static{
//        a=15;
//    }
    public A(){
        a=10;
    }


    public A greeting(){

        return this;    }


}
