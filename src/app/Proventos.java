package app;

//Biblioteca
import java.util.Set;

//Biblioteca Interna
import app.dao.UsuarioDAO;

// Classe Derivada da Classe-Pai
public class Proventos extends Contas {
    // Variável Privada (Uso Exclusivo da Classe)
    private double imposto;

    /* Construtores
        + Proventos(id: int, mes: int, ano: int, valor: double, pessoa: Pessoas, imposto: double): Proventos 
        + Proventos(mes: int, ano: int, valor: double, pessoa: Pessoas, imposto: double): Proventos 
        + Proventos(idPessoa: int): Set<Proventos>
    */   
    public Proventos(int idConta, int mes, int ano, double valor, Pessoas pessoa, double imposto) {
        // Variáveis de Herança da Classe-Pai
        super(idConta, mes, ano, valor, pessoa);
        this.imposto = imposto;
    }
    public Proventos(int mes, int ano, double valor, Pessoas pessoa, double imposto) {
        this(0, mes, ano, valor, pessoa, imposto);

        // Create Provento no BD
        UsuarioDAO dao = new UsuarioDAO();
        dao.adicionarProventos(this);
        dao.endConection();
    }

    public static Set<Proventos> Provento(int idPessoa) {
        // Select no banco e retornar o Set<Dividas>
        return null;
    }

    public static void getProventos(int idPessoa){
        UsuarioDAO dao = new UsuarioDAO();
        dao.getProventos(idPessoa);
        dao.endConection();
    }

    /* Métodos Get - Set
        + getImposto(): double 
        + setImposto(imposto: double): void
    */
    public Proventos(double imposto) {
        this.imposto = imposto;
    }

    public double getImposto() {
        return this.imposto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public Proventos imposto(double imposto) {
        this.imposto = imposto;
        return this;
    }

    /* Métodos Equals - Hashcode - ToString
        + toString(): String 
        - calculaImposto(): double
    */
    @Override
    public String toString() {
        return 
            "Imposto de " + getImposto() + " %\n" +
            "Valor Com Imposto R$ : " +
            "-------------------------------------------";
    }

    // Impressão dos Proventos da Pessoa
    public void imprimirProventos(){
        System.out.println("Cliente: " + this.getNomePessoa());
        System.out.println("Quantidade de Proventos: " + this.quantidadeDeProventos());
        valorProventos();
    }

    private String getNomePessoa() {
        return null;
    }

    private int quantidadeDeProventos() {
        return 0;
    }

    private void valorProventos(){        
    }

    private String total() {
        return null;
    }

}