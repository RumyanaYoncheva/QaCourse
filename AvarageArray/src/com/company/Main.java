package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double total = 0; // initialize the sum

        //How long the array should be
        System.out.println("How many numbers do you want in the array?");
        Scanner placesArray = new Scanner(System.in);
        double [] avArray = new double[placesArray.nextInt()];

        //insert the numbers from the keyboard
        for (int i = 0; i<avArray.length;i++) {
            System.out.println("Insert the number " + (i+1) + " in the array: ");
            Scanner numberInserted = new Scanner(System.in);
            avArray[i] = numberInserted.nextInt();
        }

        //sum of the elements
        for(int i=0; i<avArray.length; i++){
            total =  total + avArray[i];
        }

        //average sum
        double average = total/avArray.length;
        System.out.println("The average is: " + average);
    }
}
