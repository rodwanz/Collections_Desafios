package Map.murilomap3_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapeandoEscolaAlunos {
    public static void main(String[] args) {
        Escola escola1 = new Escola("Escola Técnica Visconde de Mauá ");
        Escola escola2 = new Escola("Escola Técnica Resende Rammmel ");
        Escola escola3 = new Escola("Escola Municipal Joaquim da Costa Ribeiro ");

        Alunos al1 = new Alunos("Ulisses");
        Alunos al2 = new Alunos("Ilan");
        Alunos al3 = new Alunos("Bernardo");
        Alunos al4 = new Alunos("Bruno");
        Alunos al5 = new Alunos("Rafael");
        Alunos al6 = new Alunos("Roney");
        Alunos al7 = new Alunos("Luiz");
        Alunos al8 = new Alunos("Sergio");
        Alunos al9 = new Alunos("Robson");

        List<Alunos> listaAlunos1 = List.of(al1, al2, al3);
        List<Alunos> listaAlunos2 = List.of(al4, al5, al6);
        List<Alunos> listaAlunos3 = List.of(al7, al8, al9);

        Map<Escola, List<Alunos>> mapeandoEscolaAlunos = new HashMap<>();
        mapeandoEscolaAlunos.put(escola1, listaAlunos1);
        mapeandoEscolaAlunos.put(escola2, listaAlunos2);
        mapeandoEscolaAlunos.put(escola3, listaAlunos3);

        for (Map.Entry<Escola, List<Alunos>> entradaMapeammento : mapeandoEscolaAlunos.entrySet()){
            System.out.println(entradaMapeammento.getKey().getNomeEscola());
            for (Alunos alunos : entradaMapeammento.getValue()){
                System.out.println(alunos.getNomeAlunos());
            }
        }
    }
}
