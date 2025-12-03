package org.example.controle;

public class SwitchSemBreak {
    static void main() {

        // if (bool)
        // while (bool)
        // for (bool)
        // switch não recebe um valor verdadeiro ou falso, e sim recebe o valor direto

        String faixa = "amarela";
        switch (faixa.toLowerCase()){
        case "preta":
            System.out.println("Sei o Bassai-Dai...");
        case "marrom":
            System.out.println("Sei o Tekkin Shodan");
        case "roxa":
            System.out.println("Sei o Heian Godan");
        case "verde":
            System.out.println("Sei o Heian Yodan");
        case "laranja":
            System.out.println("Sei o Heian Sandan");
        case "vermelha":
            System.out.println("Sei o Heian Nidan");
        case "amarela":
            System.out.println("Sei o Heian Shodan");
       //     default:
        //        System.out.println("Não sei de nada");
        }
    }
}
