package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import app.dao.UsuarioDAO;

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

    public Pessoas(String nomePessoa, String emailPessoa){
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;

        UsuarioDAO dao = new UsuarioDAO();
        dao.adicionaPessoa(this);
        dao.endConection();        
    }

    public Pessoas(int idPessoa, String nomePessoa, String emailPessoa, List<Dividas> dividas, List<Proventos> proventos) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.dividas = dividas;
        this.proventos = proventos;
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

    public List<Dividas> getDividas() {
        return this.dividas;
    }

    public void setDividas(List<Dividas> dividas) {
        this.dividas = dividas;
    }

    public List<Proventos> getProventos() {
        return this.proventos;
    }

    public void setProventos(List<Proventos> proventos) {
        this.proventos = proventos;
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

    public Pessoas dividas(List<Dividas> dividas) {
        this.dividas = dividas;
        return this;
    }

    public Pessoas proventos(List<Proventos> proventos) {
        this.proventos = proventos;
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
        return idPessoa == pessoas.idPessoa && Objects.equals(nomePessoa, pessoas.nomePessoa) && Objects.equals(emailPessoa, pessoas.emailPessoa) && Objects.equals(dividas, pessoas.dividas) && Objects.equals(proventos, pessoas.proventos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPessoa, nomePessoa, emailPessoa, dividas, proventos);
    }

    @Override
    public String toString() {
        return "{" +
            " idPessoa='" + getIdPessoa() + "'" +
            ", nomePessoa='" + getNomePessoa() + "'" +
            ", emailPessoa='" + getEmailPessoa() + "'" +
            ", dividas='" + getDividas() + "'" +
            ", proventos='" + getProventos() + "'" +
            "}";
    }

}