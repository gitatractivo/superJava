package one.prac.rec;

import java.util.ArrayList;

public class diceThrow {
    public static void main(String[] args) {
        System.out.println(diceFace("",9,8));
    }
    public static ArrayList<String> dice (String p,int target){
        ArrayList<String> list= new ArrayList<>();
        if(target==0) {
            list.add(p);
            return list;
        }

        for (int i = 1; i <= 6 && i<=target; i++) {
            list.addAll(dice(p+i,target-i));
        }
        return list;
    }
    public static ArrayList<String> diceFace (String p,int target, int face){
        ArrayList<String> list= new ArrayList<>();
        if(target==0) {
            list.add(p);
            return list;
        }

        for (int i = 1; i <= 6 && i<=target; i++) {
            list.addAll(diceFace(p+i,target-i,face));
        }
        return list;
    }
}
