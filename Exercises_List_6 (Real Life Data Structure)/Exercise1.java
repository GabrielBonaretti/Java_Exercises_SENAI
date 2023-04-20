package Example.Exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0, indexWord = 0;
        String word = null, wordSearch = null;
        ArrayList<String> list = new ArrayList<String>();

        while (true) {
            menu();

            choice = choice(sc, choice);

            if (choice == 1) {
                add(sc, word, list);
            } else if (choice == 2) {
                remove(indexWord, sc, list);
            } else if (choice == 3) {
                retrieve(wordSearch, sc, list);
            } else if (choice == 4) {
                showList(list);
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Contact List:");
        System.out.println("[1] Add contacts");
        System.out.println("[2] Remove contacts");
        System.out.println("[3] Retrieve contacts");
        System.out.println("[4] Contact list");
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

    static void add(Scanner sc, String word, ArrayList<String> list){
        System.out.println("---------------------------------");
        System.out.print("Enter which contact you want to add: ");
        word = sc.nextLine();
        list.add(word);
    }

    static void remove(int indexWord, Scanner sc, ArrayList<String> list){
        String word;

        System.out.println("---------------------------------");
        System.out.print("Enter the contact you want to remove: ");
        word = sc.nextLine();
        if (list.contains(word)) {
            list.remove(word);
            System.out.printf("The contact %s has been removed from the list. \n", word);
        }else {
            System.out.printf("The contact %s is not in the list. \n", word);
        }
    }

    static void retrieve(String wordSearch, Scanner sc, ArrayList<String> list){
        System.out.println("---------------------------------");
        System.out.print("Type the contact you want to see:");
        wordSearch = sc.nextLine();
        for (String i :list) {
            if (i.equalsIgnoreCase(wordSearch)) {
                System.out.printf("The contact %s is at position %d in the list. \n", wordSearch, list.indexOf(wordSearch));
                break;
            }
        }
    }

    static void showList(ArrayList<String> list){
        System.out.println("---------------------------------");
        System.out.println("List:");
        for (String i : list) {
            System.out.printf("[%d] | %s \n", list.indexOf(i), i);
        }
    }
}
