package com.tnsif.exceptionhandling_2;
public class MultipleCatchExample {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;          // ArithmeticException
            int[] arr = new int[3];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e);
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e);
        }

        System.out.println("Program continues...");
    }
}
