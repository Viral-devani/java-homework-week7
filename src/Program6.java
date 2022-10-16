/*
Write a java program to input any number and find out if it’s odd or even

 */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number you want to check: ");
        n = s.nextInt();
        s.close();

        oddeven(n);
    }
    public static void oddeven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }
}
