package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nextNumber = 1; //number for the next value starting from 1

        //choose the n number
        System.out.println("Starting from one, to which number do you want to print the array?");
        Scanner number = new Scanner(System.in);
        int [] printArray = new int [number.nextInt()];

        //print the numbers to n
        System.out.println("The numbers are: ");
        for (int i =0;i<= printArray.length-1;i++){
            printArray [i] = nextNumber;
            System.out.print(" "+ printArray[i] + " ");
             nextNumber = printArray[i]+1;
        }
    }
}
