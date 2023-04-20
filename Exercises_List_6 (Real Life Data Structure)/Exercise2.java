import java.util.*;

public class Exercise2 {
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
        System.out.println("Social Media:");
        System.out.println("[1] Add followers");
        System.out.println("[2] Remove followers");
        System.out.println("[3] Retrieve followers");
        System.out.println("[4] Total number of followers");
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
        System.out.print("Enter which followers you want to add: ");
        word = sc.nextLine();
        list.add(word);
    }

    static void remove(Scanner sc, Set<String> list){
        String word;

        System.out.println("---------------------------------");
        System.out.print("Enter which followers you want to remove: ");
        word = sc.nextLine();
        if (list.contains(word)) {
            list.remove(word);
            System.out.printf("Follower %s is no longer following you. \n", word);
        }else {
            System.out.printf("The follower %s is not in your follower list \n", word);
        }
    }

    static void retrieve(Scanner sc, Set<String> list){
        Iterator<String> it = list.iterator();
        String word;
        int count = 1;

        System.out.println("---------------------------------");
        System.out.print("Type the followers you want to see: ");
        word = sc.nextLine();
        if (list.contains(word)){

            while(it.hasNext()) {
                if (it.next().equalsIgnoreCase(word)) {
                    System.out.printf("The followers %s is at position %d in the list. \n", word, count);
                    break;
                }
                count ++;
            }
        } else{
            System.out.printf("The follower %s is not in your follower list \n", word);
        }
    }

    static void sizeList(Set<String> list){
        System.out.println("---------------------------------");
        System.out.printf("Now you have %d followers. \n", list.size());
    }
}
