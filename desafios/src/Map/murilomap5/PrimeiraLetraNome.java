package Map.murilomap5;

public class PrimeiraLetraNome {
    private String primeiraLetra;

    public PrimeiraLetraNome(String primeiraLetra) {
        this.primeiraLetra = primeiraLetra;
    }

    public String getPrimeiraLetra() {
        return primeiraLetra;
    }

    @Override
    public String toString() {
        return "PrimeiraLetraNome{" +
                "primeiraLetra='" + primeiraLetra + '\'' +
                '}';
    }
}
