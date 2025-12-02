package org.example.controle;

public class DesafioFor {
    static void main() {

        String valor = "#";
        for (int i = 1; i <= 5; i++){
            System.out.println(valor);
            valor += "#";
        }

        // Versão do Desafio
        // Não pode usar valor numérico para controlar o laço!

        for (String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}
