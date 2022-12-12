package two.oops.abstractt;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        Son son1 = new Son(21);
        Son son2 = new Son(23);
        float a = 4.2156f;
//        System.out.print("fdslkj %.2f",a);
        System.out.println(String.valueOf(son.age));
        System.out.println(String.valueOf(son1.age));
        System.out.println(String.valueOf(son2.age));

        son.career();

        Daughter daughter = new Daughter(18);
        daughter.partner();

        Parent.hello();
        son.normal();
        daughter.normal();
        Parent son3 = new Son(10);

    }
}
