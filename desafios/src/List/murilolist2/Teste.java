package List.murilolist2;

public class Teste {
    public static void main(String[] args) {
        ListandoCidades listaDeCidades = new ListandoCidades();

        listaDeCidades.adicionandoCidadesa("Rio de Janeiro", "Rio de JAneiro");
        listaDeCidades.adicionandoCidadesa("São Paulo", "São Paulo");
        listaDeCidades.adicionandoCidadesa("Paraná", "Curitiba");
        listaDeCidades.adicionandoCidadesa("Terra do nucna", "Nunca Mais");
        listaDeCidades.exibirCidades();
        listaDeCidades.removendoCidade("Terra do nucna");
        listaDeCidades.exibirCidades();
    }
}
