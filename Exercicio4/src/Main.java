import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Enunciado:
        Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
        Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e o salário no final do mês.
        */

        String vendedor;
        double salario;
        double vendas;
        double comissao = 1.5;
        double salarioFinal;
        double salarioComissao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        vendedor = leitor.nextLine();

        System.out.println("Digite o valor do salario fixo: ");
        salario = leitor.nextFloat();

        System.out.println("Digite o valor total de vendas no mês: ");
        vendas = leitor.nextFloat();

        salarioComissao = vendas * comissao;
        salarioFinal = (salario + salarioComissao);


        System.out.println("O vendedor(a) " + vendedor + ", tem sálario fixo de " + salario + ", com a comissão ele recebeu esse mês " + salarioFinal);



    }
}