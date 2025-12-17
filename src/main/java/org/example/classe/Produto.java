package org.example.classe;

public class Produto {


    // Clase
    String nome;
    double preco;
    double desconto; // entre 0 e 1;

    Produto(){

    }

    Produto(String nomeIncial, double precoInicial, double descontoInicial){
        nome  = nomeIncial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
