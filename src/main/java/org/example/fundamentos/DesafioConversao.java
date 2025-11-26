package org.example.fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu primeiro salário: ");
        String valor1 = sc.nextLine().replace(",",".");

        System.out.println("Digite seu segundo salário: ");
        String valor2 = sc.nextLine().replace(",",".");

        System.out.println("Digite seu terceiro salário: ");
        String valor3 = sc.nextLine().replace(",",".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);


        double soma = (salario1 + salario2 + salario3);
        System.out.println("A soma dos salarios é " + soma);

        double media = (salario1 + salario2 + salario3)/3;
        System.out.println("A média dos salario é: " + media);



        sc.close();
    }
}
