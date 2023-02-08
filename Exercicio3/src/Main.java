import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto*/

        double consumoMedio;
        int km;
        int l;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o km percorrido: ");
        km = leitor.nextInt();

        System.out.println("Digite quantos litros foram consumidos: ");
        l = leitor.nextInt();

        consumoMedio = km / l;
        System.out.println("O consumo médio do automóvel é " + consumoMedio + " km/l");

    }
}