package QuestoesExercicios;

import java.util.Scanner;

public class SetimaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite dois números ");
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        System.out.println("A soma dos dois números é " +  soma);
        System.out.println("A subtração dos dois números é " + subtracao);
        System.out.println("A multiplicação dos dois números é " + multiplicacao);
        System.out.printf("A divisão dos dois números é %.2f",divisao);

    }
}
