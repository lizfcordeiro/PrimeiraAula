package QuestoesExercicios;

import java.util.Scanner;

public class TerceiraQuestao {
    public static final double TAXA_DE_JUROS_POR_MES = 0.02;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe qual o valor do empréstimo necessário: ");
        double valorDoEmprestimo = teclado.nextDouble();

        System.out.println("Em quantos meses deseja pagar: ");
        double tempo = teclado.nextDouble();

        double montante = valorDoEmprestimo * Math.pow(1 + TAXA_DE_JUROS_POR_MES, tempo);

        System.out.printf("\nO montante final é R$ %.2f que deve ser pago em %.0f meses", montante, tempo);
    }

}
