package List.muriloordenando2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        numerosAscendente.sort(Collections.reverseOrder());
        return numerosAscendente;
    }
    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
}
