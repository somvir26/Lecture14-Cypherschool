// write a program to pass in any sub student want 40% total marks and in each marks 30%
package Somvir;
import java.util.*;
public class GradingMarks {
    public static void main(String[] args) {


  Scanner s = new Scanner (System.in);
  System.out.println("enter number ");
  int num = s.nextInt();
  if (num >= 95) {
      System.out.print("grade A");
  }
  else if (num >= 85 && num < 95) {
            System.out.print("grade B");
        }
        else if (num >= 75&& num < 85) {
            System.out.print("grade C");
        }
       else if (num >= 65 && num < 75) {
            System.out.print("grade D = fail");
        }
    }
}
