package Map.murilomap5;

public class NomeAlunos {
    private String nomes;

    public NomeAlunos(String nomes) {
        this.nomes = nomes;
    }

    public String getNomes() {
        return nomes;
    }

    @Override
    public String toString() {
        return "NomeAlunos{" +
                "nomes='" + nomes + '\'' +
                '}';
    }
}
