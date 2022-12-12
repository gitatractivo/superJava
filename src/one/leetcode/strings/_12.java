package one.leetcode.strings;

public class _12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
    static int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(num>0){
            int temp = num/arr[i];
            if(temp>0){
                String s = getChar(arr[i]);
                for(int j = 0; j<temp;j++){
                    sb.append(s);
                    num-=arr[i];
                }
            }
            i++;
        }
        return sb.toString();
    }
    private static String getChar(int num) {
        switch (num) {
            case 1000:
                return "M";
            case 900:
                return "CM";

            case 500:
                return "D";
            case 400:
                return "CD";
            case 100:
                return "C";
            case 90:
                return "XC";
            case 50:
                return "L";
            case 40:
                return "XL";
            case 10:
                return "X";
            case 9:
                return "IX";
            case 5:
                return "V";
            case 4:
                return "IV";
            case 1:
                return "I";


        }
        return "";
    }
}
