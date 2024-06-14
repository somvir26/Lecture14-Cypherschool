package Somvir;
import java.util.*;
public class PassFail {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter 1st marks");
        float num1=s.nextFloat();

        System.out.println("enter 2nd marks");
        float num2=s.nextFloat();

        System.out.println("enter 3rd marks");
        float num3=s.nextFloat();

        System.out.println("enter 4th marks");
        float num4 =s.nextFloat();

        float total = (num1+num2+num3+ num4)/4;
        if(total >=  40){
           if(num1 > 33 && num2 > 33 && num3 > 33 && num4 > 33){
               System.out.println("the student is pass");
           }
           else{
               System.out.println("the student is fail");
           }
        }

    }
}
