package org.example.fundamentos;

import java.util.Scanner;

public class Wrappers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // byte
        Byte b = 100;
        Short s = 1000;
        //Integer i = Integer.parseInt(sc.next());
        Integer i = 10000; // int
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123F;
        System.out.println(f);

        Double d = 1234.56789;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("True");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; //char
        System.out.println(c + "...");

        sc.close();
    }
}
