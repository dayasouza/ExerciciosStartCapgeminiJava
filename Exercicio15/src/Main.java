import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

        int numero;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leitor.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("Este número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("Este número está fora do intervalo entre 100 e 200.");
        }

    }
}