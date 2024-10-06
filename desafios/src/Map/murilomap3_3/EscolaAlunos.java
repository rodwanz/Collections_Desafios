package Map.murilomap3_3;

import Map.murilomap3_2.Alunos;
import Map.murilomap3_2.Escola;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EscolaAlunos {
    private Map<Escola, List<Alunos>> escolaListMap;

    public EscolaAlunos() {
        this.escolaListMap = new HashMap<>();
    }
    public void adicionaEscolaAluno(Escola escola, List<Alunos> alunos){
        escolaListMap.put(escola, alunos);
    }
    public void escolaMapaAlunos(){
        Map<Escola, List<Alunos>> alunoPorEscola = new HashMap<>();
        for (Map.Entry<Escola, List<Alunos>> entradaMapeammento : escolaListMap.entrySet()){
            System.out.println(entradaMapeammento.getKey().getNomeEscola());
            for (Alunos alunos : entradaMapeammento.getValue()){
                System.out.println(alunos.getNomeAlunos());
            }
        }
    }
    public void exibindoMapeamento() {
        Map<Escola, List<Alunos>> alunoMapeadoPorEscola = new HashMap<>(escolaListMap);
        for (Map.Entry<Escola, List<Alunos>> entadaBusca : escolaListMap.entrySet()) {
            Escola escolaEncontrada = entadaBusca.getKey();
            List<Alunos> alunosMapeados = entadaBusca.getValue();
            System.out.println("Escola: " + escolaEncontrada.getNomeEscola() + ", Alunos: " + alunosMapeados);
        }
    }
}
