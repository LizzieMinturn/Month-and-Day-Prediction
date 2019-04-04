package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// h=(q+(13*(m+1)/5)+K+(K/4)+(J/4)-2J)

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What month were you born in?");
        int m = keyboard.nextInt();//month
        System.out.println("What day of the month were you born on?");
        int q = keyboard.nextInt();//day
        System.out.println("What year were you born in?");
        int year = keyboard.nextInt();

        int J = year/100;
        int K = year%100;

        int dayOfWeek = (q+(13*(m+1)/5)+K+(K/4)+(J/4)-2*J)%7;

    }
}
