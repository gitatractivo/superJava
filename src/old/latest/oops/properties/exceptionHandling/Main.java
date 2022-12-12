package old.latest.oops.properties.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
           String name = "kunal";
           if (name.equals("kunal")){
               throw new MyException("name is kunal");
           }

        }
        catch(NewException e){
            System.out.println(e.getMessage());
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("normal");
        }
        finally {
            System.out.println("this will still run");
        }
    }

     static int divide (int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by zero");
        }

        return a/b;
    }
}
