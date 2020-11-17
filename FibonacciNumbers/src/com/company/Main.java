package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //choose the n number
        System.out.println("How many numbers do you want in the Fibonacci series?");
        Scanner number = new Scanner(System.in);
        int count  = number.nextInt();

        //initialize the first numbers 0 and 1
        int n1 =0;
        int n2 = 1;
        int n3;
        int total = n1+n2;

        System.out.println("The numbers are:");
        System.out.print(n1+ " " + n2);

        //print the Fibonacci series and calculating the total
        for(int i=2; i<+ count; i++){
            n3=n1+n2;
            System.out.print(" " + n3 + " ");
            n1=n2;
            n2=n3;
            total = total+ n2;
        }

        //print the total
        System.out.println("The total is " + total);
    }
}
