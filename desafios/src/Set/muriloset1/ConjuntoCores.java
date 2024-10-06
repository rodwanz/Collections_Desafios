package Set.muriloset1;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoCores {
    public static void main(String[] args) {
        System.out.println("Criando um conjunto de cores: ");
        Set<String> cores = new HashSet<>();
        cores.add("Vermelho");
        cores.add("Roxo");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Marron");
        cores.add("Lilas");
        cores.add("Rosa");
        cores.add("Grena");
        System.out.println(cores);
        System.out.println("A cor repetida não entrou no conjunto!");
    }
}
