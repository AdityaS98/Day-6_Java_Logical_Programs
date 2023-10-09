package com.programs;

class DayCalculation {


    public int dayCalculation(int m, int y, int d) {


        int y0 = y - (14 - m) / 12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 100;

        int m0 = m + 12 * ((14 - m) / 12) - 2;


        int d0 = (d + x + 31 * m0 / 12) % 7;


        return d0;
    }

    public void dayResult(int d0) {
        switch (d0) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Output");
        }
    }

}

public class DayOfWeek {
    public static void main(String[] args) {

        System.out.println("Enter days:");
        int day = UtilityClass.scannerInt();
        System.out.println("Enter month:");
        int month = UtilityClass.scannerInt();
        System.out.println("Enter year");
        int year = UtilityClass.scannerInt();

        DayCalculation obj = new DayCalculation();

        obj.dayCalculation(day, month, year);
        obj.dayResult(day);

    }

}
