import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimdento após um mês.
        Considere fixo o juto da poupança em 0,07% a.m.
        */

        double deposito, rendimento, total;
        double juros = 0.0007;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de depósito: ");
        deposito = leitor.nextDouble();

        rendimento = deposito * juros;
        total = deposito + rendimento;

        System.out.println("Em um mês o valor terá um rendimento de: " + total);
    }
}