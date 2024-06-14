package Somvir;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter number for reverse:");
        int num = s.nextInt();
        while (num != 0) {
            int rem = num % 10;
            res = res * 10 + rem;
            num = num / 10;
        }
        System.out.println("reverse number :" +res);
    }
}
