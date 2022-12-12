package two.oops;

public class oopsLab2 {
    public static void main(String[] args) {
        ComplexNumber cm = new ComplexNumber(12,13);
    }
    static int getVolume(int a){
        //cube
        return a*a*a;
    }
    static double getVolume(float r){
        //sphere
        return 4/3*3.14*r*r*r;
    }
    static int getVolume(int l, int b, int h){
        //cuboid
        return l*b*h;
    }
    static double cylinder(float r, int h){
     //cylinder
        return 3.14*r*r*h;
    }

    static int add(int a , int b){
        return a +b;
    }
    static float add(float a, float b){
        return a+b;
    }
    static ComplexNumber add(ComplexNumber a ,ComplexNumber b){
        return new ComplexNumber(a.real+b.real,a.imaginary+ b.imaginary);
    }
}
