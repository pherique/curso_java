package org.example.listAndre;

import java.util.Scanner;

public class Aposentadoria {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite Masculino ou Feminino para seu sexo");
        String sexo = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if ("Masculino".equalsIgnoreCase(sexo)){
            System.out.println("Falta " + (70 - idade) + " anos para você se aposentar");
        }else {
            System.out.println("Falta " + (60 - idade) + " anos para você se aposentar");
        }
    }
}
