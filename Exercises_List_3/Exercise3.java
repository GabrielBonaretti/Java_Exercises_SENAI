package Example.Exercicio3;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.print("Quantidade de nomes: ");
        int quant = sc.nextInt();
        System.out.println("------------------");
        String[] names = new String[quant];

        for (int lista = 0; lista < names.length ; lista++){
            System.out.printf("%dº Nome: ", lista+1);
            String namePeople = sc.next();
            names[lista] = namePeople;
        }

        System.out.println("------------------");

        for (int lista = 0; lista < names.length ; lista++){
            System.out.printf("%dº - %s.\n", lista+1, names[lista]);
        }
    }
}

