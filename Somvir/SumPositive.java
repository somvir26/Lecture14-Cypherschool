package Somvir;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=0,i;
        System.out.println("enter number is :");
        int num = s.nextInt();
        for( i = num ; i > 0;i = i/10){
            n = n + (i%10);
        }
    System.out.println("sum of given number is:" +n);
    }
}
