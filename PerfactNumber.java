package com.programs;

import java.util.Scanner;

public class PerfactNumber {
    public static void numberCalculator(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            System.out.println("Perfact Number");
        } else {
            System.out.println("Not a perfact number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int number = sc.nextInt();
        numberCalculator(number);
    }
}
