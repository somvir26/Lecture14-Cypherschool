package Somvir;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 1st number to find gcd");
        int num = s.nextInt();
        System.out.println("Enter a 2nd number to find gcd");
        int num1 = s.nextInt();
        int gcd = 0,temp=0;
        if(num>num1){
            temp=num;
        }
        else{
            temp=num1;
        }
       
            for(int i =1;i<=temp;i++){
                if(num % i ==0 && num1 % i == 0){
                     gcd = i;
                }
            }
           
            System.out.println(gcd);


    }
}
