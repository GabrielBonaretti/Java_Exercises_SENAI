package exercicios2.java;

import java.util.Random;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int upperbound = 100;

        System.out.println("------------------");
        System.out.print("Insert how many number you want: ");
        int quantidadeNumeros = sc.nextInt();
        int count = quantidadeNumeros;
        System.out.println("------------------");

        Integer[] listaNumerosPrimeira = new Integer[quantidadeNumeros];
        Integer[] listaNumerosSegunda = new Integer[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i ++){
            int numero = rand.nextInt(upperbound);
            listaNumerosPrimeira[i] = numero;
        }

        for (int i = 0; i < quantidadeNumeros; i ++){
            listaNumerosSegunda[i] = listaNumerosPrimeira[count-1];
            count -= 1;
        }

        for (int i = 0; i < quantidadeNumeros; i ++) {
            System.out.printf("%d \n", listaNumerosPrimeira[i]);
        }
        System.out.println();
        for (int i = 0; i < quantidadeNumeros; i ++) {
            System.out.printf("%d ", listaNumerosSegunda[i]);
        }
    }
}
