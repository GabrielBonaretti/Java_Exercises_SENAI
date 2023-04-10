import java.util.Scanner;
import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.print("Insert how many number you want: ");
        int quantidadeNumeros = sc.nextInt();
        System.out.println("------------------");
        int numero;
        int testando = 0;

        Integer[] listaNumeros = new Integer[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digit a number: ");
            numero = sc.nextInt();
            listaNumeros[i] = numero;
        }

        for (int i = 0; i < quantidadeNumeros; i++) {
            for (int j = i + 1; j < quantidadeNumeros; j++) {
                if (listaNumeros[j] < listaNumeros[i]) {
                    testando = listaNumeros[i];
                    listaNumeros[i] = listaNumeros[j];
                    listaNumeros[j] = testando;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < quantidadeNumeros; i ++) {
            System.out.printf(" %d ", listaNumeros[i]);

        }
        System.out.print("]");
    }
}
