import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Elabore o algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$).
        O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.
         */

        double real, dolar, cotacao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em dólar: ");
        dolar = leitor.nextDouble();

        System.out.println("Digite a cotação do dólar: ");
        cotacao = leitor.nextDouble();

        real = dolar * cotacao;

        System.out.println("O valor em real é: R$" + real);
    }
}