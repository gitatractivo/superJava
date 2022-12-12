package two.oops;

public class oopsClass {
    public static void main(String[] args) throws Exception{

//        int[] arr={1,2,3,0,4,0,5,6};
//        int k = 10;
//        for (int i = 0; i < arr.length; i++) {
//            try{
//                System.out.println(k/arr[i] + "  "+i);
//            }
//            catch(ArithmeticException e){
//                e.printStackTrace();
//                System.out.println( );
//            }
//        }
        Distance a = new Distance(5,7);
        Distance b = new Distance(6,8);
        Distance c = Distance.add(a,b);
//        c.add(a,b);
        System.out.println(c);
    }
}
