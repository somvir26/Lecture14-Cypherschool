package Somvir;

class shape{//parent,base,super class
    protected double pi=3.14;
    protected double getSquare(int r){
        return r*r;
    }
}
class circle extends shape{//child class,derived class

   public void area(int R){
        System.out.println(pi*getSquare(R));
    }
}
class rectangle extends shape{
   public void area1(int l,int b){
        System.out.println(l*b);
    }

}
public class Inheritance {
    public static void main(String[] args) {
    circle c = new circle();
    c.area(6);
    rectangle r=new rectangle();
    r.area1(9,6);
    }
}
