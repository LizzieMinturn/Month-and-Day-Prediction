package com.LickingHeights;

import java.time.DayOfWeek;
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
            int h=equations(m, year, q);
            System.out.println();

            System.out.println("There are "+day(m,year)+" days in "+name(m));
            System.out.println(dayOfWeek(h));
            System.out.println("according to the poem you "+poem(h));
            System.out.println();

        }
    }
    public static String name(int m) {
       String monthName;
        switch(m){
           case 1:
               monthName="January";
               break;
           case 2:
               monthName="February";
               break;
           case 3:
               monthName="March";
               break;
           case 4:
               monthName="April";
               break;
           case 5:
               monthName="May";
               break;
           case 6:
               monthName="June";
               break;
           case 7:
               monthName="July";
               break;
           case 8:
               monthName="August";
               break;
           case 9:
               monthName="September";
               break;
           case 10:
               monthName="October";
               break;
           case 11:
               monthName="November";
               break;
           case 12:
               monthName="December";
               break;
            default:
                monthName="ERROR";
                break;
       }
       return monthName;
    }
    public static int day(int m, int year){
        int days;
        int leap=year%400;
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                days=31;
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 2:
                if(leap==0){
                    days=29;
                }
                else{
                    days=28;
                }
                break;
            default:
                days=0;
                break;
        }
        return days;
    }
    public static int equations(int m, int year, int q){
        if(m==1 || m==2){
            m=m+12;
            year=year-1;
        }
        int J = year/100;
        int K = year%100;

       int h  = (q+(13*(m+1)/5)+K+(K/4)+(J/4)-2*J)%7;

       return h;
    }
    public static String dayOfWeek(int h){
        String weekDay;
        switch(h){
            case 0:
                weekDay=bornOnA("Saturday");
                break;
            case 1:
                weekDay=bornOnA("Sunday");
                break;
            case 2:
                weekDay=bornOnA("Monday");
                break;
            case 3:
                weekDay=bornOnA("Tuesday");
                break;
            case 4:
                weekDay=bornOnA("Wednesday");
                break;
            case 5:
                weekDay=bornOnA("Thursday");
                break;
            case 6:
                weekDay=bornOnA("Friday");
                break;
            default:
                weekDay="ERROR";
        }

        return weekDay;
    }
    public static String bornOnA(String day){

        return "You were born on a "+ day;
    }
    public static String poem(int h){
        String line;
        switch(h){
            case 0:
                line="work hard";
                break;
            case 1:
                line="are fair, wise, and good";
                break;
            case 2:
                line="are fair of face";
                break;
            case 3:
                line="are full of grace";
                break;
            case 4:
                line="are full of woe";
                break;
            case 5:
                line="have far to go";
                break;
            case 6:
                line="are loving and giving";
                break;
            default:
                line="ERROR";
                break;
        }

        return line;
    }
}
