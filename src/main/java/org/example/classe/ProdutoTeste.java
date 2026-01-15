package org.example.classe;

import java.util.Scanner;

public class ProdutoTeste {

    static void main() {

       // int a = 3;
       // Scanner entrada = new Scanner(System.in);

        Produto p1 = new Produto("Notebook", 4356.89);
       // p1.nome = "Notebook";
       // p1.preco = 4356.89;
       // p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        Produto.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1= p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.1);
        System.out.println((precoFinal1 + precoFinal2) / 2);
    }
}
