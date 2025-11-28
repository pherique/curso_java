package org.example.controle;

import java.util.Scanner;

public class DesafioWhile {
    static void main() {
        //calcular a média de uma turma

        //usuario vai digitar uma nota valida >= 0 <= 10
        // armazenar essa nota numa variável total, e sempre que uma nova nota for acrescentada,
        // colocar na variável total onde o total armazene a soma de todas as notas
        // outra variavel para definir quantas notas validas foram digitadas
        // no final mostrar a média
        // -1 para sair

        Scanner sc = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota: ");
            nota = sc.nextDouble();
            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            } else if (nota != -1){
                System.out.println("nota inválida");
            }

        }
        // Calcular média
        double media = total / quantidadeDeNotas;
        System.out.println("Media = " + media);

        sc.close();

    }
}
