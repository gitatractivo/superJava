package one.leetcode.dp;

public class _714 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,3,2,8,4,9},2));
    }
    public static int maxProfit(int[] prices, int fee) {
        int bs=-prices[0],ss=0,si=0,bi=0;
        for(int i =1;i<prices.length;i++){
            bi = ss-prices[i];
            si  = prices[i]+bs-fee;
            if(si>ss )   ss=si;
            if(bi>bs)   bs=bi;
        }
        return ss;

    }

}
