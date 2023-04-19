// Operações ArrayList: Escreva um programa Java que demonstre várias operações em uma ArrayList, como adicionar
// elementos, remover elementos, recuperar elementos em índices específicos e iterar na lista usando um loop for-each.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rodrigo {

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
        System.out.println("Menu:");
        System.out.println("[1] Add elements");
        System.out.println("[2] Remove elements");
        System.out.println("[3] Retrieve elements");
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
    
    static void add(Scanner sc, String word, ArrayList<String> list){
        System.out.println("---------------------------------");
        System.out.print("Enter which word you want to add: ");
        word = sc.nextLine();
        list.add(word);
    }

    static void remove(int indexWord, Scanner sc, ArrayList<String> list){
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

    static void retrieve(String wordSearch, Scanner sc, ArrayList<String> list){
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

    static void showList(ArrayList<String> list){
        System.out.println("---------------------------------");
        System.out.println("List:");
        for (String i : list) {
            System.out.printf("[%d] %s \n", list.indexOf(i), i);
        }
    }
}
