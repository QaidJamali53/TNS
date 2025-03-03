package com.tns.Polymorphism;

class mo {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum of 3 and 4: " + mo.add(3, 4));
        System.out.println("Sum of 2, 3 and 4: " + mo.add(2, 3, 4));
    }
}
