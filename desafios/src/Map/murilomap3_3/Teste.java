package Map.murilomap3_3;

import Map.murilomap3_2.Alunos;
import Map.murilomap3_2.Escola;

import java.util.List;

public class Teste {
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

        EscolaAlunos escolaAlunos = new EscolaAlunos();
        escolaAlunos.adicionaEscolaAluno(escola1, listaAlunos1);
        escolaAlunos.adicionaEscolaAluno(escola2, listaAlunos2);
        escolaAlunos.adicionaEscolaAluno(escola3, listaAlunos3);

        escolaAlunos.escolaMapaAlunos();
        escolaAlunos.exibindoMapeamento();
    }
}
