package Example.Exercises2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float test1 = 0;
        float test2 = 0;
        float test3 = 0;
        float avarege = 0;
        int choiceDiscipline = 0;

        while(true) {

            System.out.println("============================");
            System.out.println("Students:");
            System.out.println("1 - Caue     ");
            System.out.println("2 - Gabriel  ");
            System.out.println("3 - Felipe   ");
            System.out.println("4 - Diego C. ");
            System.out.println("5 - Diego L. ");
            System.out.println("6 - Finish   ");
            System.out.print("Choice the students's number: ");
            int choice = sc.nextInt();
            System.out.println("============================");

            switch (choice) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:
                    System.out.println("Disciplines:");
                    System.out.println("1 - Math");
                    System.out.println("2 - English");
                    System.out.println("3 - Science");
                    System.out.println("4 - Exit");
                    System.out.print("Choice the discipline's number: ");
                    choiceDiscipline = sc.nextInt();
                    System.out.println("============================");

                    switch (choiceDiscipline) {
                        case 1:

                        case 2:

                        case 3:
                            System.out.print("Enter the grade's student in first test: ");
                            test1 = sc.nextFloat();
                            System.out.print("Enter the grade's student in second test: ");
                            test2 = sc.nextFloat();
                            System.out.print("Enter the grade's student in third test: ");
                            test3 = sc.nextFloat();
                            System.out.println("============================");

                            avarege = (test1+test2+test3)/3;

                            System.out.println("Grades:");
                            System.out.printf("Test 1: %.2f \n", test1);
                            System.out.printf("Test 2: %.2f \n", test2);
                            System.out.printf("Test 3: %.2f \n", test3);
                            System.out.printf("Avarage: %.2f \n", avarege);
                            if (avarege >= 7) {
                                System.out.println("The student is approved");
                            }else{
                                System.out.println("The student is repproved");
                            }
                            break;

                        case 4:
                            break;

                        default:
                            System.out.println("error");
                            break;
                    }
                    break;

                case 6:
                    System.out.println("Ending code...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}
