package QuestoesExercicios;

import java.util.Scanner;

public class DecimaQuestao {
    public static final double TAXA_DE_JUROS_DA_POUPANCA = 1.007;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor que foi depositado ");
        double deposito = teclado.nextDouble();
        System.out.printf("O rendimento após um mês é de %.2f",(deposito * TAXA_DE_JUROS_DA_POUPANCA));
    }
}
