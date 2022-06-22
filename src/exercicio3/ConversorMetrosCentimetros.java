package src.exercicio3;

import java.util.Scanner;

public class ConversorMetrosCentimetros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe aqui os metros a converter em centímetros:");
        double metros = input.nextDouble();
        input.close();
        double centimetros = metros * 100;
        System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");
    }
}
