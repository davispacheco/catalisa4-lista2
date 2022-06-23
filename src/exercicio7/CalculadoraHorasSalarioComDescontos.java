package src.exercicio7;

import java.util.Scanner;

public class CalculadoraHorasSalarioComDescontos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe qual o valor da sua hora:");
        double valorHora = input.nextDouble();
        System.out.println("Informe quantas horas você trabalhou no mês:");
        double horasTrabalhadas = input.nextDouble();
        input.close();
        double porcentoImpostoRenda = 0.11;
        double porcentoDescontoInss = 0.08;
        double porcentoDescontoSindicato = 0.05;
        double salarioBruto = valorHora * horasTrabalhadas;
        System.out.printf("O valor de seu salário bruto é de R$%.2f", salarioBruto);
        System.out.printf(".\n");
        double impostoRenda = salarioBruto * porcentoImpostoRenda;
        System.out.printf("O valor de seu salário retido para o imposto de renda é de R$%.2f", impostoRenda);
        System.out.printf(".\n");
        double descontoInss = salarioBruto * porcentoDescontoInss;
        System.out.printf("O valor descontado para o INSS é de R$%.2f", descontoInss);
        System.out.printf(".\n");
        double descontoSindicato = salarioBruto * porcentoDescontoSindicato;
        System.out.printf("O valor descontado para o sindicato é de R$%.2f", descontoSindicato);
        System.out.printf(".\n");
        double totalDescontos = impostoRenda + descontoInss + descontoSindicato;
        System.out.printf("O valor total dos descontos é de R$%.2f", totalDescontos);
        System.out.printf(".\n");
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.printf("Seu salário líquido é de R$%.2f", salarioLiquido);
        System.out.printf(".");
    }
}
