package FpooJava;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroTeste = 0;
        int count = 0;

        System.out.println("------------------");
        System.out.print("Insert how many number you want: ");
        int quantidadeNumeros = sc.nextInt();
        System.out.println("------------------");

        Integer[] listaNumerosPrimeira = new Integer[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i ++){
            System.out.print("Digit a number: ");
            int numero = sc.nextInt();
            listaNumerosPrimeira[i] = numero;
        }

        numeroTeste = listaNumerosPrimeira[0];

        System.out.print("[");
        for (int i = 0; i < quantidadeNumeros; i ++) {
            System.out.printf(" %d ", listaNumerosPrimeira[i]);
        }


        for (int i = 0; i < quantidadeNumeros; i++) {
            if (numeroTeste < listaNumerosPrimeira[i]) {
                System.out.printf(" %d ", listaNumerosPrimeira[i]);
            }
            else {
                System.out.printf("]\n[ %d ", listaNumerosPrimeira[i]);
            }
            numeroTeste = listaNumerosPrimeira[i];

        }           
        System.out.println("]");
    }
}
