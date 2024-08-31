package List.muriloordenando2;

public class NumerosOrdenados {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(75);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(25);
        ordenacaoNumeros.adicionarNumero(125);
        ordenacaoNumeros.adicionarNumero(105);
        ordenacaoNumeros.adicionarNumero(45);
        ordenacaoNumeros.adicionarNumero(-5);
        ordenacaoNumeros.exibirNumeros();
        System.out.println("Exibindo e ordem descrescente " + ordenacaoNumeros.ordenarDescendente());
        System.out.println("Exibindo e ordem crescente " + ordenacaoNumeros.ordenarAscendente());

    }
}
