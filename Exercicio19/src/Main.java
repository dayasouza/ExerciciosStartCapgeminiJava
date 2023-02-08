import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
        mulher. No final informe total de homens e de mulheres;*/

        String nome [];
        String sexo [];
        int i;

        Scanner leitor = new Scanner(System.in);

        for (i = 0; i <4; i++) {
            System.out.println("Informe o nome: ");
            nome = leitor.next();

            System.out.println("Informe o sexo 'F' feminino / 'M' masculino");
            sexo = leitor.next();
        }

    }
}