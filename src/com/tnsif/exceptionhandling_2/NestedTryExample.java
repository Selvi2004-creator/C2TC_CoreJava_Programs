package com.tnsif.exceptionhandling_2;

public class NestedTryExample {

    public static void main(String[] args) {

        try {
            System.out.println("Outer try started");

            try {
                String name = null;
                System.out.println(name.length()); // NullPointerException
            }
            catch (NullPointerException e) {
                System.out.println("Inner catch: Null value error");
            }

            int a = 20 / 0;  // ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Outer catch: Division by zero error");
        }

        System.out.println("Program finished");
    }
}
