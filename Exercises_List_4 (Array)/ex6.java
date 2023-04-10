import java.util.Random;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int count2 = 0;

        System.out.println("------------------");
        System.out.print("Insert how many number you want: ");
        int quantidadeNumeros = sc.nextInt();
        System.out.println("------------------");

        Integer[] listaNumerosPrimeira = new Integer[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i ++){
            System.out.print("Digit a number: ");
            int numero = sc.nextInt();
            listaNumerosPrimeira[i] = numero;
            if (numero != 0){
                count += 1;
            }
        }

        Integer[] listaNumerosSegunda = new Integer[count];

        for (int i = 0; i < quantidadeNumeros; i++) {
            if (listaNumerosPrimeira[i] != 0){
                listaNumerosSegunda[count2] = listaNumerosPrimeira[i];
                count2 += 1;
            }
        }

        System.out.print("[");
        for (int i = 0; i < quantidadeNumeros; i ++) {
            System.out.printf(" %d ", listaNumerosPrimeira[i]);

        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < count; i ++) {
            System.out.printf(" %d ", listaNumerosSegunda[i]);

        }
        System.out.println("]");

    }
}

