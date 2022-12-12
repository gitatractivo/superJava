package one.prac.oopsLab;

public class Student {
    static int i;
    String name;
    public static Student obj;
    private Student(String name){
        this.name=name;
    }

    public static Student getStudent(){
        if(i<10){
            ++i;
            obj = new Student("I am Obj number:"+i);
        }
        return obj;
    }
}
