// Set Intersection and Union: Escreva um programa Java que receba dois Sets como entrada e calcule sua interseção e
// união. Exiba os resultados na forma de Conjuntos.

import java.util.*;

public class Exercise5 {

    public static void main(String[] args) {
        Set<String> setList = new HashSet<String>();
        Set<String> setList2 = new HashSet<String>();
        Set<String> listAll = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("---------------------------------");
            System.out.println("Menu:");
            System.out.println("[1] List 1");
            System.out.println("[2] List 2");
            System.out.println("[3] List All");
            System.out.println("[4] Exit");

            choice = choice(sc);

            if (choice == 1) {
                list1(setList);
            } else if (choice == 2) {
                list2(setList2);
            }  else if (choice == 3) {
                unionSets(setList, setList2, listAll);
            }  else if (choice == 4) {
                break;
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void unionSets(Set<String> setList, Set<String> setList2,  Set<String> listAll){
        listAll.addAll(setList);
        listAll.addAll(setList2);

        Iterator<String> it = listAll.iterator();
        int count = 1;


        System.out.println("---------------------------------");
        System.out.println("List:");
        while(it.hasNext()) {
            System.out.printf("[%d] %s \n", count, it.next());
            count ++;
        }
    }

    static void list1(Set<String> setList){
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            int choice = choice(sc);

            if (choice == 1) {
                addList1(sc, setList);
            } else if (choice == 2) {
                remove(sc, setList);
            } else if (choice == 3) {
                retrieve(sc, setList);
            } else if (choice == 4) {
                showList(setList);
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void list2(Set<String> setList2){
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            int choice = choice(sc);

            if (choice == 1) {
                addList1(sc, setList2);
            } else if (choice == 2) {
                remove(sc, setList2);
            } else if (choice == 3) {
                retrieve(sc, setList2);
            } else if (choice == 4) {
                showList(setList2);
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

    static void addList1(Scanner sc, Set<String> list){
        String word;
        System.out.println("---------------------------------");
        System.out.print("Enter which word you want to add: ");
        word = sc.nextLine();
        list.add(word);
    }

    static void remove(Scanner sc, Set<String> list){
        String word;

        System.out.println("---------------------------------");
        System.out.print("Enter the index of which word you want to remove: ");
        word = sc.nextLine();
        if (list.contains(word)) {
            list.remove(word);
            System.out.printf("The word %s has been removed from the list", word);
        }else {
            System.out.printf("The word %s is not in the list", word);
        }
    }

    static void retrieve(Scanner sc, Set<String> list){
        Iterator<String> it = list.iterator();
        String word;
        int count = 1;

        System.out.println("---------------------------------");
        System.out.print("Type the word you want to see: ");
        word = sc.nextLine();
        if (list.contains(word)){

            while(it.hasNext()) {
                if (it.next().equalsIgnoreCase(word)) {
                    System.out.printf("The word %s is at position %d in the list. \n", word, count);
                    break;
                }
                count ++;
            }
        } else{
            System.out.printf("The word %s is not in the list", word);
        }
    }

    static void showList(Set<String> list){
        Iterator<String> it = list.iterator();
        int count = 1;

        System.out.println("---------------------------------");
        System.out.println("List:");
        while(it.hasNext()) {
            System.out.printf("[%d] %s \n", count, it.next());
            count ++;
        }
    }
}
