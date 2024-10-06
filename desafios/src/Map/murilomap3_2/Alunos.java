package Map.murilomap3_2;

import java.util.Objects;

public class Alunos {
    private String nomeAlunos;

    public Alunos(String nomeAlunos) {
        this.nomeAlunos = nomeAlunos;
    }

    public String getNomeAlunos() {
        return nomeAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return Objects.equals(getNomeAlunos(), alunos.getNomeAlunos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeAlunos());
    }

    @Override
    public String toString() {
        return  nomeAlunos ;
    }
}
