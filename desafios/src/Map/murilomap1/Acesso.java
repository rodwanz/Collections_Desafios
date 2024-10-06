package Map.murilomap1;

import java.util.HashMap;
import java.util.Map;

public class Acesso {
    public static void main(String[] args) {
        Map<String, Integer> armazenado = new HashMap<>();

        armazenado.put("Miguel", 18);
        armazenado.put("Susanne", 49);
        armazenado.put("Felipe", 34);
        armazenado.put("Lucas", 29);
        armazenado.put("Rachel", 42);
        System.out.println("Pessoas da lista " + armazenado);
        System.out.println("A segunda pessoa mapeada consta no Acesso: " + armazenado.containsKey("Felipe") + " Sim, consta!");
    }
}
