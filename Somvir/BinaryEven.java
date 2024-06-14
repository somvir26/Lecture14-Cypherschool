package Somvir;

import java.util.*;
public class BinaryEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number by your choice:");
        int number=s.nextInt();
        if((number&1)==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
