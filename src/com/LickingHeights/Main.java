package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// h=(q+(13*(m+1)/5)+K+(K/4)+(J/4)-2J)

        Scanner keyboard = new Scanner(System.in);

        /*System.out.println("There is a nursery rhyme that goes:");
        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.");
        System.out.println("Let's find out what day of the week you were born on!");
        System.out.println();*/

        boolean value = true;
        while(value) {

            System.out.println("What month were you born in?(as a number)");
            int m = keyboard.nextInt();//month
            System.out.println("What day of the month were you born on?");
            int q = keyboard.nextInt();//day
            System.out.println("What year were you born in?(ex. 2000)");
            int year = keyboard.nextInt();

        }
    }
    public static int modDate(int m, int year, int q){
        if(m==1 || m==2){
            m=m+12;
            year=year-1;
        }
        int J = year/100;
        int K = year%100;

       int h  = (q+(13*(m+1)/5)+K+(K/4)+(J/4)-2*J)%7;

       return h;
    }
    public static int dayOfWeek(int h){
        switch(h){
            case 0:
                System.out.println(bornOnA("Saturday"));
            case 1:
                System.out.println(bornOnA("Sunday"));
            case 2:
                System.out.println(bornOnA("Monday"));
            case 3:
                System.out.println(bornOnA("Tuesday"));
            case 4:
                System.out.println(bornOnA("Wednesday"));
            case 5:
                System.out.println(bornOnA("Thursday"));
            case 6:
                System.out.println(bornOnA("Friday"));
        }

        return h;
    }
    public static String bornOnA(String day){
        return "You were born on a ";
    }
}
