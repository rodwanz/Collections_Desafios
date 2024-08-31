package List.murilolist1;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCidades {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>();
        cidades.add("Bananais");
        cidades.add("Criciuma");
        cidades.add("Teresina");
        cidades.add("Vassouras");

//        for (String c : cidades){
//            System.out.println(c);
//        }
//        cidades.add("São José do Rio Preto");
//        System.out.println(" #############  ");
//        for (int i = 0; i < cidades.size(); i++){
////            System.out.println(cidades);
//            System.out.println(cidades.get(i));
//        }
        System.out.println("Mostrando lista de cidades " + cidades);
        System.out.println("removendo a terciera cidade " + cidades.remove(3));
        System.out.println("Mostrando nova lista das cidades " + cidades);
        System.out.println("Adicionando outra cidade a lista " + cidades.add("Pernanbuco"));
        System.out.println("Atualizando lista das cidades " + cidades);
    }
}
