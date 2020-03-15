package com.company;
//inheritance is is-a relation
class parent{
String name="yogesh";
}
class child extends parent{
    int rollno=5;
}
public class InheritanceinJava {
    public static void main(String[] args) {
        child obj =new child();
        System.out.println(obj.name);
        System.out.println(obj.rollno);
    }
}

//there are there types of inheritance in java
//single:one class to another; multilevel:chain of inheritance; hierarchical: many to one