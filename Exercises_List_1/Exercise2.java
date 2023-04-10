package Example.Exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your weight in Kg: ");
        float weight = sc.nextFloat();

        System.out.print("Input your height in meters: ");
        float height = sc.nextFloat();

        float imc = weight/(height*height);

        System.out.printf("Your Body Mass Index is: %.2f", imc);

    }
}
