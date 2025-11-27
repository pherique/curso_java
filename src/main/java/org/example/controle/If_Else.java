package org.example.controle;

import javax.swing.*;

public class If_Else {
    static void main() {

        String valor = JOptionPane.showInputDialog("Informe o núemro");
        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){
            System.out.println("Numero par:" );
        }

        if (numero % 2 == 1){
            System.out.println("Numero impar: ");
        }

        if (numero % 2 == 0){
            System.out.println("Numero par!");
        } else {
            System.out.println("numero impar!");
        }
    }
}
