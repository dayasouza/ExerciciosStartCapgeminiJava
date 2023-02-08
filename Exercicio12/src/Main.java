import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
        dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
        do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
        45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
        */

        float custoConsumidor, custoFabrica, custoImposto;
        float imposto = 0.45f;
        float percentualDistribuidor = 0.28f;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do veículo: ");
        custoFabrica = leitor.nextFloat();

        custoImposto = custoFabrica + custoFabrica * imposto;

        System.out.println("O custo de fábrica do veículo é de: " + custoImposto);

        custoConsumidor = custoImposto + custoImposto * percentualDistribuidor;

        System.out.println("O preço de custo para o consumidor é de: R$ " + custoConsumidor);
    }
}