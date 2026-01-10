package org.example.listAndre;

import java.util.Scanner;

public class MakingDivision {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numberOne = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double numberTwo = scanner.nextDouble();

        double resultado = numberOne / numberTwo;

        double resto = numberOne % numberTwo;

        System.out.println("A divisão entre " + numberOne + " e " + numberTwo + " é " + resultado);
        System.out.println("O resto da divisão é " + resto );
        scanner.close();
    }

}
