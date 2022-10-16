import java.util.Scanner;

/*
Write a java program to input any two number and ask user to enter their
 symbol (+, -, /, *) find addition, Subtraction,
multiplication and division according to their symbol
 */
public class Program10 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the calculation symbol Like +, - , / , * :");
        char sys = s1.next().charAt(0);//symbol data type char

        System.out.println("Enter your first number :");
        int a = s1.nextInt();

        System.out.println("Enter your Second number :");
        int b = s1.nextInt();
        s1.close();

        calculator(a,b,sys);
    }
    public static void calculator (int a, int b, char sys){
        if (sys == '+') {
            System.out.println("Addition : "+ a + "+" + b + "=" + (a + b));
        } else if (sys == '-') {
            System.out.println("Subtraction  : "+a + "-" + b + "=" + (a - b));

        } else if (sys == '*') {
            System.out.println("Multiplication : "+a + "*" + b + "=" + (a * b));
        } else {
            System.out.println("Division : "+a + "/" + b + "=" + (a / b));
        }

    }



}

