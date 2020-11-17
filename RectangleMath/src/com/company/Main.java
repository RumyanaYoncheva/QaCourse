package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //one of the sides
        float a;
        System.out.println("Insert the size of the first side: ");
        Scanner SideOne = new Scanner (System.in);
        a = SideOne.nextFloat();

        //the other side
        float b;
        System.out.println("Insert the size of the other side: ");
        Scanner SideTwo = new Scanner (System.in);
        b = SideTwo.nextFloat();

        float s = a*b; // area
        float p = 2*a+ 2*b; // perimeter

        System.out.println("The area is " + s + " and the perimeter is " + p);

    }
}
