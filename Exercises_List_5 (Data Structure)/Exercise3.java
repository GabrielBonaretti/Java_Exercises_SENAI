//  Operações de Map: Escreva um programa Java que usa um Map para armazenar pares key-value. Implemente operações como
//  adicionar pares key-value , remover pares key-value , recuperar valores por key e iterar por meio do Map usando keySet() e entrySet().

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        HashMap<Integer, String> H_map = new HashMap<Integer, String>();

        Scanner sc = new Scanner(System.in);

        Integer i = 0;

        while (true) {
            menu();

            int choice = choice(sc);

            if (choice == 1) {
                add(sc, H_map, i);
                i++;
            } else if (choice == 2) {
                remove(sc, H_map);
            } else if (choice == 3) {
                retrieve(sc, H_map);
            } else if (choice == 4) {
                showList(H_map);
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

    static void add(Scanner sc, HashMap<Integer, String> H_map, Integer i){
        String word;
        System.out.println("---------------------------------");
        System.out.print("Enter which word you want to add: ");
        word = sc.nextLine();
        H_map.put(i, word);
    }

    static void remove(Scanner sc, HashMap<Integer, String> H_map){
        int wordIndex;

        while (true){
            try {
                System.out.println("---------------------------------");
                System.out.print("Enter the index of which word you want to remove: ");
                wordIndex = sc.nextInt();
                if (wordIndex < 0 || wordIndex >= H_map.size()) {
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
        String word = H_map.get(wordIndex);
        System.out.println(wordIndex);
        System.out.println(word);
        H_map.remove(wordIndex, word);
    }

    static void retrieve(Scanner sc, HashMap<Integer, String> H_map){
        int wordIndex;

        while (true) {
            try {
                System.out.println("---------------------------------");
                System.out.print("Type the word you want to see: ");
                wordIndex = sc.nextInt();
                if (wordIndex < 0 || wordIndex >= H_map.size()) {
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

        String word = H_map.get(wordIndex);
        for (int i = 0; i < H_map.size(); i++) {
            String wordTest = H_map.get(i);

            if (wordTest == word) {
                System.out.println(word);
                break;
            }

        }

    }

    static void showList(HashMap<Integer, String> H_map){
        System.out.println("---------------------------------");
        System.out.println("List:" + H_map.entrySet());
    }
}
