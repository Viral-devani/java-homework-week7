/*
Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Program17 {
    public static void main(String[] args) {
        int num_array[] = {35, 90, 27, 43, 89, 103, 304};
        String str_array[] = {"Canada", "Japan", "China", "America", "India"};

        num_array(num_array);
        str_array(str_array);
    }

    public static void num_array(int[] num_array) {
        System.out.println("Actual numeric array is : " + Arrays.toString(num_array));
        Arrays.sort(num_array);
        System.out.println("Sorted numeric array is : " + Arrays.toString(num_array));
    }

    public static void str_array(String[] str_array) {
        System.out.println("\nActual string array is : " + Arrays.toString(str_array));
        Arrays.sort(str_array);
        System.out.println("Sorted string array is : " + Arrays.toString(str_array));
    }
}
