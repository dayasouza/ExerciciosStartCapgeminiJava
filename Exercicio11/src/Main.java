import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
        Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;*/

        float precoCusto, precoVenda, percentual;
        String produto;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o produto que deseja cadastrar: ");
        produto = leitor.next();

        System.out.println("Digite o preço de custo do produto: ");
        precoCusto = leitor.nextFloat();

        System.out.println("Digite o percentual de lucro: ");
        percentual = leitor.nextFloat();

        precoVenda = precoCusto + precoCusto * percentual;

        System.out.println("O valor de venda  da " + produto + " é de: " + precoVenda);
    }
}