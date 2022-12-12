package two.oops.exceptionHandling;

public class NewEx extends Exception{
    public NewEx(String message){
        super(message);
        System.out.println("exception");
    }
}
