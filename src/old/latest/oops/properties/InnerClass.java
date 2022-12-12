package com.latest.oops.properties;

public class InnerClass {


    public static void main(String[] args) {
        Test A = new Test("Dick");
        Test B = new Test("big Dick");
        System.out.println(Test.name);
        System.out.println(Test.name);

    }



}
class Test{
    static String name;

    public Test(String name) {
        Test.name = name;
    }
}
