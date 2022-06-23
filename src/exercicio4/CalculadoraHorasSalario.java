package src.exercicio4;

import java.util.Scanner;

public class CalculadoraHorasSalario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe qual o valor da sua hora:");
        double valorHora = input.nextDouble();
        System.out.println("Informe quantas horas você trabalhou:");
        double horasTrabalhadas = input.nextDouble();
        input.close();
        double salario = valorHora * horasTrabalhadas;
        System.out.printf("O valor de seu salário mensal é de R$%.2f", salario);
    }
}
