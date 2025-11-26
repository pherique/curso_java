package org.example.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    static void main() {
        // Ler num1
        // Ler num2
        // + - * / %

        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = sc.nextDouble();

        System.out.println("Digite a operação: ");
        String op = sc.next();


        // Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado =  "-".equals(op) ? num1 - num2 : resultado;
        resultado =  "*".equals(op) ? num1 * num2 : resultado;
        resultado =  "/".equals(op) ? num1 / num2 : resultado;
        resultado =  "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %.2s %.2f = %.2f", num1, op, num2, resultado);

        sc.close();

    }
}
