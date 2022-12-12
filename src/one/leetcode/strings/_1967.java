package one.leetcode.strings;

public class _1967 {
    public static void main(String[] args) {
        String[] arr = {"dojsf","v","hetnovaoigv","ksvqfdojsf","hetnovaoig","yskjs","sfr","msurztkvppptsluk","ndxffbkkvejuakduhdcfsdbgbt","znhdgtwzbnh","h","ocaualfiscmbpnfalypmtdppymw","w","o","sfjksvqfdo","odqvzuc","bozawheajcmlewptgssueylcxhx","bno","jhmarzsphxduvdktzqjiz","j","sfrjhetnov","vxv","ksvqfd","ognwvqtadalmav","yqbspvfwmvhycmghabigl","qyfaiazgdqaw","ojsfrj","ojsfrjhetn","fdojs","do","ovaoig","k","vrh","jsfrjhetnovaoigvgk"};

        String word = "csfjksvqfdojsfrjhetnovaoigvgk";
        System.out.println(numOfStrings(arr,word));

    }
    public static int numOfStrings(String[] arr, String word) {
        int num=0;
        char[] ch = word.toCharArray();
        for (String sh: arr) {
            int i =0;
            while(i<sh.length()) {
                if(check(ch,sh.charAt(i)))  i++;
                else    break;
            }
            if(i==sh.length())  num++;

        }
        return num;
    }
    public static boolean check(char[] ch, char c){
        boolean isThere=false;
        for (char d:ch) {
            if(d==c) {
                isThere=true;
                break;
            }

        }
        return isThere;
    }
    public static int numOfStrings2(String[] arr, String word) {
        int num=0;
        char[] ch = word.toCharArray();
        for (String sh: arr) {

            if(word.contains(sh))  num++;

        }
        return num;
    }
}
