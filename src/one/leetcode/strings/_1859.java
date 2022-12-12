package one.leetcode.strings;

public class _1859 {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        System.out.println(sortSentence1(str));



    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ", -1);
        String[] arrCopy = new String[arr.length];
        for (String name :arr) {

            int index = Character.getNumericValue(name.charAt(name.length()-1))-1;
            name = name.substring(0,name.length()-1);
            arrCopy[index] = name;
        }
        String ans = new String();
        int count =1;
        for(String name: arrCopy){
            ans += name;
            if(count < arrCopy.length){
                ans += " ";
                count++;
            }
        }
        return ans;

    }
    public static String sortSentence1(String s) {
        String[] arr = s.split(" ", -1);
        String[] arrCopy = new String[arr.length];
        for (String name :arr) {
            int index = Character.getNumericValue(name.charAt(name.length()-1))-1;
            name = name.substring(0,name.length()-1);
            arrCopy[index] = name;
        }
        StringBuilder ans = new StringBuilder();
        int count =1;
        for(String name: arrCopy){
            ans.append(name);
            if(count < arrCopy.length){
                ans.append(" ");
                count++;
            }
        }
        return ans.toString();


    }
}
