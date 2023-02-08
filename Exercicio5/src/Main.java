import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
        No final, informar o nome do aluno e a sua média (aritmética).
         */

        String aluno;
        int nota1, nota2, nota3, media;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno(a): ");
        aluno = leitor.nextLine();

        System.out.println("Digite a Primeira nota: ");
        nota1 = leitor.nextInt();

        System.out.println("Digite a Segunda nota: ");
        nota2 = leitor.nextInt();

        System.out.println("Digite a Terceira nota: ");
        nota3 = leitor.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O aluno " + aluno + ", ficou com a média: "+ media + ", no final do semestre");
    }
}