package two.oops.abstractt;

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
    static void fun(){
        System.out.println();
    }
    abstract void career();
    abstract void partner();


}
