package List.murilosoma1;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(67);
        numeros.add(12);
        numeros.add(5);
        numeros.add(44);
        numeros.add(2);
        numeros.add(31);


//        for (int i = 0; i < numeros.size(); i++){
//            int soma = numeros.get(i);
//            numeros.set(i, soma + 1);
//        }
//        System.out.println("Cada número aumentado mais um: " + numeros);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();


        for (int i = 0; i < numeros.size(); i++) {
            int soma = 0;
            soma = numeros.get(i);
            numeros.set(i, soma + 1);
        }
        System.out.println("Cada número aumentado mais um: " + numeros);
    }
}

