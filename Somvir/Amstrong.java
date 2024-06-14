package Somvir;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum=0;
        System.out.println("enter number");
        int num = s.nextInt();
        int Given = num;
        int digit=String.valueOf(num).length();
       while(num > 0){

            int rem = num % 10;
            sum += Math.pow(rem ,digit);
            num = num/10;

        }
        if(sum == Given ) {
            System.out.println("amstrong no is: " +Given);
        }
        else{
            System.out.println("not amstrong");
        }
    }

}
