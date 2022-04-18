package Praticando;
import java.util.Scanner;

public class AulaTres {
    public static void main(String[] args){

        /**Declaracao de objeto de Inicialização
         * com objeto de entrada predefinida
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual é a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Qual é o seu sexo: ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Você digitou o seu Nome: "+nome);
        System.out.println("Você digitou a sua Idade: "+idade);
        System.out.println("Você digitou o seu Sexo: "+sexo);
    }
}
