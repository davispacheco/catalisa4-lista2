package src.exercicio2;

import java.util.Scanner;

public class MediaNotasBimestrais {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a nota do primeiro bimestre:");
        double nota1 = input.nextDouble();
        System.out.println("Informe a nota do segundo bimestre:");
        double nota2 = input.nextDouble();
        System.out.println("Informe a nota do terceiro bimestre:");
        double nota3 = input.nextDouble();
        System.out.println("Informe a nota do quarto bimestre:");
        double nota4 = input.nextDouble();
        input.close();
        double mediaAritmetica = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A média aritmética das notas é: %.1f", mediaAritmetica);
    }
}
