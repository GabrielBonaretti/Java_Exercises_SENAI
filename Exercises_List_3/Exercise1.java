package Example.Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaNumero = 0;
        int somaNumeroIncognita = 0;
        double resultado;
        int teste = 0;

        ArrayList<Integer> termos = new ArrayList<>();
        ArrayList<Integer> termosIncognita = new ArrayList<>();

        System.out.print("Digite quantos termos a sua equação tem (as letras das incógnitas são limitadas a [x/y/z]): ");
        int quantidadeTermosEquacao = sc.nextInt();

        for (int vezes = 1; vezes <= quantidadeTermosEquacao; vezes++) {
            System.out.printf("Insira %d o termo da equação igualada a zero: ", vezes);
            String termo = sc.next();

            if (termo.contains("x")) {
                String termoArrumado = termo.replace("x", "");
                int termoInteiroIncognita = Integer.parseInt(termoArrumado);
                termosIncognita.add(termoInteiroIncognita);
                teste += 1;
            }
            else if (termo.contains("y")) {
                String termoArrumado = termo.replace("y", "");
                int termoInteiroIncognita = Integer.parseInt(termoArrumado);
                termosIncognita.add(termoInteiroIncognita);
                teste += 1;
            }
            else if (termo.contains("z")) {
                String termoArrumado = termo.replace("z", "");
                int termoInteiroIncognita = Integer.parseInt(termoArrumado);
                termosIncognita.add(termoInteiroIncognita);
                teste += 1;
            }
            else{
                int termoInteiro = Integer.parseInt(termo);
                termos.add(termoInteiro);
            }

        }

        for (int index = 0; index < termos.toArray().length; index++ ){
            somaNumero += termos.get(index);
        }
        for (int index = 0; index < termosIncognita.toArray().length; index++ ){
            somaNumeroIncognita += termosIncognita.get(index);
        }
        if (teste == 0){
            System.out.print("Você não colocou uma incognita.");
        }
        else{
            resultado = (double) somaNumero/somaNumeroIncognita;
            System.out.printf("O resultado da equação é igual a: x = %.2f", resultado);
        }
    }
}

