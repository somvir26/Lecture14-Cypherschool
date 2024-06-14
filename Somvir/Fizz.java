package Somvir;

import java.util.Scanner;

public class Fizz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int n = 1;
        while (n <= num) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("fizzBuzz");
            } else if (n % 5 == 0) {
                System.out.println("buzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            }
            else{
                System.out.println(n);
            }
            n++;

        }
    }
 }
