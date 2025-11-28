package org.example.controle;

import java.util.Scanner;

public class WhileIndeterminado {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String valor = "";
        while (!valor.equalsIgnoreCase("sair")){
            System.out.print("você diz: ");
            valor = sc.nextLine();
        }


        sc.close();
    }
}
