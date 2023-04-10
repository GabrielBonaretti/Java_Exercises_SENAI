package Example.Exercises2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a number between 1 and 100 (enter '0' to end the code): ");
            double number = sc.nextDouble();

            if (number > 0 && number <= 100) {
                System.out.printf("Twice the number entered is equal to %.2f \n", number * 2);

            } else if (number == 0) {
                System.out.print("Ending code...");
                break;
            } else {
                System.out.println("The number you entered is not between 0 and 100.");
            }
        }
    }
}
