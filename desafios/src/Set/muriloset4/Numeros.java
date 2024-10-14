package Set.muriloset4;

public class Numeros implements Comparable<Numeros> {
    private int numeros;

    public Numeros(int numeros) {
        this.numeros = numeros;
    }
    @Override
    public int compareTo(Numeros num1) {
        return Integer.compare(getNumeros(), num1.getNumeros());
    }

    public int getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return String.valueOf(numeros);
    }
}
