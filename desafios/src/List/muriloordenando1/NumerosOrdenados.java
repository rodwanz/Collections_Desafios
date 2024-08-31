package List.muriloordenando1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumerosOrdenados {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(67);
        numeros.add(12);
        numeros.add(5);
        numeros.add(44);
        numeros.add(2);
        numeros.add(31);

        Collections.sort(numeros);
        Collections.reverse(numeros);

        for (Integer numero : numeros){
            System.out.println(numero);
        }
    }
}
