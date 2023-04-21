// Carrinho de compras: crie um programa que usa um ArrayList para implementar um carrinho de compras simples.
// Os usuários devem poder adicionar itens ao carrinho, remover itens do carrinho, calcular o preço total dos itens e
// exibir os itens no carrinho.

import java.util.*;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        ArrayList<String> itens = new ArrayList<String>();
        ArrayList<Double> preco = new ArrayList<Double>();

        while (true) {
            menu();

            choice = choice(sc, choice);

            if (choice == 1) {
                add(sc, itens, preco);
            } else if (choice == 2) {
                remove(sc, itens, preco);
            } else if (choice == 3) {
                totalPrice(sc, preco);
            } else if (choice == 4) {
                showList(itens, preco);
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Shopping Cart:");
        System.out.println("[1] Add products");
        System.out.println("[2] Remove products");
        System.out.println("[3] Total sum");
        System.out.println("[4] Show list");
    }

    static int choice(Scanner sc, int choice) {
        while (true) {
            try {
                System.out.print("Enter the option you want to perform: ");
                choice = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You can only enter number.");
            }
            sc.nextLine();
        }
        sc.nextLine();

        return choice;
    }

    static void add(Scanner sc, ArrayList<String> itens, ArrayList<Double> preco){
        String product;
        System.out.println("---------------------------------");
        System.out.print("Add product name: ");
        product = sc.nextLine();
        itens.add(product);

        Double productPrice;
        System.out.println("---------------------------------");
        System.out.print("Add product price: ");
        productPrice = sc.nextDouble();
        preco.add(productPrice);
    }

    static void remove(Scanner sc,  ArrayList<String> itens, ArrayList<Double> preco){
        String product;
        System.out.println("---------------------------------");
        System.out.print("Enter the name of the product you want to remove from the shopping cart:");
        product = sc.nextLine();

        if (itens.contains(product)) {
            System.out.printf("The product %s has been successfully removed from shopping cart. \n", product);
            preco.remove(preco.get(itens.indexOf(product)));
            itens.remove(product);

        } else {
            System.out.printf("The product %s is not in the list", product);
        }
    }

    static void totalPrice (Scanner sc, ArrayList<Double> preco){
        Double result = (double) 0;
        for(Double i: preco){
            result += i;
        }
        System.out.printf("Currently the total price of the shopping cart is equal to %.2f \n", result);
    }

    static void showList(ArrayList<String> itens, ArrayList<Double> preco){
        System.out.println("---------------------------------");
        System.out.println("Shopping Cart list:");
        for (String i : itens) {
            System.out.printf("[%d] %s - %s \n", itens.indexOf(i), i, preco.get(itens.indexOf(i)));
        }
    }
}
