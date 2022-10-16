
/*Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)*/

import java.util.Scanner;

public class Program1 {


    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);


        System.out.println("Enter your number: ");
        int num = s1.nextInt();

        Program1 p1 = new Program1();
        p1.oddeven(num);
        s1.close();

    }

    public void oddeven(int num) {
        String result = num % 2 == 0 ? "Even" : "Odd";//ternary operator
        System.out.println("This number is :" + result);


    }
}
