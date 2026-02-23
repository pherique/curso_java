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
            this.dia = diaInicial;
            this.mes = mesInicial;
            this.ano = anoInicial;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
