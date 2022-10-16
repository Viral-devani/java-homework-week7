/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
 Print in following format
    |______________________________|
    |       Salary Slip            |
    |______________________________|
    | Employee Id : 2564           |
    | Employee Name : Jay          |
    |______________________________|
    | Basic Salary : 25000.0       |
    | HRA 10% : 2500.0             |
    | TA 8% : 2250.0               |
    | DA 9% : 2000.0               |
    | PF - 20& : 5000.0           |
    |_____________________________|
    |Gross Salary : 26750.0       |
   |==============================|
 */

import java.util.Scanner;

public class Program5 {
    static int empId, x, y, z, w;
    static String name;
    static int basicSal;

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your name:  ");
        name = s1.nextLine();

        System.out.println("Enter your EmployeeId:  ");
        empId = s1.nextInt();

        System.out.println("Enter your basic salary:  ");
        basicSal = s1.nextInt();
        s1.close();

        int gross = basicSal + hra() + da() + ta() - pf();

        System.out.println("------------------------------------------");
        System.out.println("|             Salary Slip                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|Employee ID :" + empId + "|");
        System.out.println("|Employee Name :" + name + "|");
        System.out.println("|-----------------------------------------|");
        System.out.println("|Basic Salary :" + basicSal +           "|");
        System.out.println("|HRA 10% :" + x +                       "|");
        System.out.println("|TA  8% :" + z +                       "|");
        System.out.println("|DA  9% :" + y +                      "|");
        System.out.println("|PF -20% :" + w +                     "|");
        System.out.println("|-----------------------------------------|");
        System.out.println("|Gross Salary :"           + gross +                 "|");
        System.out.println("|=========================================|");


    }

    public static int hra() {//with return type no parameter method
        x = (basicSal * 10) / 100;
        return x;
    }

    public static int da() {
        y = (basicSal * 8) / 100;
        return y;

    }

    public static int ta() {
        z = (basicSal * 9) / 100;
        return y;
    }

    public static int pf() {
        w = (basicSal * 20) / 100;
        return w;

    }
}