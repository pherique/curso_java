package org.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas notas: ");
        int qtdeNotas = sc.nextInt();
        double[] notas = new double[qtdeNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
            double total = 0;
            for(double nota: notas) {
                total += nota;
            }

            double media = total / notas.length;
            System.out.println("Media é " + media + "!");
        sc.close();
    }
}
