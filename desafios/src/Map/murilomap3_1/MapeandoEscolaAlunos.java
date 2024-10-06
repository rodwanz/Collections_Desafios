package Map.murilomap3_1;

import java.util.*;

public class MapeandoEscolaAlunos {
    public static void main(String[] args) {
        Map<String, List<String>> escolaAlunos = new HashMap<>();
//        escolaAlunos.put("Escola Técnica Visconde de Mauá ", List.of("Ulisses", "Ilan", "Bernardo"));
//        escolaAlunos.put("Escola Técnica Resende Rammmel ", List.of("Bruno", "Tiago", "Roney"));
//        escolaAlunos.put("Escola Municipal Joaquim da Costa Ribeiro " , List.of("Luiz", "Sergio", "Robson"));

         escolaAlunos.put("Escola Técnica Visconde de Mauá ", Arrays.asList("Ulisses", "Ilan", "Bernardo"));
        escolaAlunos.put("Escola Técnica Resende Rammmel ", Arrays.asList("Bruno", "Tiago", "Roney"));
        escolaAlunos.put("Escola Municipal Joaquim da Costa Ribeiro " , Arrays.asList("Luiz", "Sergio", "Robson"));

        System.out.println(escolaAlunos);
    }
}
