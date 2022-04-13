package QuestoesExercicios;

import java.util.Scanner;

public class DecimaSegundaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o preço de custo do produto ");
        double precoDoProduto = teclado.nextDouble();
        System.out.println("Digite o percentual de acréscimo ");
        double percentual = teclado.nextDouble();
        System.out.println("O valor de venda do produto é " + (precoDoProduto + precoDoProduto*(percentual/100)));
    }
}
