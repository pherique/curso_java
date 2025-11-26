package org.example.fundamentos_operadoresLogicos;

public class Logicos {
    static void main() {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); // and
        System.out.println(condicao1 || condicao2); // or
        System.out.println(condicao1 ^ condicao2); // xor
        System.out.println(!condicao1); // not
        System.out.println(!condicao2); // not

        System.out.println("\nTrue table AND");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nTrue table OR");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTrue table Exclusive OR (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTrue table NOT");
        System.out.println(!true);
        System.out.println(!false);

    }
}
