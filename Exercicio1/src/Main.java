import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Faça um algoritmo que receba dois números e exiba o resultado da sua soma*/

        int x;
        int y;
        int totalSoma;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        x = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        y = teclado.nextInt();

        totalSoma = x + y;
        System.out.println("O resultado da soma é: " + totalSoma);
    }
}