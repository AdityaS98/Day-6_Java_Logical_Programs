package com.programs;

public class Decimaltobinary {

    public static void decimalToBinary(int n) {
        int[] binaryNum = new int[32];
        int i = 0;
        while (n > 0) {

            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }


        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        int num = UtilityClass.scannerInt();
        decimalToBinary(num);


    }
}
