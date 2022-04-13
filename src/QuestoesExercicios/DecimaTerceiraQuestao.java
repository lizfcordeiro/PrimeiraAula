package QuestoesExercicios;

import java.util.Scanner;

public class DecimaTerceiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o custo de fabrica do carro novo ");
        double custoDeFabrica = teclado.nextDouble();
        double porcentagemDoDistribuidor = 0.28;
        double impostos = 0.45;
        System.out.println("O custo do consumidor final é " + (custoDeFabrica + (custoDeFabrica * porcentagemDoDistribuidor * impostos)));

    }
}
