import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int linha_tesouro = rand.nextInt(5);
        int coluna_tesouro = rand.nextInt(5);
        int x = 3;

        String[][] matriz = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = "-";
            }
        }

        System.out.println("Bem vindo! Ache o tesouro!");
        printarTabela(matriz);

        while (x>0) {
            System.out.println("-=-=--=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Chances: "+x);
            System.out.print("Digite a linha: ");
            int linha_teste = sc.nextInt()-1;
            System.out.print("Digite a coluna: ");
            int coluna_teste = sc.nextInt()-1;

            if (linha_teste == linha_tesouro && coluna_teste == coluna_tesouro) {
                matriz[linha_tesouro][coluna_tesouro] = "*";
                printarTabela(matriz);
                break;
            }
            else{
                matriz[linha_teste][coluna_teste] = "x";
            }

            printarTabela(matriz);
            x -= 1;
        }
    }

    public static void printarTabela(String[][] matriz){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}