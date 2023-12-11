package org.example.fibonacci;

import java.util.Arrays;

public class GetIntFibonacci {

    // 3 + 4 * 6 + 1 = 28 => 4 + 4n => 4n
    // Memory = o(4)
    public int Iterator(int n) {
        int number = 0; //1
        int second = 1; //1
        int next = 0;   //1

        for (int i = 0; i < n; i++) {//4
            next = number + second;
            number = second;
            second = next;
        }
        return number;//1
    }


    //=> n^2
    //Memory 2^0 + 2^1 + 2^2 + 2^3 + 2^4 + 2^5 + 2^6 o(127)
    public int Recursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Recursion(n - 1) + Recursion(n - 2);
        }
    }


    //6 + 2n => 2n
    //Memory o(2)
    public int Dynamic(int n) {
        int[] fibonacciArray = new int[n];
        fibonacciArray[0] = 0;

        if (n > 1) {
            fibonacciArray[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
        }

        return fibonacciArray[fibonacciArray.length - 1] + fibonacciArray[fibonacciArray.length - 2];
    }
}
