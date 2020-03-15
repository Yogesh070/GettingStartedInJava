package com.company;
//aggregation is same as containership in c++ ie. creating instance of one class in another and using its data member and functions
//its is Has-A relation
class opertion{
    int square(int n){
        return n*n;
    }
}
public class AggregrationInJava {
    int circle;
    double pi=3.14;
    opertion obj; //aggregation
    double circle(int r){
        return pi*r*r;
    }
    void total(){
        obj=new opertion();
        System.out.println(obj.square(5)+circle(6));
    }
    public static void main(String[] args) {
    AggregrationInJava a=new AggregrationInJava();
    a.total();
    }
}
