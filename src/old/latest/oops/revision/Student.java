package old.latest.oops.revision;

public class Student {
    int rollNo;
    float marks;
    final String name = "default";

    public Student() {
        this(13,100.0f);
    }

    public Student(int rollNo, float marks, String name) {
        this.rollNo = rollNo;
        this.marks = marks;

    }

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("haha");
    }
}
