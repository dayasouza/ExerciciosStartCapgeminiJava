import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;

        int numero;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leitor.nextInt();

        if (numero >= 10){
            System.out.println("O número é maior que 10.");
        } else {
            System.out.println("O número é menor que 10.");
        }
    }
}