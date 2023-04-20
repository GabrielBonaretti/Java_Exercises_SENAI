//Matrícula de Alunos: Crie um programa que usa um Conjunto para acompanhar os alunos matriculados em um curso.
// Implemente operações como adicionar novos alunos, remover alunos que abandonaram o curso, verificar se um aluno está
// matriculado e exibir a lista de alunos matriculados.

package Example.Exercises;

import java.util.*;

public class Exercise6List6 {
    public static void main(String[] args) {
        Set<String> setList = new HashSet<String>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            int choice = choice(sc);

            if (choice == 1) {
                add(sc, setList);
            } else if (choice == 2) {
                remove(sc, setList);
            } else if (choice == 3) {
                retrieve(sc, setList);
            } else if (choice == 4) {
                sizeList(setList);
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Student Enrollment:");
        System.out.println("[1] Add student");
        System.out.println("[2] Remove student");
        System.out.println("[3] Retrieve student");
        System.out.println("[4] Show list student");
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

    static void add(Scanner sc, Set<String> list){
        String word;
        System.out.println("---------------------------------");
        System.out.print("Enter which student you want to add: ");
        word = sc.nextLine();
        list.add(word);
    }

    static void remove(Scanner sc, Set<String> list){
        String word;

        System.out.println("---------------------------------");
        System.out.print("Enter which student you want to remove: ");
        word = sc.nextLine();
        if (list.contains(word)) {
            list.remove(word);
            System.out.printf("Student %s has been removed from the enrollment list. \n", word);
        }else {
            System.out.printf("Student %s is not on the enrollment list \n", word);
        }
    }

    static void retrieve(Scanner sc, Set<String> list){
        Iterator<String> it = list.iterator();
        String word;
        int count = 1;

        System.out.println("---------------------------------");
        System.out.print("Type the student you want to see: ");
        word = sc.nextLine();
        if (list.contains(word)){

            while(it.hasNext()) {
                if (it.next().equalsIgnoreCase(word)) {
                    System.out.printf("The student %s is at position %d in the list. \n", word, count);
                    break;
                }
                count ++;
            }
        } else{
            System.out.printf("The student %s is not in enrollment list \n", word);
        }
    }

    static void sizeList(Set<String> list){
        int count = 1;
        System.out.println("---------------------------------");
        System.out.println("List:");
        for (String i : list){
            System.out.printf("[%d] %s \n", count, i);
            count++;
        }
    }
}
