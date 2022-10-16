//Write a Java program to sum values of an array.

import java.util.Arrays;

public class Program18 {
    static int num_array[] = {10, 20, 40, 44, 23, 90};

    public static void main(String[] args) {
        System.out.println("Actual array is :" + Arrays.toString(num_array));
        System.out.println("\nSum of this array is :" + sum());
    }
    static int sum() {
        int sum = 0;
        int i;
        for (i = 0; i < num_array.length; i++)
            sum += num_array[i];
        return sum;
    }

}
