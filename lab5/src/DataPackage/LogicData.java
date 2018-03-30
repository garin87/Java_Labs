/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LogicData {

    public static boolean Yearleap(int year) {

        boolean yearleap = false;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            yearleap = true;
        }

        return yearleap;
    }

    public static int NextYear(boolean yearleap, int year, int month, int day) {

        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (yearleap == true) {
            monthDay[1] = 29;
        } else {
            monthDay[1] = 28;
        }

        day++;

        if (day > monthDay[month - 1]) {
            month++;
            day = 1;
        }
        if (month > 12) {
            year++;
            month = 1;
        }
        return year;
    }

    public static int NextMonth(boolean yearleap, int year, int month, int day) {

        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (yearleap == true) {
            monthDay[1] = 29;
        } else {
            monthDay[1] = 28;
        }

        day++;

        if (day > monthDay[month - 1]) {
            month++;
            day = 1;
        }
        if (month > 12) {
            year++;
            month = 1;
        }
        return month;
    }

    public static int NextDay(boolean yearleap, int year, int month, int day) {

        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (yearleap == true) {
            monthDay[1] = 29;
        } else {
            monthDay[1] = 28;
        }

        day++;

        if (day > monthDay[month - 1]) {
            month++;
            day = 1;
        }
        if (month > 12) {
            year++;
            month = 1;
        }
        return day;
    }
}
