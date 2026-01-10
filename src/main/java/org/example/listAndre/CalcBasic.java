package org.example.listAndre;

import java.util.Scanner;

public class CalcBasic{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();


        int  resultado = numero1 + numero2;
        System.out.println("A soma entre " + numero1 + " e " + numero2 + " é  igual a: " + resultado );



        sc.close();
    }
}
