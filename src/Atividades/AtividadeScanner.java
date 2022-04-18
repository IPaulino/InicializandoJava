package Atividades;
import java.util.Scanner;

public class AtividadeScanner {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o nome do curso: ");
        String curso = scanner.nextLine();

        System.out.println("Digite o período: ");
        int periodo = scanner.nextInt();

        System.out.println("Digite o valor da primeira nota: ");
        float primeiraNota = scanner.nextFloat();

        System.out.println("Digite o valor da segunda nota: ");
        float segundaNota = scanner.nextFloat();

        System.out.println("Digite a quantidade de faltas: ");
        int faltas = scanner.nextInt();

        float media = (primeiraNota+segundaNota)/2;

        System.out.println("Aluno: "+nome);
        System.out.println("Curso: "+curso);
        System.out.printf("Cursando: %dº período\n",(periodo));
        System.out.println("Primeira nota: "+primeiraNota);
        System.out.println("Segunda nota: "+segundaNota);
        System.out.println("Média: "+media);
        System.out.println("Faltas-aula: "+faltas);
    }
}
