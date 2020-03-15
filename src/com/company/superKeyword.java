package com.company;
class Parent{
    String name="yogesh";
    void info(){
        System.out.println("i am a student");
    }
}
class Child extends Parent{
    String title= "thapa";
    void printName(){
        System.out.println(super.name);
        System.out.println(title);
    }

}
public class superKeyword {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.printName();
    }

}

//super keyword in java is a reference variable which is used to refer immediate parent class object