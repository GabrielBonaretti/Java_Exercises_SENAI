//  Classificações de filmes: construa um programa que usa um mapa para armazenar as classificações de filmes fornecidas
//  pelos usuários. Implemente operações como adicionar novas classificações de filmes, atualizar classificações de filmes existentes, calcular classificações médias e exibir os filmes com melhor classificação.

package Example.Exercises;

import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.reverseOrder;

public class Exercise5List6 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<String, Double>();

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
            } else if (choice == 6) {
                showListOrdered(map);
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Movie classification:");
        System.out.println("[1] Add movie");
        System.out.println("[2] Remove movies");
        System.out.println("[3] Updating movies");
        System.out.println("[4] Searching for products");
        System.out.println("[5] Show all movies");
        System.out.println("[6] Show all highest rating movies");
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

    static void add(Scanner sc, Map<String, Double> map){
        String nameMovie;
        System.out.println("---------------------------------");
        System.out.print("Enter movie name: ");
        nameMovie = sc.nextLine().toLowerCase();

        Double rateMovie;

        while (true){
            try {
                System.out.println("---------------------------------");
                System.out.print("Enter movie rating: ");
                rateMovie = sc.nextDouble();

                if (rateMovie >= 0.0 && rateMovie <= 5.0) {
                    break;
                } else {
                    System.out.println("The rating needs to be beetween 0 and 5 stars");
                }
            }catch (InputMismatchException e){
                System.out.println("You can only enter number.");
            }
        }
        map.put(nameMovie, rateMovie);
    }

    static void remove(Scanner sc, Map<String, Double> map){
        String productName;

        System.out.println("---------------------------------");
        System.out.print("Enter the name of the movie you want to remove: ");
        productName = sc.nextLine().toLowerCase();

        if (map.containsKey(productName)) {
            System.out.printf("The movie %s has been removed. \n", productName);
            map.remove(productName);
        } else {
            System.out.printf("The movie %s is not in inventory.", productName);
        }
    }

    static void updateRating(Scanner sc, Map<String, Double> map){
        String nameMovie;
        System.out.println("---------------------------------");
        System.out.print("Enter movie name: ");
        nameMovie = sc.nextLine().toLowerCase();

        Double rateMovie;

        while (true){
            try {
                System.out.println("---------------------------------");
                System.out.print("Enter the new movie rating: ");
                rateMovie = sc.nextDouble();

                if (rateMovie >= 0.0 && rateMovie <= 5.0) {
                    break;
                } else {
                    System.out.println("The rating needs to be beetween 0 and 5 stars");
                }
            }catch (InputMismatchException e){
                System.out.println("You can only enter number.");
            }
        }
        map.put(nameMovie, rateMovie);
    }

    static void retrieve(Scanner sc, Map<String, Double> map){
        String nameMovie;
        System.out.println("---------------------------------");
        System.out.print("Enter movie name: ");
        nameMovie = sc.nextLine();

        if (map.containsKey(nameMovie)) {
            System.out.printf("The movie %s has rating %.1f. \n", nameMovie, map.get(nameMovie));
        }else{
            System.out.printf("The movie %s has not in list. \n", nameMovie);
        }

    }

    static void showList(Map<String, Double> map){
        Double resultado = (double) 0;
        ArrayList<String> listNames = new ArrayList<>(map.keySet());
        ArrayList<Double> listRating = new ArrayList<Double>(map.values());

        System.out.println("---------------------------------");
        System.out.println("List:");
        for (int i = 0; i < listNames.size(); i++) {
            System.out.printf("[%d] %s - %.1f stars \n", i, listNames.get(i), listRating.get(i));
        }

        for (Double i : listRating){
            resultado = resultado + i;
        }

        System.out.printf("The average rating is: %.2f stars \n", resultado/listRating.size());
    }

    static void showListOrdered(Map<String, Double> map){
        Double resultado = (double) 0;
        System.out.println(map);
        ArrayList<String> listNames = new ArrayList<>(map.keySet());
        ArrayList<Double> listRating = new ArrayList<Double>(map.values());

        Map<Integer, Double> mapIndex = new HashMap<Integer, Double>();

        for (int i = 0; i < listRating.size(); i++) {
            mapIndex.put(i, listRating.get(i));
        }

        ArrayList<Integer> listIndex = new ArrayList<>(mapIndex.keySet());
        ArrayList<Double> listRatingIndex = new ArrayList<Double>(mapIndex.values());

        Collections.sort(listRating, Collections.reverseOrder());

        System.out.println("---------------------------------");
        System.out.println("List ordered: ");

        for (Double i : listRating){
            resultado = resultado + i;
        }

        System.out.printf("The average rating is: %.2f stars \n", resultado/listRating.size());

        for (int i = 0; i < listNames.size(); i++) {
            System.out.printf("[%d] %s - %.1f stars \n", i, listNames.get(listRatingIndex.indexOf(listRating.get(i))), listRating.get(i));
        }
    }
}
