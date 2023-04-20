// Biblioteca de Música: Desenvolva um programa que usa ArrayList para gerenciar uma biblioteca de música. Os usuários
// devem poder adicionar novas músicas, remover músicas existentes, pesquisar músicas por título ou artista e exibir toda a biblioteca de músicas.

package Example.Exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4List6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String wordSearch = null;
        ArrayList<String> music = new ArrayList<String>();
        ArrayList<String> artist = new ArrayList<String>();

        while (true) {
            menu();

            choice = choice(sc, choice);

            if (choice == 1) {
                add(sc, music, artist);
            } else if (choice == 2) {
                remove(sc, music, artist);
            } else if (choice == 3) {
                retrieve(sc, music, artist);
            } else if (choice == 4) {
                showList(music, artist);
            } else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Library Music :");
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

    static void add(Scanner sc, ArrayList<String> music, ArrayList<String> artist){
        String musicName;
        System.out.println("---------------------------------");
        System.out.print("Add music name: ");
        musicName = sc.nextLine();
        music.add(musicName);

        String musicArtist;
        System.out.println("---------------------------------");
        System.out.print("Add music artist: ");
        musicArtist = sc.nextLine();
        artist.add(musicArtist);
    }

    static void remove(Scanner sc,  ArrayList<String> music, ArrayList<String> artist){
        String word;

        System.out.println("---------------------------------");
        System.out.print("Enter the name of the song you want to remove from the list:");
        word = sc.nextLine();
        if (music.contains(word)) {
            System.out.printf("The music %s by artist %s has been successfully removed. \n", word, artist.get(music.indexOf(word)));
            artist.remove(artist.get(music.indexOf(word)));
            music.remove(word);

        } else {
            System.out.printf("The music %s is not in the list", word);
        }
    }

    static void retrieve(Scanner sc,  ArrayList<String> music, ArrayList<String> artist){
        String wordSearch;
        System.out.println("---------------------------------");
        System.out.print("Enter the song you want to search for: ");
        wordSearch = sc.nextLine();
        for (String i :music) {
            if (i.equalsIgnoreCase(wordSearch)) {
                System.out.printf("The music %s by artist %s is at position %d in the list. \n", wordSearch, artist.get(music.indexOf(wordSearch)), music.indexOf(wordSearch));
                break;
            }
        }
    }

    static void showList( ArrayList<String> music, ArrayList<String> artist){
        System.out.println("---------------------------------");
        System.out.println("Music list:");
        for (String i : music) {
            System.out.printf("[%d] %s - %s \n", music.indexOf(i), i, artist.get(music.indexOf(i)));
        }
    }
}
