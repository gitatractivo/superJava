package old.latest.hash;

import java.util.HashMap;

public class highestFrequencyCharacter {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "babcccdbabccdbbc";
        for (char ch:s.toCharArray()) {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else    map.put(ch,1);
        }
        char maxchar = s.charAt(0);
        for (Character key: map.keySet()) {
            if(map.get(key)>map.get(maxchar)){
                maxchar=key;
            }
        }//what about when two characters have same occurences?

        System.out.println(maxchar + " " +map.get(maxchar));


    }
}
