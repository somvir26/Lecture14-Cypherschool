package Somvir;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter input for perfect number");
        int num = s.nextInt();
        if(num < 1){
            System.out.println("invalid input for perfect number");
        }
      else {
            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
      }if(sum == num){
            System.out.println("is perfect number:");
        }
      else if(sum != num ){
          System.out.println("is not perfect:");
        }

        }
    }
