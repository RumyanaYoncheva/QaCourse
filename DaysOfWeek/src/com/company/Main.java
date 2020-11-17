package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Inert the number of the day: ");
        Scanner DayOfWeek = new Scanner(System.in);
        int day = DayOfWeek.nextInt();

        if (day >= 1 && day <= 7) {
            switch (day) {
                case 1:
                    System.out.println("You choose " + day + " so the day of the week is Monday.");
                    break;
                case 2:
                    System.out.println("You choose " + day + " so the day of the week is Tuesday.");
                    break;
                case 3:
                    System.out.println("You choose " + day + " so the day of the week is Wednesday.");
                    break;
                case 4:
                    System.out.println("You choose " + day + " so the day of the week is Thursday.");
                    break;
                case 5:
                    System.out.println("You choose " + day + " so the day of the week is Friday.");
                    break;
                case 6:
                    System.out.println("You choose " + day + " so the day of the week is Saturday.");
                    break;
                case 7:
                    System.out.println("You choose " + day + " so the day of the week is Sunday.");
                    break;
                default:
                    break;
            }
        }
        else {
            System.out.println("There are not so many days in the week.");
        }
    }
}