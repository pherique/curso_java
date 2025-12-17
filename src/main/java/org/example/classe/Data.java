package org.example.classe;

public class Data {
    // dia
    // mes
    // ano

    int dia;
    int mes;
    int ano;

    public Data() {
    }

    public Data(int diaInicial, int mesInicial, int anoInicial){
            dia = diaInicial;
            mes = mesInicial;
            ano = anoInicial;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
