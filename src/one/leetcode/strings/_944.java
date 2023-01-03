package one.leetcode.strings;

import javax.swing.plaf.IconUIResource;

public class _944 {
    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"rrjk","furt","guzm"}));
    }
    public static int minDeletionSize(String[] strs){
        int[] arr = new int[strs[0].length()];
        int ans=0;
        for (String str:strs) {
            for (int i = 0; i < str.length() ; i++) {
                if(arr[i]==-1)  continue;
                else if(arr[i]<=str.charAt(i)) arr[i]= str.charAt(i);
                else {
                    arr[i]= -1;
                    ans++;
                }
            }
        }
        return ans;
    }
    public static int minDeletionSize2(String[] strs){
        int ans=0, col = strs[0].length();
        for (int i = 0; i < col; i++) {

        }
        return ans;
    }
}
