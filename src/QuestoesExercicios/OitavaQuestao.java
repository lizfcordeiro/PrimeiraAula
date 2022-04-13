package QuestoesExercicios;

import java.util.Scanner;

public class OitavaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a distância total percorrida pelo automóvel ");
        double distancia = teclado.nextDouble();
        System.out.println("Escreva o total de combustível gasto em litros ");
        double combustivel = teclado.nextDouble();
        double consumo = distancia / combustivel;
        System.out.println("O automóvel tem um consumo médio de " + consumo);
    }
}
