/*Write a java program to print the numbers between 1 to 100 which can be divided by 3
        and 5 separately.*/

public class Program11 {
    public static void main(String[] args) {

        division3();
        division5();
    }

    public static void division3() {
        System.out.println("These numbers can divided by 3 : ");

        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
    }

    public static void division5() {
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("These numbers can devided by 5 : ");

        int x;
        for (x = 1; x <= 100; x++) {
            if (x % 5 == 0) {
                System.out.print(x + ",");
            }
        }
    }
}

