package old.second.b;

import java.util.ArrayList;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%30!=0) {System.out.println("-1");}

        else System.out.println(descend(n));
//        System.out.println(descend(Integer.parseInt(str)));
    }
    static int descend(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        while(n>0){
            list.add(n%10);
            n/=10;
            count++;
        }
        int temp = 0;
        sort(list,0,list.size());
        int i=0;
        for(i=0;i<count;i++){
            temp=temp*10 + list.get(i);
        }
        return temp;
    }
    static void sort(ArrayList<Integer> list,int s , int e){
        //arr is bisected again and again till a point only 1 individual no. is left or this is the base condition
        if (e - s == 1) {
            return ;
        }

        int mid = (s + e) / 2;

        sort(list, s, mid);
        sort(list, mid, e);

        mergeInPlace(list, s, mid, e);

    }
    private static void mergeInPlace(ArrayList<Integer> list, int s, int m, int e) {
        ArrayList<Integer> mix = new ArrayList<>();

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (list.get(i) < list.get(j)) {
                mix.set(k, list.get(i));
                i++;
            } else {
                mix.set((k) ,list.get(j));
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix.set(k, list.get(i));
            i++;
            k++;
        }

        while (j < e) {
            mix.set((k) ,list.get(j));
            j++;
            k++;
        }

        for (int l = 0; l < mix.size(); l++) {
            list.set(s+l, mix.get(l));
        }
    }


}
