package org.example.classe;

public class Produto {


    // Clase
    String nome;
    double preco;
    static double desconto = 0.25  ; // entre 0 e 1;

    Produto(){

    }

    Produto(String nomeIncial, double precoInicial){
        nome  = nomeIncial;
        preco = precoInicial;
    }
    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
