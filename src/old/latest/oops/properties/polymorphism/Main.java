package old.latest.oops.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape shape = new Shape();
        Square square = new Square();
        circle.area();
    }
}
