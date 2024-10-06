package Map.murilomap2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iteracao {
    public static void main(String[] args) {
        Map<String, Integer> iterando = new HashMap<>();
        iterando.put("Paulo", 43);
        iterando.put("Pedro", 45);
        iterando.put("Tiago", 40);
        iterando.put("João", 44);
        iterando.put("Felipe", 41);
        iterando.put("Felipe", 41);

        for (Map.Entry<String, Integer> entrada: iterando.entrySet()){
            System.out.println("Nome " + entrada.getKey() + " idade atualizada " + entrada.getValue());
        }
//        Set<Map.Entry<String, Integer>> entradaIterada = iterando.entrySet();
//        Iterator<Map.Entry<String, Integer>> dadosIterados = entradaIterada.iterator();
//        while (dadosIterados.hasNext()){
//            Map.Entry<String, Integer> entrada = dadosIterados.next();
//            System.out.println("Nome " + entrada.getKey() + " idade atualizada " + entrada.getValue());
//        }
        String dadoEmExcesso = "Felipe";
        String ajustandoDados = String.valueOf(iterando.remove(dadoEmExcesso));
        System.out.println("Retirando do mapeamento, segundo nome " + dadoEmExcesso + " para que fique correto");
    }
}
