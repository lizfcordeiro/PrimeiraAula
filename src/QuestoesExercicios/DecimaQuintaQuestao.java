package QuestoesExercicios;

import java.util.Scanner;

public class DecimaQuintaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos cavalos foram comprados ");
        int cavalos = teclado.nextInt();
        System.out.println("A quantidade de ferraduras é " + (cavalos * 4));
    }
}
