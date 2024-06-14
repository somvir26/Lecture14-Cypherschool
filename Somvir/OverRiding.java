package Somvir;
class parent{
void fun(){
    System.out.println("hi i am A");
}
}
class child extends parent{
    void fun(){
        System.out.println("hi i am B");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        parent a= new parent();
        a.fun();
    }
}
