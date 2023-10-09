package com.programs;

public class CouponNumber {

    public static void couponsUnique(int coup) {
        int count = 0, random = 0;

        while (coup != random) {
            random = (int) Math.floor(Math.random() * 100 + 1);
            count++;

        }
        System.out.println(count + "numbers needed");

    }

    public static void main(String[] args) {
        System.out.println("Enter coupon number");

        int coupon = UtilityClass.scannerInt();
        couponsUnique(coupon);
    }
}
