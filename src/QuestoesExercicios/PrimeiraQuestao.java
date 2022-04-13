package QuestoesExercicios;

import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a temperatura ");
        double celsiusTemperatura = teclado.nextDouble();

        double kelvinTemperatura = celsiusTemperatura + 273.15;
        double fahrenheitTemperatura = (celsiusTemperatura * 1.8) + 32;
        double rankineTemperatura = (celsiusTemperatura + 1.8) + 32 + 459.67;
        double reaumurTemperatura = celsiusTemperatura * 0.8;

        System.out.println(kelvinTemperatura);
        System.out.println(fahrenheitTemperatura);
        System.out.println(rankineTemperatura);
        System.out.println(reaumurTemperatura);
    }
}
