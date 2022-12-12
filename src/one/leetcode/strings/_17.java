package one.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class _17 {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations2(digits));
    }
    public static List<String> letterCombinations(String digits) {
        String[] arr = new String[digits.length()];
        for(int i= 0; i<arr.length;i++){
            arr[i]="";
            int k = digits.charAt(i) -'2';

            if((k<5)){
                for(int j = 3*k; j<=(3*k)+2; j++){
                    arr[i]+=(char)(97+j);
                }
            }
            else if((k==6)){
                for(int j = 3*k+1; j<=(3*k)+3; j++){
                    arr[i]+=(char)(97+j);
                }
            }
            else if(k==5){
                for(int j = 3*k; j<=(3*k)+3; j++){
                    arr[i]+=(char)(97+j);
                }
            }
            else if((k==7)){
                for(int j = 3*k+1; j<=(3*k)+4; j++){
                    arr[i]+=(char)(97+j);
                }
            }
        }
        return list(arr);
    }
    public static List<String> list(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        switch(arr.length){
            case 0:
                break;
            case 1:
                for (int i = 0; i < arr[0].length(); i++) {
                    String s = "";
                    s+= arr[0].charAt(i);
                    list.add(s);
                }
                break;
            case 2:
                for (int i = 0; i < arr[0].length(); i++) {

                    char ch1 = arr[0].charAt(i);
                    for (int j = 0; j < arr[1].length(); j++) {
                        String s = "";
                        s+=ch1;
                        s+= arr[1].charAt(j);

                        list.add(s);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < arr[0].length(); i++) {

                    char ch1 = arr[0].charAt(i);
                    for (int j = 0; j < arr[1].length(); j++) {
                        char ch2= arr[1].charAt(j);
                        for (int k = 0; k < arr[2].length(); k++) {
                            String s = "";
                            s += ch1;
                            s += ch2;
                            s += arr[2].charAt(k);

                            list.add(s);

                        }
                    }
                }
                break;
            case 4:
                for (int i = 0; i < arr[0].length(); i++) {

                    char ch1 = arr[0].charAt(i);
                    for (int j = 0; j < arr[1].length(); j++) {
                        char ch2= arr[1].charAt(j);
                        for (int k = 0; k < arr[2].length(); k++) {
                            char ch3= arr[2].charAt(k);

                            for (int l = 0; l < arr[3].length(); l++) {
                                String s = "";
                                s += ch1;
                                s += ch2;
                                s += ch3;
                                s += arr[3].charAt(l);

                                list.add(s);

                            }



                        }
                    }
                }
                break;

        }
        return list;
    }
    public static List<String> letterCombinations2(String digits) {
        String[] arrgood = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String[] arr = new String[digits.length()];
        for(int i= 0; i<arr.length;i++){

            int k = digits.charAt(i) -'0';

            arr[i]=arrgood[k];
        }
        return list(arr);
    }
}
