package List.muriloelementonalista;

import java.util.ArrayList;
import java.util.List;

public class ElementoNaLista {
    public static void main(String[] args) {
        List<String> naLista = new ArrayList<>();
        naLista.add("Maçã");
        naLista.add("Pera");
        naLista.add("Banana");
        naLista.add("Uva");


//        boolean presente = naLista.contains("Maçã");
//        System.out.println("A maçã consta na lista? Sim! " + presente);
//        int contem = naLista.indexOf("Banana");
//        System.out.println("Tabém tem Banana! " + contem);

        if (naLista.contains("Maçã")){
            System.out.println("Tem maçã na lista de frutas!");
        }else {
            System.out.println("Não tem maçã na lista de frutas!");
        }

        int presente = naLista.indexOf("Banana");
        if (presente != -1){
            System.out.println("Também tem banana na lista!");
        }else {
            System.out.println("Ih! Não tem banana!");
        }
    }
}
