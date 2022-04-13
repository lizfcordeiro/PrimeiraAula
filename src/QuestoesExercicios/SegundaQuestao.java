package QuestoesExercicios;


import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        System.out.println("Por favor digitar a quantidade de massa em kg, a altura em m e o tempo em segundos ");
        Scanner teclado = new Scanner(System.in);
        double massa = teclado.nextDouble();
        double altura = teclado.nextDouble();
        double tempo = teclado.nextDouble();

        double cavalos = ((massa * altura)/tempo)/745.69;
        System.out.println("Cavalos = " + cavalos);
    }
}
