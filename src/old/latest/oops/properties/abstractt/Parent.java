package old.latest.oops.properties.abstractt;

public abstract class   Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }
    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("normal");
    }
    abstract void career();
    abstract void partner();

}
