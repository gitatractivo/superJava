package one.leetcode.BS;

public class _4 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1},new int[]{1}));
    }
    public static double findMedianSortedArrays(int[] n1, int[] n2) {
        if(n1.length>n2.length) return findMedianSortedArrays(n2,n1);

        int low = 0,high = n1.length;
        int size = n1.length+n2.length;
        int sym= (size)/2;
        int m1=0,m2=0;
        while(low<=high){
            m1 = (low+high)>>1;
            m2 = sym-m1;
            int l1 = Integer.MIN_VALUE,l2 = Integer.MIN_VALUE , r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
            if(m1<n1.length)     r1=n1[m1];
            if(m2<n2.length)     r2=n2[m2];
            if(m1-1>=0)  l1 = n1[m1-1];
            if(m2-1>=0)  l2 = n2[m2-1];



            if(l1<=r2 && l2<=r1){
                if(size%2==0){
                    int sum = Math.max(l1,l2)+Math.min(r1,r2);
                    return (double)sum/2.0;
                }
                else{
                    return (double)Math.min(r1,r2);
                }
            }
            else if(l1>r2){
                high=m1-1;
            }
            else{
                low=m1+1;

            }
        }
        return (double)0;
    }

}
