package List.murilolist2;

import java.util.ArrayList;
import java.util.List;

public class ListandoCidades {
    private List<Cidades> listaCidades;

    public ListandoCidades() {
        this.listaCidades = new ArrayList<>();
    }
    public void adicionandoCidadesa(String nome,String nomeCapital){
        listaCidades.add(new Cidades(nome, nomeCapital));
    }
    public void removendoCidade(String nome){
        List<Cidades> cidadeParaRemover = new ArrayList<>();
        if (!listaCidades.isEmpty()){
            for (Cidades cidade : listaCidades) {
                if (cidade.getNome().equalsIgnoreCase(nome)){
                    cidadeParaRemover.add(cidade);
                }
            }
            listaCidades.removeAll(cidadeParaRemover);
        }
    }
    public void exibirCidades(){
        System.out.println(listaCidades);
    }
}

