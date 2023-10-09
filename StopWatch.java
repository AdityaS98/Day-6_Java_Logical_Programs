package com.programs;

public class StopWatch {
    public static void timeCalculation() {
        long start = 0, end;
        double tim;
        end = System.currentTimeMillis();

        tim = (end - start) / 1000.0;

        System.out.println(tim);


    }

    public static void main(String[] args) {
        System.out.println("Type any character to start the stopwatch");
        char s = UtilityClass.scannerChar();

        System.out.println("Type any character to stop the stopwatch");
        char m = UtilityClass.scannerChar();

        timeCalculation();
        timeCalculation();


    }
}
