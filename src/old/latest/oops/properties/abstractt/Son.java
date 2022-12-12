package old.latest.oops.properties.abstractt;

public class Son extends Parent{


    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        System.out.println("normal2");
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor"+age);
    }

    @Override
    void partner() {
        System.out.println("I love Iron man "+ age);
    }}
