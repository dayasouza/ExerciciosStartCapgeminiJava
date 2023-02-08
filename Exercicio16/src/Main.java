import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
        Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
        Recuperação (media entre 5.1 a 6.9); */

        String nomeAluno;
        float nota1, nota2, nota3, media;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do Aluno: ");
        nomeAluno = leitor.next();

        System.out.println("Qual a nota obtida na prova 1: ");
        nota1 = leitor.nextFloat();

        System.out.println("Qual a nota obtida na prova 2: ");
        nota2 = leitor.nextFloat();

        System.out.println("Qual a nota obtida na prova 3: ");
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("O aluno " + nomeAluno + " foi APROVADO");
        } else if (media <= 5) {
            System.out.println("O aluno " + nomeAluno + " foi REPROVADO");
        } else {
            System.out.println("O aluno " + nomeAluno + " está de RECUPERAÇÃO");
        }
    }
}