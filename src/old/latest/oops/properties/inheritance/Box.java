package old.latest.oops.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box (){
        this.h = -1;
        this.l = -1;
        this.w = -1;

    }
    //cube
    Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;

    }

    Box(double l, double h, double w) {
//        System.out.println("from box");?
        this.l = l;
        this.h = h;
        this.w = w;
    }
    //Box old is when we input an older box instead of h w l and we want exact same dimensions
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;

    }
    public void fun(){
        System.out.println("from parent box");
    }

//    Box(BoxWeight other){
//        this.w = other.w;
//        this.l = other.l;
//
//    }
    public void information(){
        System.out.println("Running the Box");
    }

}
