package com.programs;


import java.util.Scanner;

public class BinaryProg {

    public static String toBinary(int num) {

        String binary = Integer.toBinaryString(num);

        while (binary.length() < 8) {
            binary = "0" + binary;
        }
        return binary;
    }


    public static int swapNibbles(int num) {

        String binary = toBinary(num);


        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4, 8);


        String swappedBinary = nibble2 + nibble1;


        return Integer.parseInt(swappedBinary, 2);
    }


    public static boolean isPowerOf2(int num) {

        return (num != 0) && ((num & (num - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        scanner.close();

        int swapped = swapNibbles(input);
        System.out.println("Number after swapping nibbles: " + swapped);

        if (isPowerOf2(swapped)) {
            System.out.println("The resultant number is a power of 2.");
        } else {
            System.out.println("The resultant number is not a power of 2.");
        }

    }
}

