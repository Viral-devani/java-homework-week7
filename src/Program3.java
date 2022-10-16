/*
Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
(marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
 and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35)
 and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C
  And print Mark Sheet in following format
  _______________________________ |
  | | Mark Sheet |
  |_______________________________|
  | Name : Jay |
  | Roll No : 08 |
  |_______________________________|
  | Subjects : Marks |
  |_______________________________|
  | Math : 98 | | Science : 90 |
  | English : 85 |
  |_______________________________|
  | Total : 273 |
  |_______________________________|
  | Percentage : 91.0 |
  | Result : Pass |
  | Grade : A+ /
  |_______________________________|

 */

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int maths, science, english, total;
        double percentage;
        String result;
        String grade = null;

        System.out.println("Please enter student name: ");
        String name = s1.nextLine();

        System.out.println("Please enter student's roll number:");
        int rollnum = s1.nextInt();

        System.out.println("Please enter Maths marks:");
        maths = s1.nextInt();
        if (maths > 100 || maths < 0) {
            System.out.println("invalid input , marks should be between 0 to 100");
            System.exit(0);
        }

        System.out.println("Please enter Science marks:");
        science = s1.nextInt();
        if (science > 100 || science < 0) {
            System.out.println("invalid input , marks should be between 0 to 100");
            System.exit(0);
        }

        System.out.println("Please enter English marks:");
        english = s1.nextInt();
        if (english > 100 || english < 0) {
            System.out.println("invalid input , marks should be between 0 to 100");
            System.exit(0);
        }

        Program3 obj = new Program3();
        total = obj.total(maths, science, english);
        percentage = obj.percentage(total);
        result = obj.result(percentage);
        grade = obj.grade(percentage);

        System.out.println("----------------------------------------");
        System.out.println("|                                       |");
        System.out.println("|           Mark Sheet                  |");
        System.out.println("|---------------------------------------|");
        System.out.println("|  Name:                 " + name + "          |");
        System.out.println("|  Roll No:              " + rollnum + "               |");
        System.out.println("|---------------------------------------|");
        System.out.println("|  Subjects:               Marks             |");
        System.out.println("|_______________________________________|");
        System.out.println("|  Math :                " + maths + "          |");
        System.out.println("|  Science :             " + science + "        |");
        System.out.println("|  English :             " + english + "        |");
        System.out.println("|_______________________________________|");
        System.out.println("|  Total:                " + total + "          |");
        System.out.println("|_______________________________________|");
        System.out.println("|  Percentage :          " + percentage + "          |");
        System.out.println("|  Result :              " + result + "              |");
        System.out.println("|  Grade :               " + grade + "                 |");
        System.out.println("|_______________________________________|");

    }

    public int total(int m1, int s1, int e1) {
        int total1 = m1 + s1 + e1;
        System.out.println("Total Marks are: " + total1);
        return total1;

    }

    public int percentage(int total1) {
        int percentage1 = (total1 * 100) / 300;
        System.out.println("Percentage is: " + percentage1);
        return percentage1;
    }

    public String result(double percentage1) {
        String result1;
        if (percentage1 >= 35) {
            result1 = "Pass";
        } else {
            result1 = "Fail";
        }
        System.out.println("Result is: " + result1);
        return result1;
    }

    public String grade(double percentage1) {
        String grade1 = null;
        if (percentage1 >= 80) {
            grade1 = "A+";
            System.out.println("Grade is: " + grade1);

        } else if (percentage1 >= 60 && percentage1 <= 79) {
            grade1 = "A";
            System.out.println("Grade is: " + grade1);

        } else if (percentage1 >= 50 && percentage1 <= 59) {
            grade1 = "B";
            System.out.println("Grade is: " + grade1);

        } else if (percentage1 >= 35 && percentage1 <= 49) {
            grade1 = "C";
            System.out.println("Grade is: " + grade1);
        }
        return grade1;
    }
}
