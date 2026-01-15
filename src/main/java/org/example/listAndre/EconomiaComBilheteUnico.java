package org.example.listAndre;

import java.util.Scanner;

public class EconomiaComBilheteUnico {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor da passagem? ");
        double precoPassagem = scanner.nextDouble();

        System.out.println("Quantas viagens fará por mês? ");
        int viagens = scanner.nextInt();

        double economia = 2.15 / precoPassagem;

        System.out.println("Você economizará " + economia);

        scanner.close();
    }
}
