package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nextNumber = 1; //number for the next value starting from 1

        //choose the n number
        System.out.println("Starting from one, to which number do you want to print the array?");
        Scanner number = new Scanner(System.in);
        int[] printArray = new int[number.nextInt()];

        //print the numbers to n divisible by 3 and 7
        System.out.println("The numbers divisible by 3 and 7 are: ");
        for (int i = 0; i <= printArray.length - 1; i++) {

            printArray[i] = nextNumber;
            if (printArray[i] % 3 == 0 || printArray[i] % 7 == 0) {
                System.out.print(" " + printArray[i] + " ");
            }
            nextNumber = printArray[i] + 1;
        }
    }
}
