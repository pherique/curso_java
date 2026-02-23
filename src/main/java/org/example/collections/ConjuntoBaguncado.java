package org.example.collections;

import java.util.HashSet;

public class ConjuntoBaguncado {
    static void main() {

        HashSet conjunto = new HashSet<>();

        conjunto.add(1); // double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');
    }
}
