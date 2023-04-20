// Banco de dados de funcionários: crie um programa que use um ArrayList para gerenciar informações de funcionários,
// incluindo nomes, IDs e salários de funcionários. Implemente operações como adicionar novos funcionários, atualizar
// informações de funcionários, pesquisar funcionários e exibir o banco de dados de funcionários.

package Example.Exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise7List6 {
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);
        int choice = 0;
        ArrayList<String> listNames = new ArrayList<String>();
        ArrayList<Integer> listIDs = new ArrayList<Integer>();
        ArrayList<Double> listSalary = new ArrayList<Double>();

        while (true) {
            menu();

            choice = choice(sc, choice);

            if (choice == 1) {
                add(sc, listNames, listIDs, listSalary);
            } else if (choice == 2) {
                remove(sc, listNames, listIDs, listSalary);
            } else if (choice == 3) {
                retrieve(sc, listNames, listIDs, listSalary);
            } else if (choice == 4) {
                showList(listNames, listIDs, listSalary);
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Employee Database:");
        System.out.println("[1] Add employee");
        System.out.println("[2] Remove employee");
        System.out.println("[3] Retrieve employee");
        System.out.println("[4] Employee list");
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

    static void add(Scanner sc, ArrayList<String> listNames,  ArrayList<Integer> listIDs, ArrayList<Double> listSalary){
        String name;
        System.out.println("---------------------------------");
        System.out.print("Enter the name of the new employee: ");
        name = sc.nextLine();
        listNames.add(name);

        while (true){
            try{
                int id;
                System.out.println("---------------------------------");
                System.out.print("Enter the ID of the new employee: ");
                id = sc.nextInt();
                listIDs.add(id);
                break;
            }catch (InputMismatchException e){
                System.out.println("You can only enter number.");
                sc.nextInt();
            }
        }

        while (true){
            try{
                double salary;
                System.out.println("---------------------------------");
                System.out.print("Enter the salary of the new employee: ");
                salary = sc.nextDouble();
                listSalary.add(salary);
                break;
            }catch (InputMismatchException e){
                System.out.println("You can only enter number.");
                sc.nextDouble();
            }
        }
    }

    static void remove(Scanner sc, ArrayList<String> listNames, ArrayList<Integer> listIDs, ArrayList<Double> listSalary){
        String word;
        int indexWord;

        System.out.println("---------------------------------");
        System.out.print("Enter the employee you want to remove: ");
        word = sc.nextLine();
        if (listNames.contains(word)) {
            listIDs.remove(listNames.indexOf(word));
            listSalary.remove(listNames.indexOf(word));
            listNames.remove(word);
            System.out.printf("This employee %s has been removed from the list. \n", word);
        }else {
            System.out.printf("This employee %s is not in the list. \n", word);
        }
    }

    static void retrieve(Scanner sc, ArrayList<String> listNames, ArrayList<Integer> listIDs, ArrayList<Double> listSalary){
        String wordSearch;
        System.out.println("---------------------------------");
        System.out.print("Type the employee you want to see:");
        wordSearch = sc.nextLine();
        for (String i : listNames) {
            if (i.equalsIgnoreCase(wordSearch)) {
                System.out.printf("The employee %s has ID equal to %d and salary %.2f. \n", wordSearch, listIDs.get(listNames.indexOf(wordSearch)), listSalary.get(listNames.indexOf(wordSearch)));
                break;
            }
        }
    }

    static void showList(ArrayList<String> listNames, ArrayList<Integer> listIDs, ArrayList<Double> listSalary){
        System.out.println("---------------------------------");
        System.out.println("List:");
        for (String i : listNames) {
            System.out.printf("[%d] | Name: %s | ID: %d | Salary: %.2f \n", listNames.indexOf(i), i, listIDs.get(listNames.indexOf(i)), listSalary.get(listNames.indexOf(i)));
        }
    }
}
