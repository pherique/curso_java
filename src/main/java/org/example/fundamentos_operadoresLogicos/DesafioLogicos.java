package org.example.fundamentos_operadoresLogicos;

public class DesafioLogicos {
    static void main() {
        // Trabalho na terça (verdadeiro ou Falso)
        // Trabalho na quinta (verdadeiro ou falso)

        /* se os dois trabalhos darem certos, compra um televisão de 50 polegadas
        *  se apenas um dos trabalhos darem certos, comprar um de 32
        * comprando uma televisão de 50 ou de 32, vamos tomar sorvete no shopping
        * o unico cenário é se ambos trabalhos não darem certo, não vai ao shopping*/

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv 50\"? " + comprouTv50);
        System.out.println("Comprou Tv 32\"? " + comprouTv32);
        System.out.println("Comprou Sorvete\"? " + comprouSorvete);

        // Operador Unário
        System.out.println("Mais saudável\"? " + maisSaudavel);
    }
}
