package src.exercicio6;

import java.util.Scanner;

public class AntecessorSucessor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = input.nextInt();
        input.close();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O antecessor do número " + numero + " é: " + antecessor);
        System.out.println("O sucessor do número " + numero + " é: " + sucessor);
    }
}
