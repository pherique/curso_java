package org.example.fundamentos;

public class Temperatura {
    public static void main(String[] args){
       // (°F - 32) x 5/9 = °C
            final double FATOR = 5/9.0;
            final double AJUSTE = 32;

            double fahrenheit = 64;
            double celsius = (fahrenheit - AJUSTE) * FATOR;
            System.out.println("O resultador é " + celsius + "°C.");

            fahrenheit = 86;
            celsius = (fahrenheit - AJUSTE) * FATOR;
            System.out.println("O resultador é " + celsius + "°C.");

    }
}
