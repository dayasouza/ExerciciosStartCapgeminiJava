import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A, passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
        */

        int a, b, aux;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        a = leitor.nextInt();

        System.out.println("Digite o valor de B: ");
        b = leitor.nextInt();

        System.out.println("A= " + a);
        System.out.println("B= " + b);
        System.out.println("Trocando os valores das variáveis...");

        aux = b;
        b = a;
        a = aux;

        System.out.println("A= " + a);
        System.out.println("B= " + b);
    }
}