package com.latest.oops.properties;

public class Student {
    int rno;
    String name;
    float marks;

    public Student() {
    }

    public Student(int rol, String n, float m) {
        rno = rol;
        name = n;
        marks = m;
    }
}
class Main{
    public static void main(String[] args) {
        Student st = new Student(12,"jkl",351.5f);
        Student st2 = new Student(123,"djkl",3551.5f);

        System.out.println(st.marks +" "+st.rno+" "+st.name);
        System.out.println(st2.marks+" "+st2.rno+" "+st2.name);


    }
}
