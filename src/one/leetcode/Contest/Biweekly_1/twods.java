package one.leetcode.Contest.Biweekly_1;

public class twods {
    public static void main(String[] args) {
        System.out.println(isReachableAtTime(1,1,1,2,0));
    }
    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
//        if(ans<0) return false;

        int ans = 0;



        if(sx!=fx)  ans+=(fx-sx-1);
        System.out.println(ans);


        if(sy!=fy) ans+=(fy-sy-1);
        System.out.println(ans);

        if(ans ==0 && sx==fx && sy==sx) return t>1;


        return ans<=t;
    }
}
