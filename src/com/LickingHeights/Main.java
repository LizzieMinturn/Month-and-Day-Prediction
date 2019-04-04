package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// h=(q+(13*(m+1)/5)+K+(K/4)+(J/4)-2J)

        Scanner keyboard = new Scanner(System.in);

        System.out.println("There is a nursery rhyme that goes:");
        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.");
        System.out.println("Let's find out what day of the week you were born on!");
        System.out.println();

        boolean value = true;
        while(value) {

            System.out.println("What month were you born in?(as a number)");
            int m = keyboard.nextInt();//month
            System.out.println("What day of the month were you born on?");
            int q = keyboard.nextInt();//day
            System.out.println("What year were you born in?(ex. 2000)");
            int year = keyboard.nextInt();

            int J = year / 100;
            int K = year % 100;

            int dayOfWeek = (q + (13 * (m + 1) / 5) + K + (K / 4) + (J / 4) - 2 * J) % 7;

            switch (dayOfWeek) {
                case 0:
                    System.out.println("You were born on a saturday");
                    break;
                case 1:
                    System.out.println("You were born on a sunday");
                    break;
                case 2:
                    System.out.println("You were born on a monday");
                    break;
                case 3:
                    System.out.println("You were born on a tuesday");
                    break;
                case 4:
                    System.out.println("You were born on a wednesday");
                    break;
                case 5:
                    System.out.println("You were born on a thursday");
                    break;
                case 6:
                    System.out.println("You were born on a friday");
                    break;
            }
            System.out.println("You can enter another date, if you want!");
            System.out.println();
        }
    }
}
