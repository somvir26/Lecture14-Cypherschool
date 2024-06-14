package Somvir;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number to check prime or not prime:");
        int num = s.nextInt();
      boolean isPrime=true;
      if(num<0){
          System.out.println("is not prime:");
          isPrime=false;
      }
      else if(num==0 || num==1){
            System.out.println("is not prime:");
            isPrime=false;
        }
      else {
          for(int i =2;i<=num/2;i++){
              if(num % i ==0){
                  isPrime=false;
                  System.out.println("not prime");
                  break;

              }
          }
      }
              if( isPrime == true ){
                  System.out.println("prime :");
              }



    }
}
