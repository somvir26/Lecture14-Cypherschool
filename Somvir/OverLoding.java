package Somvir;
class Parent{
public void fun1(int a,int b) {
    int c = a + b;
    System.out.println(c);
}
    public void fun1(int a,int b,int c){
        int d=(a+b)*c;
        System.out.println(d);
    }
}


public class OverLoding {
    public static void main(String[] args) {


    Parent p = new Parent();
    p.fun1(1,2);
    p.fun1(2,3,4);
}
 }
