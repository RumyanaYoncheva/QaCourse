package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Insert a number: ");
        Scanner Number = new Scanner(System.in);
        float NumberForCheck = Number.nextFloat();

        if(NumberForCheck<0){
            System.out.println("The number " + NumberForCheck + " is negative");
        }

        else if (NumberForCheck == 0){
            System.out.println("The number is " + NumberForCheck);
        }
        else{
            System.out.println("The number " + NumberForCheck + " is positive");
        }
    }
}
