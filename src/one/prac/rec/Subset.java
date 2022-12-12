package one.prac.rec;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        System.out.println(subseq("","abc"));

    }
    public static ArrayList<String> subseq(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            if(!p.isEmpty()) list.add(p);
            return list;
        }
        list.addAll(subseq(p + up.charAt(0),up.substring(1)));
        list.addAll(subseq(p ,up.substring(1)));

        return list;

    }
    public static ArrayList<String> subseqAsciiRet(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            if(!p.isEmpty()) list.add(p);
            return list;
        }
        list.addAll(subseqAsciiRet(p + up.charAt(0),up.substring(1)));
        list.addAll(subseqAsciiRet(p ,up.substring(1)));
        list.addAll(subseqAsciiRet(p +(up.charAt(0)+0),up.substring(1)));

        return list;

    }

}
