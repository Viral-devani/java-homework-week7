/*
Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
 < 10,000 2%
 */

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Sellers name : ");
        String name = s1.nextLine();

        System.out.println("Enter Sales Id : ");
        int sale_id = s1.nextInt();

        System.out.println("Enter Sales amount : ");
        int sale_amt = s1.nextInt();

        System.out.println("Enter basic salary : ");
        int basic_sal = s1.nextInt();
        s1.close();

        commision(sale_amt);
    }

    public static void commision(int sale_amt) {
        int commission;
        //conditional statments to find out the commision value based on salary
        if (sale_amt >= 50000) {
            commission = (sale_amt * 35) / 100;
            System.out.println("Sales commission is " + commission);
        } else if (sale_amt >= 30000 && sale_amt <= 49999) {
            commission = (sale_amt * 20) / 100;
            System.out.println("Sales commission is " + commission);
        } else if (sale_amt >= 20000 && sale_amt <= 29999) {
            commission = (sale_amt * 10) / 100;
            System.out.println("Sales commission is " + commission);
        } else if (sale_amt >= 10000 && sale_amt <= 19999) {
            commission = (sale_amt * 5) / 100;
            System.out.println("Sales commission is " + commission);
        } else if (sale_amt < 10000) {
            commission = (sale_amt * 2) / 100;
            System.out.println("Sale commision is " + commission);
            {

            }
        }

    }

}
