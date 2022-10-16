//Write a Java program to calculate the average value of array elements.

import java.util.Arrays;

public class Program19 {
    public static void main(String[] args) {

        double num_ar[] = {89.200, 13.8, 55, 37.5};
        average(num_ar);
    }

    public static void average(double[] num_ar) {
        double total = 0;

        for (int i = 0; i < num_ar.length; i++) {
            total = total + num_ar[i];
        }
        double average = total / num_ar.length;

        System.out.println("Actaual array is :" + Arrays.toString(num_ar));
        System.out.println("The average is :" + average);

    }
}
