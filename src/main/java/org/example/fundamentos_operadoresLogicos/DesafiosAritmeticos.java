package org.example.fundamentos_operadoresLogicos;

public class DesafiosAritmeticos {
    static void main() {

       /* int a = 3 * 4 - 10;
        int b = (int) Math.pow(a, 3);
        double c = Math.pow(a, 3);

        System.out.println(b);
        System.out.println(c);

        int parte1 = (6 * (3+2)) / (3 * 2);
        parte1 = (int) Math.pow(parte1, 2);
        System.out.println(parte1);

        int parte2 = ((1-5)*(2-7)) /2;
        parte2 = (int) Math.pow(parte2, 2);
        System.out.println(parte2);

        int resultado = parte1 - parte2;
        System.out.println(resultado);

        int parte3 = (int) Math.pow(10, 3);

        int parte4 = (int) Math.pow(parte3, 3);
        System.out.println(parte4);

        */

        double numA = Math.pow(6*(3+2),2);
        double denA = 3 * 2;


        double numB = (1-5) * (2-7);
        double denB = 2;

        double superiorA = numA / denA;
        double superioB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superioB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println("O Resultado eh " + resultado);

    }
}
