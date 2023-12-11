package org.example;

import org.example.fibonacci.GetIntFibonacci;

public class Main {
    public static void main(String[] args) {
        GetIntFibonacci getIntFibonacci = new GetIntFibonacci();

        System.out.println("Iterator : " + getIntFibonacci.Iterator(6));

        System.out.println("Recursion : " + getIntFibonacci.Recursion(6));

        System.out.println("Dynamic : " + getIntFibonacci.Dynamic(4));
    }
}