package app;

import java.util.Objects;

import app.dao.UsuarioDAO;

public class Pessoas {

    private int idPessoa;
    private String nomePessoa;
    private String emailPessoa;

    /* Métodos / Construtores
        + Pessoa(): Pessoas 
        + Pessoa(id: int): Pessoas 
        + Pessoa(id: int, nome: String, email: String): Pessoas 
        + Pessoa(nome: String, email: String): Pessoas 
        + Pessoas(): Set<Pessoas>
    */    
    public Pessoas() {
    }

    public Pessoas(int idPessoa) {
        this.idPessoa = idPessoa;
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

    public static void getPessoas(){
        UsuarioDAO dao = new UsuarioDAO();
        dao.getPessoas();
        dao.endConection();
    }

    public static Pessoas getPessoa(int idPessoa){
        UsuarioDAO dao = new UsuarioDAO();
        Pessoas pessoa = dao.getPessoa(idPessoa);
        dao.endConection();
        return pessoa;
    }
    /* Métodos Get - Set 
        + getId(): int 
        + setId(id: int): void 
        + getNome(): String 
        + setNome(nome: String): void 
        + getEmail(): String 
        + setEmail(email: String):  void 
    */
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

    /* Métodos Equals - Hashcode - ToString 
        + equals(o: Object): boolean 
        + hashCode(): int 
        + toString(): String
    */
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
        return "Id: " + getIdPessoa() + "\n" +
            "Nome: " + getNomePessoa() + "\n" +
            "Email:" + getEmailPessoa() + "\n" +
            "------------------------------------";
    }
    

}