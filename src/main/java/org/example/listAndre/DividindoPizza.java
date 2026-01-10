package org.example.listAndre;

import java.util.Scanner;

public class DividindoPizza {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int amigos = 10;
        System.out.println("Coloque o preço da pizza: ");
        double valorPizza = scanner.nextDouble();

        double divisao = valorPizza / amigos;

        System.out.println("Cada amigo terá que pagar: " + divisao);


        scanner.close();
    }
}
