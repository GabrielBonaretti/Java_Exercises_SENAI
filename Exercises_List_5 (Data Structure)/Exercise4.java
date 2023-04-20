//  ArrayList vs. LinkedList: Compare o desempenho de ArrayList e LinkedList em Java medindo o tempo gasto para várias
//  operações, como adição de elementos, remoção de elementos e recuperação de elementos em índices específicos.
//  Analise os resultados e tire conclusões.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (true){
            System.out.println("---------------------------------");
            System.out.println("Menu:");
            System.out.println("[1] Array List");
            System.out.println("[2] Linked List");
            System.out.println("[3] Exit");

            choice = choice(sc, choice);

            if (choice == 1) {
                array();
            } else if (choice == 2) {
                likedlist();
            }  else if (choice == 3) {
                break;
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    static void array(){
        Scanner sc = new Scanner(System.in);
        int choice = 0, indexWord = 0;
        String word = null, wordSearch = null;
        ArrayList<String> list = new ArrayList<String>();

        while (true) {
            menu();

            choice = choice(sc, choice);

            if (choice == 1) {
                addArray(sc, word, list);
            } else if (choice == 2) {
                removeArray(indexWord, sc, list);
            } else if (choice == 3) {
                retrieveArray(wordSearch, sc, list);
            } else if (choice == 4) {
                showListArray(list);
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Menu:");
        System.out.println("[1] Add elements");
        System.out.println("[2] Remove elements");
        System.out.println("[3] Retrieve elements");
        System.out.println("[4] Show list");
        System.out.println("[5] Exit");
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

    static void addArray (Scanner sc, String word, ArrayList<String> list){
        System.out.println("---------------------------------");
        System.out.print("Enter which word you want to add: ");
        word = sc.nextLine();
        list.add(word);
    }

    static void removeArray (int indexWord, Scanner sc, ArrayList<String> list){
        while (true){
            try {
                System.out.println("---------------------------------");
                System.out.print("Enter the index of which word you want to remove:");
                indexWord = sc.nextInt();
                if (indexWord < 0 || indexWord >= list.size()) {
                    System.out.println("This index is out of the list");
                    continue;
                }else {
                    break;
                }
            }catch (InputMismatchException e) {
                System.out.println("You can only enter number.");
            }
            sc.nextLine();
        }
        list.remove(indexWord);
    }

    static void retrieveArray (String wordSearch, Scanner sc, ArrayList<String> list){
        System.out.println("---------------------------------");
        System.out.print("Type the word you want to see:");
        wordSearch = sc.nextLine();
        for (String i :list) {
            if (i.equalsIgnoreCase(wordSearch)) {
                System.out.printf("The word %s is at position %d in the list. \n", wordSearch, list.indexOf(wordSearch));
                break;
            }
        }
    }

    static void showListArray (ArrayList<String> list){
        System.out.println("---------------------------------");
        System.out.println("List:");
        for (String i : list) {
            System.out.printf("[%d] %s \n", list.indexOf(i), i);
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    static void likedlist(){
        Scanner sc = new Scanner(System.in);
        int choice = 0, indexWord = 0;
        String word = null, wordSearch = null;
        LinkedList<String> list = new LinkedList<String>();

        while (true) {
            menu();

            choice = choice(sc, choice);

            if (choice == 1) {
                addLinked(sc, word, list);
            } else if (choice == 2) {
                removeLinked(indexWord, sc, list);
            } else if (choice == 3) {
                retrieveLinked(wordSearch, sc, list);
            } else if (choice == 4) {
                showListLinked(list);
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void addLinked (Scanner sc, String word, LinkedList<String> list){
        System.out.println("---------------------------------");
        System.out.print("Enter which word you want to add: ");
        word = sc.nextLine();
        list.addFirst(word);
    }

    static void removeLinked (int indexWord, Scanner sc, LinkedList<String> list){
        while (true){
            try {
                System.out.println("---------------------------------");
                System.out.print("Enter the index of which word you want to remove:");
                indexWord = sc.nextInt();
                if (indexWord < 0 || indexWord >= list.size()) {
                    System.out.println("This index is out of the list");
                    continue;
                }else {
                    break;
                }
            }catch (InputMismatchException e) {
                System.out.println("You can only enter number.");
            }
            sc.nextLine();
        }
        list.remove(indexWord);
    }

    static void retrieveLinked (String wordSearch, Scanner sc, LinkedList<String> list){
        System.out.println("---------------------------------");
        System.out.print("Type the word you want to see:");
        wordSearch = sc.nextLine();
        for (String i :list) {
            if (i.equalsIgnoreCase(wordSearch)) {
                System.out.printf("The word %s is at position %d in the list. \n", wordSearch, list.indexOf(wordSearch));
                break;
            }
        }
    }

    static void showListLinked (LinkedList<String> list){
        System.out.println("---------------------------------");
        System.out.println("List:");
        for (String i : list) {
            System.out.printf("[%d] %s \n", list.indexOf(i), i);
        }
    }

}
