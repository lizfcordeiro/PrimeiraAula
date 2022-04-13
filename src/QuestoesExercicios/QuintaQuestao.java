package QuestoesExercicios;

import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o salário do funcionário ");
        double salario = teclado.nextDouble();
        System.out.println("O salário reajustado é " + (salario * 1.07));

    }
}
