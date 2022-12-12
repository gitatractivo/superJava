package two.oops.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            System.out.println(a/b);
            divide(a,b);
        }  catch(ArithmeticException e){
//            System.out.println(e.getMessage()                                                                                                       );
//            e.printStackTrace();
            System.out.println("new Error");
            throw new ArithmeticException("one more");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will still run");
        }
        System.out.println("hello");

    }
     static int divide (int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by zero");
        }

        return a/b;
    }
}
