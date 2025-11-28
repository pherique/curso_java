package org.example.controle;

import java.util.Scanner;

public class DoWhile {
    static void main() {
        // if(..)sentença de código; ou {};
        // while (...) sentença; ou {};
        // for (...; ...; ...;) sentença; ou {}

        // do {} while (...);

        Scanner sc = new Scanner(System.in);

        String texto = "Por favor";

        do {
            System.out.println("Você precisa falar" + "as palavras mágicas...");
            System.out.println("Quer sair?");
            texto = sc.nextLine();
        } while (!texto.equalsIgnoreCase("Por favor"));


        System.out.println("obrigado");
        sc.close();
    }
}
