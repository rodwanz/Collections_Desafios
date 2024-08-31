package List.murilomultinum1;

import java.util.ArrayList;
import java.util.List;

public class MultiplicandoInteiros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(67);
        numeros.add(12);
        numeros.add(5);
        numeros.add(44);
        numeros.add(2);
        numeros.add(31);



        for (int i = 0; i < numeros.size(); i++){
            int dobra = numeros.get(i);
            numeros.set(i, dobra * 2);
        }
//        int dobra = 0;
//        for (Integer numero : numeros) {
//            int num = numero * 2;
//            dobra *= num;
//        }
        System.out.println("Lista transformada: " + numeros);
    }

}
