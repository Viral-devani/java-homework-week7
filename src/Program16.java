import java.util.Scanner;

/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or "ZERO".
 */
public class Program16 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = s1.nextInt();

        numbercheck(number);
    }

    public static void numbercheck(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");

        } else if (number < 0) {
            System.out.println(number + " is a Nagative number");

        } else {
            System.out.println(number + " is a Zero");
        }
    }


}
