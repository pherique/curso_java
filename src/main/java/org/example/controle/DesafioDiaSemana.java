package org.example.controle;

import javax.swing.*;
import javax.xml.transform.Source;
import java.util.Scanner;

public class DesafioDiaSemana {
    static void main() {
        //Domingo -> 1;
        //Quarta -> 4;
        //Terça -> 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");

        String diaSemana = sc.nextLine();

        if(diaSemana.equals ("domingo")) {
            System.out.println("Domingo é o dia 1 da semana");
        } else if (diaSemana.equals("segunda")){
            System.out.println("Segunda é o dia 2 da semana");
        } else if (diaSemana.equals("terça")){
            System.out.println("terça é o dia 3 da semana");
        }else if (diaSemana.equals("quarta")){
            System.out.println("quarta é o dia 4 da semana");
        }else if (diaSemana.equals("quinta")){
            System.out.println("quinta é o dia 5 da semana");
        }else if (diaSemana.equals("sexta")){
            System.out.println("sexta é o dia 6 da semana");
        } else if (diaSemana.equals("sabado")){
            System.out.println("Sabado é o dia 7 da semana");
        } else {
            System.out.println("Dia inválido");
        }




        sc.close();
    }
}
