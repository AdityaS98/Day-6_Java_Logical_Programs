package com.programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void primeNumberChecker(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int number = sc.nextInt();
        primeNumberChecker(number);
    }
}
