package QuestoesExercicios;

import java.util.Scanner;

public class SextaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos reais você deseja converter?");
        double reais = teclado.nextDouble();
        System.out.println("Qual a cotação do euro hoje?");
        double cotacaoEuro = teclado.nextDouble();
        System.out.println("Qual a cotação do dólar hoje?");
        double cotacaoDolar = teclado.nextDouble();
        System.out.println("Qual a cotação do libra hoje?");
        double cotacaoLibra = teclado.nextDouble();
        System.out.println("O valor de Reais: " + reais);
        System.out.println("O valor de reais em dolares: " + (reais/cotacaoDolar));
        System.out.println("O valor de reais em Euro: " + (reais/cotacaoEuro));
        System.out.println("O valor de reais em Libras: " + (reais/cotacaoLibra));

    }
}
