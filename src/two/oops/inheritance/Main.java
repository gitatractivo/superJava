package two.oops.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(5,4,3);
//        Box box2 = new Box();
//        System.out.println(box2.l + " "+box2.w + " "+ box2.h );
        BoxWeight box3 = new BoxWeight(5,4,3,8);
        box3.showDetails();
        box3.fun();
//        System.out.println(box3);
        Box box4 = new BoxWeight(3,4,5,6);
        Box box5 = new Box(7,8,9);
        box5.showDetails();
//        Box box5 = box4;
//        Box box7 = new Box(box4);
//        Box box6 = new BoxWeight();
//        box4.fun();
//        BoxWeight box = new BoxWeight();
//        box.w=5;
//        Box box2 = new BoxWeight();


//        System.out.println(box7.w);
//        System.out.println(box3.h + " "+ box3.weight+" "+box3.w+" "+box3.l);
//        System.out.println(box4.h + " "+box4.w+" "+box4.l);


//        System.out.println(12 & 9);
    }
}

