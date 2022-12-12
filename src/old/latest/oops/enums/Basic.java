package old.latest.oops.enums;

public class Basic {


    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are enum constants
        //every single variable here is public static and final
        Week(){
            System.out.println("consturctor called for "+ this);
        }
//        void add();
        @Override
        public void hello() {
            System.out.println("hello how are you ");
        }
        //this is not public or protected, only private or default
        //why?
    }


    public static void main(String[] args) {
        Week week;
        week = Week.Wednesday;
        System.out.println(Week.valueOf("Monday"));
        week.hello();
//        System.out.println(week);
//        for (Week day:Week.values()
//        ) {
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal());

    }

}
