package org.example.fundamentos_operadoresLogicos;

public class Relacionais {
    static void main() {

        int a = 97;
        int b = 'a';

        System.out.println(a == b); // igual
        System.out.println(3 > 4); // maior
        System.out.println(3 >= 3); // maior ou igual
        System.out.println(3 < 7); //  menor
        System.out.println(30 <= 7); // menor ou igual
        System.out.println(30 != 7); // diferente ou igual

        double nota = 9.9;
        boolean comportamento = false;
        boolean passouPorMedia = nota >= 7;

        boolean temDescoto = comportamento && nota >= 7;

        System.out.println("Tem desconto: " + temDescoto);
    }
}
