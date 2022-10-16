/*
Input any alphabet from “A" to “F” and print their city name accordingly
(use switch statment) if any other alphabet should be invalid entry

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        ArrayList<String>cityname=new ArrayList<>();//creating new array list
        searchcity();

    }
    public static void searchcity(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any alphabet from A to F and the city name from that letter will be displayed");
        String letter = input.next();
        input.close();

        switch (letter.toUpperCase()){
            case "A":
                System.out.println("Alton");
                break;
            case "B":
                System.out.println("Bolton");
                break;
            case "C":
                System.out.println("Camdon");
                break;
            case "D":
                System.out.println("Durby");
                break;
            case "E":
                System.out.println("Essex");
                break;
            case "F":
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Invalid letter Provided");
        }



    }

}
