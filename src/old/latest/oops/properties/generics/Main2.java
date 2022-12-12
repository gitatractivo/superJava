package old.latest.oops.properties.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        Student kunal = new Student(12,89.56f);
        Student Rahul = new Student(5,99f);
        Student dobby = new Student(69,32.69f);
        Student karan = new Student(48,59.2f);
        Student nishant = new Student(17,99.06f);
        Student arsh = new Student(15,69.66f);

        Student[] list = {kunal, Rahul , dobby,karan,nishant,arsh};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> o1.rollNumber - o2.rollNumber);
        System.out.println(Arrays.toString(list));


    }
}
