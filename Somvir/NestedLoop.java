package Somvir;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter num");
        int num = s.nextInt();
        int j =0,i=0;
        for( i=0;i<=num;i++){
            for( j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
