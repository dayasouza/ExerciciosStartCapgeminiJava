import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*A loja Mamão com açúcar está vendendo seus produtos em 5 prestações sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações.
        */

        Scanner leitor = new Scanner(System.in);

        double compra, total, compraJuros;
        int prestacao;
        double juros = 0.02;

        System.out.println("Bem vindo(a) a loja Mamão com Açúcar!");
        System.out.println("Digite o valor da compra: ");
        compra = leitor.nextDouble();

        System.out.println("Em quantas vezes você deseja parcelar? ");
        prestacao = leitor.nextInt();

        if (prestacao <= 5){
            total = compra / prestacao;
            System.out.println("Você parcelou suas compras em " + prestacao + "x sem juros, o valor das parcelas é de: " + total);
        } else if (prestacao > 5){
            total = compra + compra * juros;
            compraJuros = total / prestacao;
            System.out.println("Você parcelou suas comprar em " + prestacao + "x com 2% de juros, o valor das parcelas é de: " + compraJuros);
        }
    }
}