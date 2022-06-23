package src.exercicio5;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a temperatura, em graus Fahrenheit:");
        double temperatura = input.nextDouble();
        input.close();
        double resultado = (temperatura - 32) / 1.8;
        System.out.println(temperatura + " graus Fahrenheit equivalem a " + resultado + " graus Celsius.");
    }
}
