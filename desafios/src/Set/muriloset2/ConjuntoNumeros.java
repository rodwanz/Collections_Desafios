package Set.muriloset2;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoNumeros {
    public static void main(String[] args) {
        Set<Integer> primeiroConjunto = new TreeSet<>();

        primeiroConjunto.add(1);
        primeiroConjunto.add(3);
        primeiroConjunto.add(2);
        primeiroConjunto.add(4);
        primeiroConjunto.add(8);
        primeiroConjunto.add(9);
        primeiroConjunto.add(0);

        Set<Integer> segundoConjuto = new TreeSet<>();

        segundoConjuto.add(1);
        segundoConjuto.add(3);
        segundoConjuto.add(7);
        segundoConjuto.add(5);
        segundoConjuto.add(4);
        segundoConjuto.add(0);
        segundoConjuto.add(7);
        segundoConjuto.add(5);

        Set<Integer> uniao = new TreeSet<>(primeiroConjunto);
        uniao.addAll(segundoConjuto);
        System.out.println("A união dos conjuntos");
        System.out.println(uniao);

        Set<Integer> intersecao = new TreeSet<>(primeiroConjunto);
        intersecao.retainAll(segundoConjuto);
        System.out.println("A interseção dos conjuntos");
        System.out.println(intersecao);

        Set<Integer> diferenca = new TreeSet<>(primeiroConjunto);
        diferenca.removeAll(segundoConjuto);
        System.out.println("A diferença dos conjuntos");
        System.out.println(diferenca);
    }
}
