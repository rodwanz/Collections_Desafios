package Set.muriloset4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmOrdem {
    Set<Numeros> comjuntoNum;

    public EmOrdem() {
        this.comjuntoNum = new TreeSet<>();
    }
    public void adicionandoNumero(int numero) {
        comjuntoNum.add(new Numeros(numero));
    }
    public Set<Numeros> contem(int numero) {
        Set<Numeros> contemConjunto = new TreeSet<>(comjuntoNum);
        if (!comjuntoNum.isEmpty()) {
            contemConjunto.addAll(comjuntoNum);
            System.out.println("Números em ordem crescente, ");;
        }
        return contemConjunto;
    }
    public int constaNumero(){
        int estaNaLista = 7;
        for (Numeros num : comjuntoNum){
            if(comjuntoNum.contains(num)){
                //System.out.println("o número esperado " + estaNaLista);
            }
        }
        return estaNaLista;
    }
    public Set<Numeros> mostrandoNumeros() {
        Set<Numeros> exibindoNumeroConjunto = new HashSet<>(comjuntoNum);
        if (!comjuntoNum.isEmpty()) {
            exibindoNumeroConjunto.addAll(comjuntoNum);
            System.out.println("Números do conjunto");
        }
        return exibindoNumeroConjunto;
    }
}
