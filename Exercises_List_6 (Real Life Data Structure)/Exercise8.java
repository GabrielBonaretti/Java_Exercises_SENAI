// Inventário da livraria: Desenvolva um programa que usa um mapa para armazenar informações de livros, incluindo títulos
// de livros como chaves e seus respectivos autores, gêneros e preços como valores. Implemente operações como adicionar
// novos livros, atualizar informações sobre livros, pesquisar livros e exibir o estoque da livraria.

import java.util.*;

public class teste {
    public static void main(String[] args) {
        Map<String, ArrayList<Object>> map = new HashMap<String, ArrayList<Object>>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            int choice = choice(sc);

            if (choice == 1) {
                add(sc, map);
            } else if (choice == 2) {
                remove(sc, map);
            } else if (choice == 3) {
                updateRating(sc, map);
            } else if (choice == 4) {
                retrieve(sc, map);
            } else if (choice == 5) {
                showList(map);
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Bookstore Inventory:");
        System.out.println("[1] Add book");
        System.out.println("[2] Remove book");
        System.out.println("[3] Updating book");
        System.out.println("[4] Searching for book");
        System.out.println("[5] Show all book");
    }

    static int choice(Scanner sc) {
        int choice;

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

    static void add(Scanner sc, Map<String, ArrayList<Object>> map){
        ArrayList<Object> list = new ArrayList<Object>();

        String nameBook;
        System.out.println("---------------------------------");
        System.out.print("Enter book name: ");
        nameBook = sc.nextLine().toLowerCase();

        String autorBook;
        System.out.println("---------------------------------");
        System.out.print("Enter the name of the author of the book: ");
        autorBook = sc.nextLine().toLowerCase();
        list.add(autorBook);

        String genreBook;
        System.out.println("---------------------------------");
        System.out.print("Enter the genre of the book: ");
        genreBook = sc.nextLine().toLowerCase();
        list.add(genreBook);

        double rateMovie;
        System.out.println("---------------------------------");
        System.out.print("Enter book price: ");
        rateMovie = sc.nextDouble();
        list.add(rateMovie);

        map.put(nameBook, list);

    }

    static void remove(Scanner sc, Map<String, ArrayList<Object>> map){
        String nameBook;
        System.out.println("---------------------------------");
        System.out.print("Enter the name of the book you want to remove: ");
        nameBook = sc.nextLine().toLowerCase();

        if (map.containsKey(nameBook)) {
            System.out.printf("The book %s has been removed. \n", nameBook);
            map.remove(nameBook);
        } else {
            System.out.printf("The book %s is not in inventory.", nameBook);
        }
    }

    static void updateRating(Scanner sc, Map<String, ArrayList<Object>> map){
        ArrayList<Object> list = new ArrayList<Object>();

        String nameBook;
        System.out.println("---------------------------------");
        System.out.print("Enter book name: ");
        nameBook = sc.nextLine().toLowerCase();

        if (map.containsKey(nameBook)) {
            String autorBook;
            System.out.println("---------------------------------");
            System.out.print("Enter the name of the author of the book: ");
            autorBook = sc.nextLine().toLowerCase();
            list.add(autorBook);

            String genreBook;
            System.out.println("---------------------------------");
            System.out.print("Enter the genre of the book: ");
            genreBook = sc.nextLine().toLowerCase();
            list.add(genreBook);

            double rateMovie;
            System.out.println("---------------------------------");
            System.out.print("Enter book price: ");
            rateMovie = sc.nextDouble();
            list.add(rateMovie);

            map.put(nameBook, list);
        } else {
            System.out.printf("The book %s is not in inventory.", nameBook);
        }
    }

    static void retrieve(Scanner sc,  Map<String, ArrayList<Object>> map){
        String nameBook;
        System.out.println("---------------------------------");
        System.out.print("Enter book name: ");
        nameBook = sc.nextLine();

        if (map.containsKey(nameBook)) {
            System.out.printf("Book %s by author %s of genre %s with price %s is in inventory.\n", nameBook, map.get(nameBook).get(0), map.get(nameBook).get(1), map.get(nameBook).get(2));
        }else{
            System.out.printf("The movie %s has not in list. \n", nameBook);
        }

    }

    static void showList(Map<String, ArrayList<Object>> map){
        ArrayList<String> listNames = new ArrayList<>(map.keySet());

        System.out.println("---------------------------------");
        System.out.println("List:");
        for (String i : listNames) {
            System.out.printf("[%d] %s - author : %s | genre : %s | price : %s\n", listNames.indexOf(i), i, map.get(i).get(0), map.get(i).get(1), map.get(i).get(2));
        }
    }
}
