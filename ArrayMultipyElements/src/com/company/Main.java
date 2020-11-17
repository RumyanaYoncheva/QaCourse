package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //an array of 20 elements
        int [] multiplyArray = new int[20];

        //insert the numbers from the keyboard
        for (int i = 0; i<multiplyArray.length;i++) {
            System.out.println("Insert the number " + (i+1) + " in the array: ");
            Scanner numberInserted = new Scanner(System.in);
            multiplyArray[i] = numberInserted.nextInt();
        }
        //print each number in the array multiplied by 5
        for (int i = 0; i<multiplyArray.length;i++) {
            System.out.println("The number " + multiplyArray[i] + " multiplied by 5 is ");
            System.out.println(multiplyArray[i]*5);
        }

        //print a list of all the numbers multiplied by 5
        System.out.println("The numbers are: ");
        for (int i = 0; i<multiplyArray.length;i++) {
            System.out.print(" "+ multiplyArray[i] * 5 + " ");
        }

    }
}
