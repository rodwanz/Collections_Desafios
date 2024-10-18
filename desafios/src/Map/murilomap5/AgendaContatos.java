package Map.murilomap5;

import Map.murilomap3_2.Alunos;
import Map.murilomap3_2.Escola;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaContatos {
    Map<PrimeiraLetraNome, List<NomeAlunos>> indiceContatos;

    public AgendaContatos() {
        this.indiceContatos = new HashMap<>();
    }

    public void adicionaAgenda(PrimeiraLetraNome letraInicial, List<NomeAlunos> nomeAlunos){
        indiceContatos.put(letraInicial, nomeAlunos);
    }
    public void buscandoNomeAgenda(){
        Map<PrimeiraLetraNome, List<NomeAlunos>> nomesMapeados = new HashMap<>(indiceContatos);
        for (Map.Entry<PrimeiraLetraNome, List<NomeAlunos>> buscaEntrada : indiceContatos.entrySet()) {
            PrimeiraLetraNome chaveEncontrada = buscaEntrada.getKey();
            List<NomeAlunos> valorMapeados = buscaEntrada.getValue();
            System.out.println("Agenda por ordem alfabetica: " + chaveEncontrada.getPrimeiraLetra() + ", nome de alunos: " + valorMapeados);
        }
    }
}
