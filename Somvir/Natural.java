package Somvir;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum=0;
        System.out.print("enter a natural you want to add :");
        int natural=s.nextInt();
        for( int i=1;i<=natural;i++){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
