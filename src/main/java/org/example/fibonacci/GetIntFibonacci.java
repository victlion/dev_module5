package org.example.fibonacci;

import java.util.Arrays;

//0, 1, 1, 2, 3, 5, 8, 13, 21
public class GetIntFibonacci {
    public int Iterator(int n) {
        int number = 0, second = 1;

        for (int i = 0; i < n; i++) {
            int next = number + second;
            number = second;
            second = next;
        }
        return number;
    }

    public int Recursion(int n){
        if (n <= 1) {
            return n;
        } else {
            return Recursion(n - 1) + Recursion(n - 2);
        }
    }

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
