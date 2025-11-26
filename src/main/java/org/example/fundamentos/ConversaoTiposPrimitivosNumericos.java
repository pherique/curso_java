package org.example.fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    static void main() {
        double a = 1.123456788888; //implícita
        System.out.println(a);

        float b = (float) 1.123456788888; // explícita (CAST)
        System.out.println(b);

        int c = 340;
        byte d =(byte) c; // explícita (CAST)
        System.out.println(d);

        double e = 1;
        int f = (int) e; // explícita (CAST)
        System.out.println(f);
    }
}
