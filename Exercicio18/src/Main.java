import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
        “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;*/

        int idade,i;

        Scanner leitor = new Scanner(System.in);


        for(i = 0; i < 76; i++){
            System.out.println("Informe a idade: ");
            idade = leitor.nextInt();
            if(idade >= 18){
                System.out.println("Maior de idade!");
            } else{
                System.out.println("Menor de idade");
            }
        }
    }
}