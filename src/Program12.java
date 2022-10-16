/*
Write a program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter any letter,number or symbol : ");
        char ch = s1.next().charAt(0);
        s1.close();
        characteridentify(ch);
    }

    public static void characteridentify(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if ((ch >= '0' && ch <= '9')) {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Symbol.");
        }
    }
}
