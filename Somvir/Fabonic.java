package Somvir;

import java.util.Scanner;


public class Fabonic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = s.nextInt();

        int ft = 0, st = 1, nextTerm;

        if (num >= 1) {
            System.out.println("Fibonacci series:");
            System.out.print(ft + " ");
        }
        if (num >= 2) {
            System.out.print(st + " ");
        }

        for (int i = 3; i <= num; i++) {
            nextTerm = ft + st;
            System.out.print(nextTerm + " ");
            ft = st;
            st = nextTerm;
        }

        System.out.println("\nThe " + num + "th term of the Fibonacci series is " + st);

        s.close();
    }
}
