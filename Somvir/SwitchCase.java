package Somvir;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
       Scanner s =new Scanner(System.in);
       System.out.println("enter your choice");
        int day = s.nextInt();
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursaday");
                break;
            case 5:
                System.out.println("friday");
                break;
                case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
       int a =147;
        String str = String.valueOf(a);
        System.out.println(str.length());
    }
}
