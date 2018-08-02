package com.kheiron;

public class Main {

    public static void main(String[] args) {
//        printMegaBytesAndKiloBytes (0);
//        if ((bark (true, 8))) {
//            System.out.println ("Wake up at " + 8);}
//        if ((bark (true, 22))) {
//            System.out.println ("Wake up at " + 23);};
//        if (bark(false,6) == false) {
//            System.out.println ("No wake up at " + 6);
//        }
//        int year = 10000;
//if (isLeapYear (year)) System.out.println (year + " is a leap year"); else System.out.println (year + "is NOT a leap year"); year = -2000;
//if (isLeapYear (year)) System.out.println (year + " is a leap year"); else System.out.println (year + "is NOT a leap year"); year = 999;
//if (isLeapYear (year)) System.out.println (year + " is a leap year"); else System.out.println (year + "is NOT a leap year"); year = 10000;
//if (isLeapYear (year)) System.out.println (year + " is a leap year"); else System.out.println (year + "is NOT a leap year"); year = 100;
//if (isLeapYear (year)) System.out.println (year + " is a leap year"); else System.out.println (year + "is NOT a leap year"); year = 4;
//if (isLeapYear (year)) System.out.println (year + " is a leap year"); else System.out.println (year + "is NOT a leap year"); year = 0;
//if (isLeapYear (year)) System.out.println (year + " is a leap year"); else System.out.println (year + "is NOT a leap year"); year = 88;
//if (isLeapYear (year)) System.out.println (year + " is a leap year"); else System.out.println (year + "is NOT a leap year");
//

//if (areEqualByThreeDecimalPlaces (3.1231, 3.1233)) System.out.println ("11 true"); else {    System.out.println ("1 false");}
//if (areEqualByThreeDecimalPlaces (3.12, 3.12)) System.out.println ("22 true"); else {    System.out.println ("2 false");}
//if (areEqualByThreeDecimalPlaces (3.12, 3.22)) System.out.println ("3 true"); else {    System.out.println ("33 false");}
//if (areEqualByThreeDecimalPlaces (3.12, 3.1)) System.out.println ("4 true"); else {    System.out.println ("44 false");}
//

//        System.out.println ("\nResult for circle is: " + area (2.5));
//        System.out.println ("\nResult for circle is: " + area (5));
//        System.out.println (area (4.0,5.0));


//    printYearsAndDays (525600L);
//    printYearsAndDays (105120320L);
//    printYearsAndDays (561600L);
//    printYearsAndDays (1444L);
//    printYearsAndDays (1445L);
//    printYearsAndDays (1446L);
//    printYearsAndDays (0);
//    printEqual (1, 1, 1);
//    printEqual (1,1,2);
//    printEqual (-1,-1,-1);
//    printEqual (1,2,3);

    if (isCatPlaying (true, 10)) {
        System.out.println ("Cat is playing");
        } else System.out.println ("Cat is not playing");
            if (isCatPlaying (false, 36)) {
        System.out.println ("Cat is playing");
        } else System.out.println ("Cat is not playing");
            if (isCatPlaying (false, 35)) {
        System.out.println ("Cat is playing");
        } else System.out.println ("Cat is not playing");




    }
//    // 1 MB = 1024 kb
//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        int mb = 0;
//        int kb = 0;
//
//        if (kiloBytes <= 0) {
//            System.out.println ("Invalid Value");
//        } else {
//            mb = kiloBytes / 1024;
//            kb = kiloBytes % 1024;
//            System.out.println (kiloBytes + " KB = " + mb +
//                    " MB and " + kb + " KB.");
//        }
//
//    }


//public static boolean bark (boolean barking, int hourOfDay) {
//        if (!barking)
//            return false;
//
//        if (hourOfDay < 0 || hourOfDay > 23) {
//            return false;
//        } else if ((hourOfDay >= 8 && hourOfDay <= 22))
//            return false;
//        return true;
//}

//public static boolean isLeapYear (int year) {
//    if (year < 1) return false;
//    if (year > 9999) return false;
//    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) return true;
//    return false;
//}


//public static boolean areEqualByThreeDecimalPlaces (double aaa, double bbb) {
//        double checkAaa = (int) (1000 * aaa);
//        double checkBbb = (int) (1000 * bbb);
//        if (checkAaa == checkBbb) return true;
//        return false;
//
//
//
//}


//public static boolean hasEqualSum (int first, int second, int total) {
//        if (first + second == total) return true;
//        return false;
//}

//    public static boolean hasTeen (int first, int second, int third) {
//        if ((first < 20 && first > 12) ||
//                (second < 20 && second > 12) ||
//                (third < 20 && third > 12)) return true;
//        return false;
//    }

//    public static double area (double radius) {
//        if (radius < 0) {
//            System.out.println ("Invalid radius value");
//            return -1;
//        }
//        double sqareRadius = radius * radius;
//        return (sqareRadius * 3.14159);
//    }
//    public static double area (double x, double y) {
//        if (x < 0 || y < 0) {
//            System.out.println ("Invalid rectangles values");
//            return -1;
//        }
//        System.out.println ("Area of the rectangle is: ");
//        return x * y;
//    }

//    public static void printYearsAndDays (long minutes) {
//        if (minutes < 0) System.out.println ("Invalid Value");
//        else {
//                long year = (minutes / 1440) / 365;
//                long minutesWithoutYears = (minutes - year * 1440 * 365);
//                long day = minutesWithoutYears / 1440;
//            System.out.println (minutes + " min = " + year + " y and " + day + " d");
//            }
//        }

//    public static void printEqual (int first, int second, int third) {
//        if (first < 0 || second < 0 || third < 0) {
//            System.out.println ("Invalid Value");
//        } else if (first == second && second == third) {
//            System.out.println ("All numbers are equal");
//        } else if (first != second && first != third && second != third) {
//            System.out.println ("All numbers are different");
//        } else {
//            System.out.println ("Neither all are equal or different");
//        }
//    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (temperature < 0) {
            return false;
        } else
            if ((summer) && (temperature > 24 && temperature < 46)) return true;
        else
            if (temperature > 24 && temperature < 36) return true;
        return false;
    }





}