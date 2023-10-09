package com.programs;

import java.util.Scanner;

public class ReverseNumber {

    public static void reverseNumberFinder(int num) {
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            System.out.print(rem);
            num = num / 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        reverseNumberFinder(number);
    }

}
