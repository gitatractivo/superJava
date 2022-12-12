package old.latest.oops.properties.generics;

public class Student implements Comparable<Student>{
    int rollNumber;
    float marks;

    public Student(int rollNumber, float marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
         int diff =(int)( this.marks-o.marks);
         return diff;
         //if diff ==0 means both are equal
         //if diff<1: means o is bigger else o is smaller
    }


}
