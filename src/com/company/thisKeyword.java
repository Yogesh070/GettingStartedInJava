package com.company;

public class thisKeyword {
//an example to illustrate use of this keyword in refer instance variable of class
    int rollno,grade;
    String name;
    void student(int rollno, String name, int grade ){
        this.rollno=rollno;
        this.name=name;
        this.grade=grade;
    }
    void display(){
        System.out.println(rollno+" " + name+ grade);
    }
    //here the below method uses this keyword to invoke current class method
    void thismethod(){
        display(); //or this.display(); //here the compiler automatically adds this to display();
    }
    //this can be used to call constructor
    thisKeyword(int a){
        this();
        System.out.println("this is constructor");
    }
    thisKeyword(){
        System.out.println("this is default constructor");
    }
    public static void main(String[] args) {
        thisKeyword obj=new thisKeyword(5);
        obj.student(5,"yogesh",10);
        obj.display();
    }
}
