package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// import java.util.Objects;

public class Pessoas {

    private int idPessoa;
    private String nomePessoa;
    private String emailPessoa;
    private List<Dividas> dividas = new ArrayList<>();
    private List<Proventos> proventos = new ArrayList<>();

    public Pessoas() {
    }

    public Pessoas(int idPessoa, String nomePessoa, String emailPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
    }

    public int getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return this.nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmailPessoa() {
        return this.emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public Pessoas idPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
        return this;
    }

    public Pessoas nomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
        return this;
    }

    public Pessoas emailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoas)) {
            return false;
        }
        Pessoas pessoas = (Pessoas) o;
        return idPessoa == pessoas.idPessoa && Objects.equals(nomePessoa, pessoas.nomePessoa) && Objects.equals(emailPessoa, pessoas.emailPessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPessoa, nomePessoa, emailPessoa);
    }

    @Override
    public String toString() {
        return "{" +
            " idPessoa='" + getIdPessoa() + "'" +
            ", nomePessoa='" + getNomePessoa() + "'" +
            ", emailPessoa='" + getEmailPessoa() + "'" +
            "}";
    }


}