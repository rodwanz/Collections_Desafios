package List.murilolist2;

public class Cidades {
    private String nome;
    private String nomeCapital;

    public Cidades(String nome, String nomeCapital) {
        this.nome = nome;
        this.nomeCapital = nomeCapital;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCapital() {
        return nomeCapital;
    }

    @Override
    public String toString() {
        return "Cidades{" +
                "nome = '" + nome + '\'' +
                ", nomeCapital = '" + nomeCapital + '\'' +
                '}';
    }
}
