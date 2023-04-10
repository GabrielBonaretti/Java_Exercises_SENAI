import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("------------------");
        System.out.print("Insert how many number you want: ");
        int quantidadeNumeros = sc.nextInt();
        System.out.println("------------------");
        int numero;
        int upperbound = 100;
        int testando = 0;

        Integer[] listaNumeros = new Integer[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            numero = rand.nextInt(upperbound);
            listaNumeros[i] = numero;
        }
        System.out.println(Arrays.toString(listaNumeros));

        for (int i = 0; i < quantidadeNumeros; i++) {
            for (int j = i + 1; j < quantidadeNumeros; j++) {
                if (listaNumeros[j] < listaNumeros[i]) {
                    testando = listaNumeros[i];
                    listaNumeros[i] = listaNumeros[j];
                    listaNumeros[j] = testando;
                }
            }
        }

        System.out.println(Arrays.toString(listaNumeros));
        System.out.printf("The max %d\n", listaNumeros[quantidadeNumeros-1]);
        System.out.printf("The min %d", listaNumeros[0]);
    }
}
