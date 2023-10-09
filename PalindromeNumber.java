package com.programs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void palindromenumberChecker(int num) {
        int temp = 0;
        int r = 0;
        int s = 0;
        temp = num;
        while (num > 0) {
            num = num % 10;
            s = (s * 10) + r;
            num = num / 10;
        }
        if (temp == s) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a palindrome Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int number = sc.nextInt();
        palindromenumberChecker(number);
    }
}
