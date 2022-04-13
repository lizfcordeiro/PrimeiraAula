package QuestoesExercicios;

import java.util.Scanner;

public class NonaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno e a nota de 3 provas");
        String nome = teclado.nextLine();
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
        System.out.println("A média do aluno é " + media);
    }
}
