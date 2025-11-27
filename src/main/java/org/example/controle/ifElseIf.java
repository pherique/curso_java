package org.example.controle;

import java.util.Scanner;

public class ifElseIf {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();
        if(nota > 10 || nota < 0){
            System.out.println("nota invalida");
        } else{
            if (nota >=8.1) {
                System.out.println("Conceito A");
            } else {
                if (nota >= 6.1){
                    System.out.println("Conceito B");
                }
            }
        }
        sc.close();
    }
}
