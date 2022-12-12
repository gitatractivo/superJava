package old.second.a;

public class Human {
    public final static  Human t = null;
    int age;
    String name;
    int salary;
    boolean married;
    static long population =20000;

    static void message(){
        System.out.println("hello world");
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population++;
        Human.message();

    }
    void mess(){
        this.age = 10;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void getAge(String name) {
        t.mess();
    }
}
