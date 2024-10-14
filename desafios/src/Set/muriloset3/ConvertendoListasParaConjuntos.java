package Set.muriloset3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertendoListasParaConjuntos {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Leão");
        listaNomes.add("Cordeiro");
        listaNomes.add("Águia");
        System.out.println("Lista de nomes: ");

        for (String nome : listaNomes){
            System.out.println(nome);
        }

        Set<String> conjuntoNomes = new HashSet<>(listaNomes);
        System.out.println("Passando para um conjunto: ");

        for (String conjunto : conjuntoNomes){
            System.out.println(conjunto);
        }
    }
}
