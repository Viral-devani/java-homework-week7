/*Write a java program to input any year like (ex.2007) and find out if it is leap year or
not.
 */

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Program2 p1 = new Program2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the year:");
        int year = scanner.nextInt();
        scanner.close();

        p1.leapyear(year);

    }
    public void leapyear(int year) {
        String lyear = (year % 4 == 0 && year % 100 != 0) ? " a leap year" : "not a leap year";
        System.out.println("The year " + year + " is " + lyear);

    }

}
