package org.example;

import org.example.fibonacci.GetIntFibonacci;

public class Main {
    public static void main(String[] args) {
        GetIntFibonacci getIntFibonacci = new GetIntFibonacci();

        // O(n)
        // O(1) Memory
        System.out.println("Iterator : " + getIntFibonacci.Iterator(6));

        // O(2^n)
        // O(n) Memory
        System.out.println("Recursion : " + getIntFibonacci.Recursion(6));

        // O(n)
        // O(n) Memory
        System.out.println("Dynamic : " + getIntFibonacci.Dynamic(6));
    }
}