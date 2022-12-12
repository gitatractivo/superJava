package old.latest.hash;

import java.util.HashMap;

public class getCommonElements {
    public static void main(String[] args) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        String s1 = "1112223334445556668877779995559621465123";
        String s2 = "1112222222333333333777777888888888000";
        String ans ="";
        for (char ch :s1.toCharArray()) {
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }
        }

        for (char ch:s2.toCharArray()) {
            if(map1.containsKey(ch)) {
                ans+=ch;
                map1.remove(ch);
            }
        }
        System.out.println(ans);
    }
}
