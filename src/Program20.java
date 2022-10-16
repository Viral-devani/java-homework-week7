//Write a Java program to test if an array contains a specific value.
public class Program20 {
    public static void main(String[] args) {

        int[] num_arr = {2, 10, 30, 40, 50};
        int toFind = 40;

        find_array(num_arr, toFind);
    }

    public static void find_array(int[] num_arr, int toFind) {
        boolean found = false;

        for (int n : num_arr) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}
