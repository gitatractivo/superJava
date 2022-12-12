package two.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rand {
//    public static void main(String[] args) {
//        List<Distance> d = new ArrayList<>();
//        d.add(new Distance(4,5));
//        d.add(new Distance(4,6));
//        d.add(new Distance(4,7));
//        Iterator<Distance> it = d.iterator();
////        while(it.hasNext()){
////            System.out.println(it.next());
////        }
//        while(it.hasNext()){
//            Distance s =  it.next();
//            System.out.println();
//        }
//
//    }
public static void main(String[] args) {
    int[ ][ ][ ] num = new int[3][ ][ ];
    int i, j;
    num[0] = new int[4][];
    num[1] = new int[2][];
    num[2] = new int[5][];
    int count = 1;
    for (i = 0; i < num.length; i++) {
        for (j = 0; j < num[i].length; j++) {
            num[i][j] = new int[i + j + 1];
            System.out.println("size = " + num[i][j].length );
        }
    }
}
}
