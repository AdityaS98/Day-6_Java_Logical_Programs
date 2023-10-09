package com.programs;

public class TempratureConversion {
    public static void tempratureCalculation(double temprature, int c) {
        switch (c) {
            case 1:
                double celcius = (temprature * 9 / 5) + 32;
                System.out.println("Temprature is" + celcius + "degree celcius");
                break;

            case 2:
                double fahrenheit = (temprature - 32) * 5 / 9;
                System.out.println("Temprature is" + -fahrenheit + "degree celcius");
                break;

            default:
                System.out.println("Wrong Choice");
        }


    }

    public static void main(String[] args) {
        System.out.println("Enter the temprature");
        double temp = UtilityClass.scannerDouble();
        System.out.println("Enter your choice");
        int ch = UtilityClass.scannerInt();
        tempratureCalculation(temp, ch);
    }
}
