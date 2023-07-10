package one.leetcode.strings;

public class _168 {
    public static void main(String[] args) {
        int a = 18253;
        System.out.println(convertToTitle1(a));
        System.out.println(convertToTitle(a));

    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
//        int i = 1;

        while(columnNumber>0){
            int temp = columnNumber%26;
            if(temp==0) {
                ans.append("Z");
                columnNumber /= (26);
                columnNumber--;

            }
            else {
                ans.append((char) (temp + 'A' - 1));
                columnNumber /= 26;
            }
//            i++;
        }


        return ans.reverse().toString();

    }
    public static String convertToTitle1(int cn) {
        StringBuilder s = new StringBuilder();
        while(cn>0){
            int temp =cn%26;
            if(temp==0) temp=26;
            s.insert(0,(char)((temp)+64));
            cn-=temp;
            cn/=26;
        }
        return s.toString();
    }
}
