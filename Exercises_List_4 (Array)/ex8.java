import java.util.Scanner;
import java.util.Random;
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 10;
        int numeroTeste = 2131;
        int count = 1;
        int counTeste = 1;
        int primeiroIndex = 0;
        int ultimoIndex = 0;

        System.out.println("------------------");
        System.out.print("Insert how many number you want: ");
        int quantidadeNumeros = sc.nextInt();
        System.out.println("------------------");

        Integer[] listaNumerosPrimeira = new Integer[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i ++){
            int numero = rand.nextInt(upperbound);
            listaNumerosPrimeira[i] = numero;
        }

        System.out.print("[");
        for (int i = 0; i < quantidadeNumeros; i ++) {
            System.out.printf(" %d ", listaNumerosPrimeira[i]);

        }
        System.out.println("]");

        for (int i = 0; i < quantidadeNumeros; i++) {
            if (numeroTeste == listaNumerosPrimeira[i]){
                count += 1;
            }
            else {
                if (counTeste < count){
                    primeiroIndex = i-count;
                    ultimoIndex = i-1;
                    counTeste = count;
                    count = 1;
                }
            }
            numeroTeste = listaNumerosPrimeira[i];
        }
        if (counTeste < count){
            primeiroIndex = quantidadeNumeros-count;
            ultimoIndex = quantidadeNumeros-1;
            counTeste = count;
        }
        if (counTeste == 1){
            System.out.println("Não tem nehuma sequência na lista.");
        }
        else {
            System.out.println("Primeiro Index: " + counTeste);
            System.out.println("Segundo Index: " + counTeste);
            System.out.println("Total: " + counTeste);
        }
    }
}
