/*
Input any alphabet from “A" to “F” and print their city name accordingly
(use if else) if any other alphabet should be invalid entry
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList<>();
        cityName.add("Alton");
        cityName.add("Bolton");
        cityName.add("Camdon");
        cityName.add("Danbury");
        cityName.add("Essex");
        cityName.add("Frankfurt");

        citysearch();
    }
    public static void citysearch() {
        Scanner input = new Scanner(System.in);

        System.out.println("Search city name by letter:");
        String letter = input.next();
        letter = letter.toUpperCase();
        if (letter.startsWith("A")) {
            System.out.println("Alton");
        } else if (letter.startsWith("B")) {
            System.out.println("Bolton");
        } else if (letter.startsWith("C")) {
            System.out.println("Camdon");
        } else if (letter.startsWith("D")) {
            System.out.println("Danbury");
        } else if (letter.startsWith("E")) {
            System.out.println("Essex");
        } else if (letter.startsWith("F")) {
            System.out.println("Franfurt");
        } else {
            System.out.println("This is invalid entry");
        }

    }


}
