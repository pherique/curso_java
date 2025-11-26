package org.example.fundamentos;

public class PrimitivosVsObjetos {
    static void main() {
        String s = new String("Texto");
        s.toUpperCase();


        // Wrappers: são versão objetos dos estilos primitivos!
        int a = 123;
        System.out.println(a);
    }
}
