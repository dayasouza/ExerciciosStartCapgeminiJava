import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

        int x, y;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        x = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        y = leitor.nextInt();

        if (x > y){
            System.out.println("O número maior é " + x);
        } else if (x < y){
            System.out.println("O número maior é " + y);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}