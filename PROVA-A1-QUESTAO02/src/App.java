import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String placa;
        double valor_por_litro;
        double km_60;
        double km_80;
        double km_100;
        double km_120;
        double km_140;
        double litro_gasto_60km;
        double litro_gasto_80km;
        double litro_gasto_100km;
        double litro_gasto_120km;
        double litro_gasto_140km;
        double gasto_total_combustivel;
        double custo_total;
        double distancia_total_percorrida;
        double tempo;
        double velocidade_media_ponderada;

        System.out.println("Qual a placa do veiculo?");
        System.out.print("> ");
        placa = entrada.nextLine();
        System.out.println("\n");

        System.out.println("Qual o valor do litro da gasolina?");
        System.out.print("> ");
        valor_por_litro = entrada.nextDouble();
        System.out.println("\n");

        System.out.println("Quantos quilometros foram rodados a 60 Km/h?");
        System.out.print("> ");
        km_60 = entrada.nextDouble();
        System.out.println("\n");

        System.out.println("Quantos quilometros foram rodados a 80 Km/h?");
        System.out.print("> ");
        km_80 = entrada.nextDouble();
        System.out.println("\n");

        System.out.println("Quantos quilometros foram rodados a 100 Km/h?");
        System.out.print("> ");
        km_100 = entrada.nextDouble();
        System.out.println("\n");

        System.out.println("Quantos quilometros foram rodados a 120 Km/h?");
        System.out.print("> ");
        km_120 = entrada.nextDouble();
        System.out.println("\n");

        System.out.println("Quantos quilometros foram rodados a 140 Km/h?");
        System.out.print("> ");
        km_140 = entrada.nextDouble();
        System.out.println("\n");

        entrada.close();

        litro_gasto_60km = km_60 / 30.7;
        litro_gasto_80km = km_80 / 26.8;
        litro_gasto_100km = km_100 / 22.4;
        litro_gasto_120km = km_120 / 18.1;
        litro_gasto_140km = km_140 / 14.5;

        gasto_total_combustivel = litro_gasto_60km + litro_gasto_80km + litro_gasto_100km + litro_gasto_120km + litro_gasto_140km;
        
        custo_total = gasto_total_combustivel * valor_por_litro;

        distancia_total_percorrida = km_60 + km_80 + km_100 + km_120 + km_140;

        tempo = distancia_total_percorrida / 60;

        velocidade_media_ponderada = distancia_total_percorrida / tempo;

        System.out.printf("Placa do veiculo: %s",placa);
        System.out.println("\n");

        System.out.printf("O consumo total em litros foi de: %.4f Litros",gasto_total_combustivel);
        System.out.println("\n");

        System.out.printf("O custo total da viagem ficou em: R$ %.2f",custo_total);
        System.out.println("\n");

        System.out.printf("O valor da velocidade media ponderada e: %.4f Km/h",velocidade_media_ponderada);
        System.out.println("\n");


    }

}
