package one.prac.oopsLab;

public class sm {
    public static void main(String[] args) {
        Student s ;
        for (int i = 0; i < 15; i++) {
            s=Student.getStudent();
            System.out.println(s.name);
        }
    }
}
