class staticExample{
    static int c=0;
     staticExample(){
        c++;
        System.out.println(c);
    }
    static void changestaticvalue(){
         c=5;
    } // here changestaticvalue() is static method to change the static value and static method belong to class rather than instance of class i.e object
    public static void main(String[]args){
        new staticExample();
        new staticExample();
        new staticExample();
        staticExample.changestaticvalue(); //here the static method can be invoked without creating instance of class
        nonstaticExample ob1=new nonstaticExample();
        nonstaticExample ob2=new nonstaticExample();
    }
        }
//here the static makes the data member in c in this program  is common for all object of that class hence helps in memory management. else the on not using static it becomes instance variable and each time the object is defined for the class different heap memory is allocated for the data member.
class nonstaticExample{
    nonstaticExample(){
        int a=0;
        a++;
        System.out.println(a);
    }
}
//here in notstaticExample class we have defined as a as instance variable and hence each time class instance is created  new memory is allocated.
