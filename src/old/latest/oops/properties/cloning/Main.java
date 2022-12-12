package old.latest.oops.properties.cloning;

public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(13, "gt");
//        Human gitan = new Human(kunal);
        Human gitan = (Human)kunal.clone();
        System.out.println(kunal == gitan);

    }

}
