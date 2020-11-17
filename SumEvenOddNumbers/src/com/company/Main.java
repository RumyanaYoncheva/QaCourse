package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double evenTotal = 0;
        double oddTotal = 0;
        double total;

        //How long the array should be
        System.out.println("How many numbers do you want in the array?");
        Scanner placesArray = new Scanner(System.in);
        double [] EvenOddArray = new double[placesArray.nextInt()];

        //insert the numbers from the keyboard
        for (int i = 0; i< EvenOddArray.length;i++) {
            System.out.println("Insert the number " + (i+1) + " in the array: ");
            Scanner numberInserted = new Scanner(System.in);
            EvenOddArray[i] = numberInserted.nextInt();
        }

        //Check if the number is even or odd
        for (int i = 0; i<EvenOddArray.length;i++) {

            //even numbers
            if(EvenOddArray[i]%2==0){
                System.out.println("The number " + EvenOddArray[i] + " is even");
                evenTotal += EvenOddArray[i];
            }
            //odd numbers
            else{
                System.out.println("The number " + EvenOddArray [i] + " is odd");
                oddTotal += EvenOddArray[i];
            }

        }

        //print the total of odd and even
        System.out.println("The total of even numbers is: " + evenTotal);
        System.out.println("The total of odd numbers is: " + oddTotal);

        //total of all
        total = oddTotal + evenTotal;
        System.out.println("The total of numbers is: " + total);
    }
}
