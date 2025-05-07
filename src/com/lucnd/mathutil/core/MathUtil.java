/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucnd.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtil {

//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//        }
//
//        if (n == 0 || n == 1 ) {
//            return 1;
//        }
//        long result = 1;
//        for (int i = 2; i <= n ; i++) {
//            result *= i;
//        }
//        return result;
//    }
     public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        }

        if (n == 0 || n == 1 ) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
