package Somvir;

interface A {
    int x = 10;

    void fun();
}

interface B {
    int x = 20;

    void fun();
}

class X implements A, B {
    public void fun()

    {
        System.out.println("hello you are in class c");

    System.out.println(A.x);
     System.out.println(B.x);
    }
}
interface O extends A,B{
    void fuN();
}
class D implements O{
    public void fun(){
System.out.println("hello this is d");
    }
  public  void fuN(){
        System.out.println("hello d");
    }
}

public class Interface {
    public static void main(String[] args) {
        X c = new X();
        c.fun();
        D d =new D();
        d.fun();
        d.fuN();
    }
}
