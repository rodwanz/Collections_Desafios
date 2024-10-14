package Set.muriloset4;

public class ConjuntoEmOrdem {
    public static void main(String[] args) {
        EmOrdem ordem = new EmOrdem();

        ordem.adicionandoNumero(1);
        ordem.adicionandoNumero(7);
        ordem.adicionandoNumero(5);
        ordem.adicionandoNumero(9);

        System.out.println(ordem.mostrandoNumeros());
        System.out.println(ordem.contem(7) + " ,contém no conjunto");
        System.out.println( ordem.constaNumero());


    }
}
