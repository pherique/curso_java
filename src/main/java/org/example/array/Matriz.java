package org.example.array;

import java.util.Scanner;

public class Matriz {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdAlunos = sc.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {

                System.out.printf("informe a nota %d do aluno %d: ", a, n);
                notasDaTurma[a][n] = sc.nextDouble();
                total += notasDaTurma[a] [n];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Media da turma é: " + media);
        sc.close();
    }
}
