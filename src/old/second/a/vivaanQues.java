package old.second.a;

public class vivaanQues {
    public static void main(String[] args) {
//        int n = 5;
//        Scanner in = new Scanner(System.in);
//        int T = in.nextInt();
//        for (int i = 0; i < T; i++) {
//            int num = in.nextInt();
//            System.out.println("Case #" + i+1 + ": "+nine(num));
//        }
        System.out.println(nine(26));
    }

    static int nine(int n){

        int[] ans = number(n,0,0);
        if(ans[2]%9==0)return n;


        int m = 9-(ans[2]%9);
        String str = Integer.toString(n);
        int i=0,p=0;
        int s=0;
        boolean used =false;
        while(i<str.length()){
            int k =(Character.getNumericValue(str.charAt(str.length()-1-i)));
            if(m>=(k)){
                s=s+m*((int)Math.pow(10,p));
                p++;
                used=true;
                break;

            }
            else{
                s=s +(k)*((int)Math.pow(10,p));
                i++;
            }
            p++;

        }
        while(i<str.length()){
            int k =(Character.getNumericValue(str.charAt(str.length()-1-i)));
            s=s +(k)*((int)Math.pow(10,p));
            i++;
            p++;
        }
        if(used==false)   s=s+m*((int)Math.pow(10,p));


        return s;
    }
    static int[] number(int n, int count , int sum){
        sum+=(n%10);

        if(n/10==0) return new int[] {n,++count,sum};
        return number(n/10,++count,sum);
    }
}
