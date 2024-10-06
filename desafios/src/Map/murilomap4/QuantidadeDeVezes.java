package Map.murilomap4;

import java.util.*;

public class QuantidadeDeVezes {
    public static void main(String[] args) {
        Map<String, Integer> quantasVezes = new HashMap<>();
        List<String> seRepete = Arrays.asList("maçã", "banana", "maçã", "laranja", "banana", "maçã");
        for (String variasVezes : seRepete){
            quantasVezes.put(variasVezes, quantasVezes.getOrDefault(variasVezes, 0) + 1);
        }
        System.out.println(quantasVezes);
    }
}
