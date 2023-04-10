package Example.Exercises2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("============================");
            System.out.println("Options:");
            System.out.println("Triangle Area [1]");
            System.out.println("Square Area [2]");
            System.out.println("Circle Area [3]");
            System.out.println("Rectangle Area [4]");
            System.out.println("End code [5]");
            System.out.print("Choice the option: ");
            int choice = sc.nextInt();
            System.out.println("============================");

            switch (choice) {
                case 1:
                    System.out.print("Insert the base of the triangle in cm: ");
                    float baseTriangle = sc.nextFloat();

                    System.out.print("Enter the height of the triangle in cm: ");
                    float heightTriangle = sc.nextFloat();

                    float areaTriangle = (heightTriangle * baseTriangle) / 2;

                    System.out.printf("The area of triangle is %.2f cm². \n", areaTriangle);
                    break;

                case 2:
                    System.out.print("Enter the value of the side of the square in cm: ");
                    float sideSquare = sc.nextFloat();

                    float areaSquare = sideSquare * sideSquare;

                    System.out.printf("The area of square is %.2f cm². \n", areaSquare);
                    break;

                case 3:
                    System.out.print("Enter the radius of the circle in cm: ");
                    float radiusCircle = sc.nextFloat();

                    float areaCircle = (float) (3.14 * (radiusCircle * radiusCircle));

                    System.out.printf("The area of circle is %.2f cm². \n", areaCircle);
                    break;

                case 4:
                    System.out.print("Insert the base of the rectangle in cm: ");
                    float baseRectangle = sc.nextFloat();

                    System.out.print("Insert the height of the rectangle in cm: ");
                    float heightRectangle = sc.nextFloat();

                    float areaRectangle = baseRectangle * heightRectangle;

                    System.out.printf("The area of rectangle is %.2f cm². \n", areaRectangle);
                    break;

                case 5:
                    System.out.println("Ending code...");
                    System.exit(0);

                default:
                    System.out.println("This option doesn't exist.");
                    break;

            }
        }
    }
}
