package Map.murilomap3_2;

public class Escola {
    private String nomeEscola;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }


    @Override
    public String toString() {
        return "EscolaAlunos{" +
                "nomeEscola = '" + nomeEscola + '\'' +
                '}';
    }
}
