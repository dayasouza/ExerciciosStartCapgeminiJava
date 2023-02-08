import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Leia uma temperatura em graus Celsius e apresente convertida em graus Fahrenheit.
        A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
        */

        int c, f;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        c = leitor.nextInt();

        f = (9 * c + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + f + "F");
    }
}