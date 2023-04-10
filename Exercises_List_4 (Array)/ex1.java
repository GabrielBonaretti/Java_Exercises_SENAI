import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.print("Insert how many number you want: ");
        int quantidadePalavras = sc.nextInt();
        System.out.println("------------------");
        int somaPalavras = 0;

        Integer[] listaPalavras = new Integer[quantidadePalavras];

        for (int i = 0; i < quantidadePalavras; i ++){
            System.out.print("Digit a number: ");
            int numero = sc.nextInt();
            listaPalavras[i] = numero;
            somaPalavras += numero;
        }

        int media = somaPalavras/quantidadePalavras;

        System.out.printf("The avarage %d", media);
    }
}
