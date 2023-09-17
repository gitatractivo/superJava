package one.leetcode.heap;

public class _1464 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{10,2,5,2}));
    }
    public static int maxProduct(int[] nums) {
        int first = nums[0], second = nums[1];
        if(first<second){
            int temp = second;
            second = first;
            first = temp;
        }
        if(nums.length<3){
            return (first-1)*(second-1);
        }

        for(int i =2;i<nums.length;i++){
            if(nums[i]>first){
                second = first;
                first=nums[i];
            }
            else if(nums[i]>second || nums[i]==first){
                second=nums[i];
            }
        }
        return (first-1)*(second-1);
    }
}
