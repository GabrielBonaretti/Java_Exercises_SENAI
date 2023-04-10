import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.print("Insert how many number you want: ");
        int quantidadeNumeros = sc.nextInt();
        System.out.println("------------------");
        int somaPalavras = 0;

        Integer[] listaPalavrasPrimeira = new Integer[quantidadeNumeros];
        Integer[] listaPalavrasSegunda = new Integer[quantidadeNumeros];
        Integer[] listaPalavrasSoma = new Integer[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i ++){
            System.out.print("Digit a number list 1: ");
            int numero = sc.nextInt();
            listaPalavrasPrimeira[i] = numero;
        }

        for (int i = 0; i < quantidadeNumeros; i ++){
            System.out.print("Digit a number list 2: ");
            int numero = sc.nextInt();
            listaPalavrasSegunda[i] = numero;
        }

        for (int i = 0; i < quantidadeNumeros; i ++) {
            listaPalavrasSoma[i] = listaPalavrasPrimeira[i] + listaPalavrasSegunda[i];
        }

        for (int i = 0; i < quantidadeNumeros; i ++) {
            System.out.printf("%d + %d = %d \n", listaPalavrasPrimeira[i], listaPalavrasSegunda[i], listaPalavrasSoma[i]);
        }
    }
}
