package com.programs;

public class MonthlyPayment {
    public static void bankCalculation(int P, int R, int y) {
        int n = y * 12;
        System.out.println(n);
        double r = R / (12 * 100);
        System.out.println(r);
        double payment = (P * r) / 1 - (Math.pow(1 + r, n * (-1)));
        System.out.println("Final Amount is" + payment);


    }


    public static void main(String[] args) {
        System.out.println("Enter Principle Amount ");
        int principle = UtilityClass.scannerInt();
        System.out.println("Enter rate of interest");
        int rate = UtilityClass.scannerInt();
        System.out.println("Enter time");
        int time = UtilityClass.scannerInt();
        bankCalculation(principle, rate, time);

    }
}
