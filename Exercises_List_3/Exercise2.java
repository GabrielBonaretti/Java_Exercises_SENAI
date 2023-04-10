package Example.Exercicio3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de 'a' na equação de segundo grau: ");
        double valueA = sc.nextDouble();

        System.out.print("Digite o valor de 'b' na equação de segundo grau: ");
        double valueB = sc.nextDouble();

        System.out.print("Digite o valor de 'c' na equação de segundo grau: ");
        double valueC = sc.nextDouble();

        double delta = (valueB*valueB) - (4*valueA*valueC);

        double resultPositive = ((-1*valueB)+Math.pow(delta, 0.5))/(2*valueA);
        double resultNegative = ((-1*valueB)-Math.pow(delta, 0.5))/(2*valueA);
        System.out.printf("O resultado da equação de segundo grau é x'= %.2f ou x''= %.2f.", resultNegative, resultPositive);
    }
}
