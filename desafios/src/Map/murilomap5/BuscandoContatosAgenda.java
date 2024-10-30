package Map.murilomap5;

import Map.murilomap3_2.Alunos;
import Map.murilomap3_3.EscolaAlunos;

import java.util.List;

public class BuscandoContatosAgenda {
    public static void main(String[] args) {
        PrimeiraLetraNome letra1 = new PrimeiraLetraNome("A");
        PrimeiraLetraNome letra2 = new PrimeiraLetraNome("B");
        PrimeiraLetraNome letra3 = new PrimeiraLetraNome("C");

        NomeAlunos nome1 = new NomeAlunos("André");
        NomeAlunos nome2 = new NomeAlunos("Anselmo");
        NomeAlunos nome3 = new NomeAlunos("Atanazio");
        NomeAlunos nome4 = new NomeAlunos("Bento");
        NomeAlunos nome5 = new NomeAlunos("Bakita");
        NomeAlunos nome6 = new NomeAlunos("Brigida");
        NomeAlunos nome7 = new NomeAlunos("Catarina");
        NomeAlunos nome8 = new NomeAlunos("Claraval");
        NomeAlunos nome9 = new NomeAlunos("Cantuaria");

        List<NomeAlunos> listaNomes1 = List.of(nome1, nome2, nome3);
        List<NomeAlunos> listaNomes2 = List.of(nome4, nome5, nome6);
        List<NomeAlunos> listaNomes3 = List.of(nome7, nome8, nome9);

        AgendaContatos contatos = new AgendaContatos();
        contatos.adicionaAgenda(letra1, listaNomes1);
        contatos.adicionaAgenda(letra2, listaNomes2);
        contatos.adicionaAgenda(letra3, listaNomes3);

        contatos.mostrarTodosContatos();
        contatos.buscandoNomeAgenda();
        contatos.removerContato(listaNomes2);
        //contatos.buscandoNomeAgenda();
        //contatos.mostrarTodosContatos();
    }
}
