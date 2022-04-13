package QuestoesExercicios;

import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a idade da pessoa: ");
        int idadeDaPessoa = teclado.nextInt();
        int quantidadeDeDias = idadeDaPessoa * 365;

        System.out.printf("\nA quantidade de dias que você viveu é %d", quantidadeDeDias);

    }

}
