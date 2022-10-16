import java.util.Scanner;

/*
Write a Java program which input any number between 1 to 7
and it print The Days name MONDAY, TUESDAY…..
SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Program13 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number between 1 and 7 : ");
        int day = s1.nextInt();
        s1.close();

        identifyday(day);
    }

    public static void identifyday(int day) {
        switch (day) {
            case 1:
                System.out.println("It is a Monday");
                break;
            case 2:
                System.out.println("It is a Tuesday");
                break;
            case 3:
                System.out.println("It is a Wednesday");
                break;
            case 4:
                System.out.println("It is a Thursday");
                break;
            case 5:
                System.out.println("It is a Friday");
                break;
            case 6:
                System.out.println("It is a Saturday");
                break;
            case 7:
                System.out.println("It is a Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
                break;

        }
    }


}
