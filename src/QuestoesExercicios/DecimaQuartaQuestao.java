package QuestoesExercicios;

import java.util.Scanner;

public class DecimaQuartaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio do círculo ");
        double raioDoCirculo = teclado.nextDouble();
        double area = (raioDoCirculo * raioDoCirculo) * Math.PI;
        System.out.println("O valor da área é " + area);
    }
}
