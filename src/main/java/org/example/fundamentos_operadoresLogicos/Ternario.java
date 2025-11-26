package org.example.fundamentos_operadoresLogicos;

public class Ternario {
    static void main() {

       /* double media = 7.6;
        String recuperacao = media >= 5.0 ? "em recuperação" : "reprovado";
        String resultado = media >= 7.0 ? "Aprovado" : recuperacao;
        System.out.println("O aluno está: " + resultado);
     */
        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >=7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim.": "Não.";

        System.out.println("Tem desconto?" + temDesconto);
    }
}
