import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divis~~ao dos dois números lidos.*/

        int x,y, soma, subtracao, multiplicacao, divisao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        x = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        y = leitor.nextInt();

        soma = x + y;
        subtracao = x - y;
        multiplicacao = x * y;
        divisao = x / y;

        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos dois números é: " + subtracao);
        System.out.println("A multiplicação dos dois números é: " + multiplicacao);
        System.out.println("A divisão dos dois números é: " + divisao);
    }
}