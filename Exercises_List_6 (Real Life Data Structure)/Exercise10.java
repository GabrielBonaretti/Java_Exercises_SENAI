// Evento RSVP: Construa um programa que usa um Set para acompanhar RSVPs para um evento. Implemente operações como
// adicionar RSVPs, remover RSVPs de convidados que cancelaram, verificar se um convidado fez RSVP e exibir a lista de
// convidados confirmados.

import java.util.*;

public class teste {
    public static void main(String[] args) {
        Set<String> rsvpList = new HashSet<String>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            int choice = choice(sc);

            if (choice == 1) {
                add(sc, rsvpList);
            } else if (choice == 2) {
                remove(sc, rsvpList);
            } else if (choice == 3) {
                retrieve(sc, rsvpList);
            } else if (choice == 4) {
                sizeList(rsvpList);
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Event RSVP:");
        System.out.println("[1] Add RSVP");
        System.out.println("[2] Remove RSVP");
        System.out.println("[3] Checking if a guest has RSVPed");
        System.out.println("[4] List of confirmed guests");
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
        System.out.print("Enter the person's name: ");
        word = sc.nextLine();
        list.add(word);
    }

    static void remove(Scanner sc, Set<String> list){
        String word;

        System.out.println("---------------------------------");
        System.out.print("Enter the name of the person who canceled the invitation: ");
        word = sc.nextLine();
        if (list.contains(word)) {
            list.remove(word);
            System.out.printf("The people %s is no more in confirmed list. \n", word);
        }else {
            System.out.printf("The people %s is not in confirmed list \n", word);
        }
    }

    static void retrieve(Scanner sc, Set<String> list){
        Iterator<String> it = list.iterator();
        String word;

        System.out.println("---------------------------------");
        System.out.print("Enter the people you want to see if he confirmed: ");
        word = sc.nextLine();
        if (list.contains(word)){
            while(it.hasNext()) {
                if (it.next().equalsIgnoreCase(word)) {
                    System.out.printf("The people %s is in confirmed list. \n", word);
                    break;
                }
            }
        } else{
            System.out.printf("The people %s is not in confirmed list \n", word);
        }
    }

    static void sizeList(Set<String> list){
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
