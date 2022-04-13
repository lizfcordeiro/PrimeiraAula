package QuestoesExercicios;

import java.util.Scanner;

public class DecimaPrimeiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor total da compra ");
        double valorTotal = teclado.nextDouble();
        System.out.println("Em cinco prestações sem juros a parcela fica " + (valorTotal / 5));

    }
}
