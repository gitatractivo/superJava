package two.oops.inheritance;
//this extends keyword is to connect child to the parent class

public class BoxWeight extends Box{
    double weight;
    double w;
//it will first input the parent constructor of choice and then it will ask the choice to input constructor of different inputs

//    public BoxWeight() {
//        this.weight=-1;
//    }
    public BoxWeight(){
        super();
    }


    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        //calls the parent class constructor
        //used to initialise values present in parent class
        this.w = (w+1);
        System.out.println(super.w);
        this.weight = weight;
    }


    public void showDetails(){
        super.showDetails();
        System.out.println(this.w+" "+this.h+" "+this.l+" "+this.weight);
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        //calls the parent class constructor
        //used to initialise values present in parent class
        this.weight = other.weight;
    }
    public void fun(){
        System.out.println("from child boxweight");
        information();
    }


}
