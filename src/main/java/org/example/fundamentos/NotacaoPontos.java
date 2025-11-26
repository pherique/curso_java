package org.example.fundamentos;

public class NotacaoPontos {
    static void main() {
        double a = 2.3;
        String s = "Bom dia X";
        s = s.toUpperCase();
        s = s.replace("X", "Senhora");
        s.concat("!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Gui");
        System.out.println(y);
    }
}
