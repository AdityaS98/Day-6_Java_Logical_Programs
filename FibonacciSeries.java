package com.programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacciCalculation(int operand) {
        int a = 0, b = 1, c;
        for (int i = 1; i <= operand; i++) {
            System.out.print(a +" ");
            c = a + b;
            a = b;
            b = c;

        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int term = sc.nextInt();
        fibonacciCalculation(term);

    }
}
