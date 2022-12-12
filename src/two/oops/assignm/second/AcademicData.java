package two.oops.assignm.second;

import two.oops.assignm.first.Info;
import two.oops.assignm.first.Student;

public class AcademicData extends Student implements Info {
    private int marks1,marks2,marks3;

    public AcademicData(String name, String fatherName, String city, int roll, int mNo, int marks1, int marks2, int marks3) {
        super(name, fatherName, city, roll, mNo);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    @Override
    public void show() {

        System.out.println("Institute:"+collegeName);

        System.out.println("marks1:"+marks1);
        System.out.println("marks2:"+marks2);
        System.out.println("marks3:"+marks3);

    }

    @Override
    public void calculate_performance() {
        System.out.println("Performance:"+(marks1+marks2+marks3)/100);
    }

}
