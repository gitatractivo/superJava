package two.oops.exceptionHandling;

public class Demo {


//    public static void main(String[] args) throws Exception{
////        Main.divide(3,0);
////        System.out.println(3/0);
//        Integer a =10;
//        Integer b = 20;
//        swap(a,b);
//        System.out.println(b);
//    }
//    static void swap(Integer a, Integer b){
//        Integer c= a;
//        a=b;
//        b=c;
//    }
    void display(){
        System.out.println("parent");
    }

}
class B extends Demo{
    void display()throws RuntimeException{
        System.out.println("child");
    }
}
