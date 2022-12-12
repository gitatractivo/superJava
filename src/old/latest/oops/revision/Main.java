package old.latest.oops.revision;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        System.out.println(student.name);
        System.out.println(student2.name);

         Integer a =20;
         Integer b = 10;
        Integer  temp = a;
        a = b;
        b = temp;
        A obj;
        System.out.println(a + " " + b);
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("random name");
//            System.out.println(obj.name);

        }

    }

    private static void swap(Integer a, Integer b) {
        Integer  temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
    static class A{
        String name;

        public A(String name) {
            this.name = name;

        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("jdahd");
        }
    }
}
