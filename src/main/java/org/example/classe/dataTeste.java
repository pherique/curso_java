package org.example.classe;

public class dataTeste {
    static void main() {


        Data dt = new Data(28, 8, 2006);
      //  dt.dia = 28;
      //  dt.mes = 8;
      //  dt.ano = 2006;

        var dt2 = new Data();
        dt2.dia = 1;
        dt2.mes = 1;
        dt2.ano = 1970;

        System.out.println(dt.obterDataFormatada());
        System.out.println(dt2.obterDataFormatada());

        dt.obterDataFormatada();
    }
}
