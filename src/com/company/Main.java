package com.company;

class  a{
    a get(){
        System.out.println("hi");
        return this;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
//        int a=5;
//        System.out.println(a);
        new a().get();
    }
}
