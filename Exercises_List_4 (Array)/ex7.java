import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorPar = 0;
        int contadorImpar = 0;
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

            if (numero % 2 == 0){
                contadorPar += 1;
            }
            else {
                contadorImpar += 1;
            }
        }

        Integer[] listaNumerosPar = new Integer[contadorPar];
        Integer[] listaNumerosImpar = new Integer[contadorImpar];

        for (int i = 0; i < quantidadeNumeros; i++) {
            if (listaNumerosPrimeira[i] % 2 == 0){
                listaNumerosPar[count] = listaNumerosPrimeira[i];
                count += 1;
            }
            else {
                listaNumerosImpar[count2] = listaNumerosPrimeira[i];
                count2 += 1;
            }
        }

        System.out.print("[");
        for (int i = 0; i < quantidadeNumeros; i ++) {
            System.out.printf(" %d ", listaNumerosPrimeira[i]);

        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < contadorPar; i ++) {
            System.out.printf(" %d ", listaNumerosPar[i]);

        }
        System.out.println("]");


        System.out.print("[");
        for (int i = 0; i < contadorImpar; i ++) {
            System.out.printf(" %d ", listaNumerosImpar[i]);

        }
        System.out.println("]");
    }
}
