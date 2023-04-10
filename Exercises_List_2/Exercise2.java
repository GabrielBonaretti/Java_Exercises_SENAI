package Example.Exercises2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 0;
        int amountCountTotal = 0;
        int amountHamburger = 0;
        int amountHotDog = 0;
        int amountBacons = 0;
        int amountPotatos = 0;
        int amountSugars = 0;

        while(true) {

            System.out.println("============================");
            System.out.println("Produtcs:");
            System.out.println("1 - Hamburger - R$ 10,00");
            System.out.println("2 - Hot Dog   - R$ 20,00");
            System.out.println("3 - Bacon     - R$ 30,00");
            System.out.println("4 - Potato    - R$ 40,00");
            System.out.println("5 - Sugar     - R$ 50,00");
            System.out.println("6 - Finish    ----------");
            System.out.print("Choice the product's number: ");
            int choice = sc.nextInt();
            System.out.println("============================");

            switch (choice) {
                case 1:
                    System.out.print("How many hamburgers you want: ");
                    amountHamburger = sc.nextInt();
                    price += amountHamburger * 10;
                    amountCountTotal += amountHamburger;
                    break;

                case 2:
                    System.out.print("How many hot dogs you want: ");
                    amountHotDog = sc.nextInt();
                    price += amountHotDog * 20;
                    amountCountTotal += amountHotDog;
                    break;

                case 3:
                    System.out.print("How many bacons you want: ");
                    amountBacons = sc.nextInt();
                    price += amountBacons * 30;
                    amountCountTotal += amountBacons;
                    break;

                case 4:
                    System.out.print("How many potatos you want: ");
                    amountPotatos = sc.nextInt();
                    price += amountPotatos * 40;
                    amountCountTotal += amountPotatos;
                    break;

                case 5:
                    System.out.print("How many sugars you want: ");
                    amountSugars = sc.nextInt();
                    price += amountSugars * 50;
                    amountCountTotal += amountSugars;
                    break;

                case 6:
                    System.out.println("You request:");
                    System.out.printf("Total price: R$%d \n", price);
                    System.out.printf("Total products: %d \n", amountCountTotal);
                    System.out.printf("Total Hamburgers: %d \n", amountHamburger);
                    System.out.printf("Total Hot Dog: %d \n", amountHotDog);
                    System.out.printf("Total Bacons: %d \n", amountBacons);
                    System.out.printf("Total Potatos: %d \n", amountPotatos);
                    System.out.printf("Total Sugars: %d \n", amountSugars);
                    System.out.println("============================");

                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}
