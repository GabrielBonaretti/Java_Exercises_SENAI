import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Calculadora com orientação a objetos:
               - crie uma calculadora que calcule as áreas de 5 formas geométricas
                (escolhi: quadrado, retangulo, triangulo, losangulo, paralelograma)
               - utilize os conceitos:
                    - abstração;
                    - herança;
                    - polimorfismo de sobrescrista;*/

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Calculadora:");
            System.out.println("[1] Quadrado");
            System.out.println("[2] Retangulo");
            System.out.println("[3] Triangulo");
            System.out.println("[4] Losangulo");
            System.out.println("[5] Paralelograma");
            System.out.print("Digite a forma que você quer calcular: ");
            int escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    Double ladoQuadrado = sc.nextDouble();
                    Quadrado quadrado = new Quadrado(ladoQuadrado);
                    System.out.printf("A área do quadrado é igual a %.2f", quadrado.calculoArea());
                    System.out.printf("O perimetro do quadrado é igual a %.2f", quadrado.calculoPerimetro());
                case 2:
                    System.out.print("Digite a base do retangulo: ");
                    Double baseRetangulo = sc.nextDouble();
                    System.out.print("Digite a altura do retangulo: ");
                    Double alturaRetangulo = sc.nextDouble();
                    Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
                    System.out.printf("A área do retangulo é igual a %.2f", retangulo.calculoArea());
                    System.out.printf("O perimetro do retangulo é igual a %.2f", retangulo.calculoPerimetro());
                case 3:
                    System.out.print("Digite a base do triangulo: ");
                    Double baseTriangulo = sc.nextDouble();
                    System.out.print("Digite a altura do triangulo: ");
                    Double alturaTriangulo = sc.nextDouble();
                    System.out.print("Digite o lado do triangulo: ");
                    Double ladoTriangulo = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, ladoTriangulo);
                    System.out.printf("A área do triangulo é igual a %.2f", triangulo.calculoArea());
                    System.out.printf("O perimetro do triangulo é igual a %.2f", triangulo.calculoPerimetro());
                case 4:
                    System.out.print("Digite o lado do quadrado: ");
                    Double ladoLosangulo = sc.nextDouble();
                    Losangulo losangulo = new Losangulo(ladoLosangulo);
                    System.out.printf("A área do losangulo é igual a %.2f", losangulo.calculoArea());
                    System.out.printf("O perimetro do losangulo é igual a %.2f", losangulo.calculoPerimetro());
                case 5:
                    System.out.print("Digite a base do retangulo: ");
                    Double baseParalelogramo = sc.nextDouble();
                    System.out.print("Digite a altura do retangulo: ");
                    Double alturaParalelogramo = sc.nextDouble();
                    Paralelogramo paralelogramo = new Paralelogramo(baseParalelogramo, alturaParalelogramo);
                    System.out.printf("A área do retangulo é igual a %.2f", paralelogramo.calculoArea());
                    System.out.printf("O perimetro do retangulo é igual a %.2f", paralelogramo.calculoPerimetro());
            }
        }
    }
}