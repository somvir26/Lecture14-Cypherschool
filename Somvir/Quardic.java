package Somvir;
import java.awt.*;
import java.util.*;
public class Quardic {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("first value");
       float a = s.nextFloat();
        System.out.println("second value");
        float b = s.nextFloat();
        System.out.println("third value");
        float c = s.nextFloat();

        double dis = b*b -4*a*c;
        System.out.println("dis is :" +dis);
        if(dis > 0) {
            double root1 = (-b + Math.sqrt(dis))/(2*a);
            double root2 = (-b - Math.sqrt(dis))/(2*a);

            System.out.println("root1 :" +root1);
            System.out.println("root2 :" +root2);
        }
       else if (dis < 0) {
            double real=(-b)/(2*a);
            double image=-(Math.sqrt(dis)/(2*a));
            System.out.println("real is : " +real);
            System.out.println("image is :" +image);
        }
else if (dis == 0){
    double root3= (-b)/(2*a);
            System.out.println("root3 is :" +root3);
        }
    }
}
