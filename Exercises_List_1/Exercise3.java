package Example.Exercises;

import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

        System.out.print("Insert a state of Brazil: ");
        String state = sc.nextLine().toLowerCase();

            switch (state) {
                case "acre":
                    System.out.println("Capital: Rio Branco");
                    System.out.println("Population: 869.265");
                    System.out.println("IDH: 0,663");
                    System.out.println("PIB: R$ 13.751.000");
                    break;

                case "amapá":
                    System.out.println("Capital: Macapá");
                    System.out.println("Population: 829.494");
                    System.out.println("IDH: 0,708");
                    System.out.println("PIB: R$ 14.339.000");
                    break;

                case "amazonas":
                    System.out.println("Capital: Manaus");
                    System.out.println("Population: 4.080.611");
                    System.out.println("IDH: 0,674");
                    System.out.println("PIB: R$ 89.017.000");
                    break;

                case "pará":
                    System.out.println("Capital: Belém");
                    System.out.println("Population: 8.513.497");
                    System.out.println("IDH: 0,646");
                    System.out.println("PIB: R$ 138.068.000");
                    break;

                case "rondônia":
                    System.out.println("Capital: Porto Velho");
                    System.out.println("Population: 1.787.279");
                    System.out.println("IDH: 0,725");
                    System.out.println("PIB: R$ 39.451.000");

                case "roraima":
                    System.out.println("Capital: Boa Vista");
                    System.out.println("Population: 576.568");
                    System.out.println("IDH: 0,752");
                    System.out.println("PIB: R$ 11.011.000");
                    break;

                case "tocantins":
                    System.out.println("Capital: Palmas");
                    System.out.println("Population: 1.555.229");
                    System.out.println("IDH: 0,699");
                    System.out.println("PIB: R$ 31.576.000");
                    break;

                case "maranhão":
                    System.out.println("Population: 7.035.055");
                    System.out.println("Capital: São Luís");
                    System.out.println("IDH: 0,639");
                    System.out.println("PIB: R$ 85.286.000");
                    break;

                case "piauí":
                    System.out.println("Capital: Teresina");
                    System.out.println("Population: 3.264.531");
                    System.out.println("IDH: 0,697");
                    System.out.println("PIB: R$ 41.406.000.000");
                    break;

                case "ceará":
                    System.out.println("Capital: Fortaleza");
                    System.out.println("Population: 9.075.649");
                    System.out.println("IDH: 0,735");
                    System.out.println("PIB: R$ 138.379.000.000");
                    break;

                case "rio grande do norte":
                    System.out.println("Capital: Natal");
                    System.out.println("Population: 3.479.010");
                    System.out.println("IDH: 0,731");
                    System.out.println("PIB: R$ 59.661.000.000");
                    break;

                case "paraíba":
                    System.out.println("Capital: João Pessoa");
                    System.out.println("Population: 3.996.496");
                    System.out.println("IDH: 0,722");
                    System.out.println("PIB: R$ 59.089.000.000");
                    break;

                case "pernambuco":
                    System.out.println("Capital: Recife");
                    System.out.println("Population: 9.496.294");
                    System.out.println("IDH: 0,727");
                    System.out.println("PIB: R$ 167.290.000.000");
                    break;

                case "alagoas":
                    System.out.println("Capital: Maceió");
                    System.out.println("Population: 3.322.820");
                    System.out.println("IDH: 0,683");
                    System.out.println("PIB: R$ 13.751.000.000");
                    break;

                case "sergipe":
                    System.out.println("Capital: Aracaju");
                    System.out.println("Population: 2.278.308");
                    System.out.println("IDH: 0,702");
                    System.out.println("PIB: R$ 38.687.000.000");
                    break;

                case "bahia":
                    System.out.println("Capital: Salvador");
                    System.out.println("Population: 14.812.617");
                    System.out.println("IDH: 0,714");
                    System.out.println("PIB: R$ 258.649.000.000");
                    break;

                case "goiás":
                    System.out.println("Capital: Goiânia");
                    System.out.println("Population: 6.921.161");
                    System.out.println("IDH: 0,769");
                    System.out.println("PIB: R$ 181.692.000.000");
                    break;

                case "mato grosso":
                    System.out.println("Capital: Cuiabá");
                    System.out.println("Population: 3.441.998");
                    System.out.println("IDH: 0,772");
                    System.out.println("PIB: R$ 123.834.000.000");
                    break;

                case "mato grosso do sul":
                    System.out.println("Capital: Campo Grande");
                    System.out.println("Population: 2.748.023");
                    System.out.println("IDH: 0,766");
                    System.out.println("PIB: R$ 91.866.000.000");
                    break;

                case "distrito federal":
                    System.out.println("Capital: Brasília");
                    System.out.println("Population: 2.974.703");
                    System.out.println("IDH: 0,850");
                    System.out.println("PIB: R$ 235.497.000.000");
                    break;

                case "espírito santo":
                    System.out.println("Capital: Vitória");
                    System.out.println("Population: 4.016.356");
                    System.out.println("IDH: 0,778");
                    System.out.println("PIB: R$ 128.784.000.000");
                    break;

                case "minas gerais":
                    System.out.println("Capital: Belo Horizonte");
                    System.out.println("Population: 21.119.536");
                    System.out.println("IDH: 0,787");
                    System.out.println("PIB: R$ 544.634.000.000");
                    break;

                case "rio de janeiro":
                    System.out.println("Capital: Rio de Janeiro");
                    System.out.println("Population: 16.718.956");
                    System.out.println("IDH: 0,787");
                    System.out.println("PIB: R$ 640.186.000.000");
                    break;

                case "são paulo":
                    System.out.println("Capital: São Paulo");
                    System.out.println("Population: 45.538.936");
                    System.out.println("IDH: 0,826");
                    System.out.println("PIB: R$ 2.038.005.000.000");
                    break;

                case "santa catarina":
                    System.out.println("Capital: Florianópolis");
                    System.out.println("Population: 6.910.553");
                    System.out.println("IDH: 0,808");
                    System.out.println("PIB: R$ 256.661.000.000");
                    break;

                case "paraná":
                    System.out.println("Capital: Curitiba");
                    System.out.println("Population: 11.348.937");
                    System.out.println("IDH: 0,796");
                    System.out.println("PIB: R$ 401.662.000.000");
                    break;

                case "rio grande do sul":
                    System.out.println("Capital: Porto Alegre");
                    System.out.println("Population: 11.329.605");
                    System.out.println("IDH: 0,792");
                    System.out.println("PIB: R$ 408.645.000.000");
                    break;

                case "finish":
                    System.out.println("Ending code...");
                    System.exit(0);

                default:
                    System.out.println("This state doesn't exist.");
                    break;
            }
        }
    }
}
