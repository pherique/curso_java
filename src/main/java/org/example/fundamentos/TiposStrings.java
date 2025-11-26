package org.example.fundamentos;

public class TiposStrings {
    static void main() {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa Tarde";
        s = s.toLowerCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome);
        System.out.printf("Nome: %s", nome, sobrenome);


    }
}
