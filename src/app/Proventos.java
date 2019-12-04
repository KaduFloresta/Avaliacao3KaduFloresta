package app;

import java.util.Objects;

public class Proventos extends Contas {

    private double imposto;

    /* Métodos / Construtores
    + Proventos(id: int, mes: int, ano: int, valor: double, pessoa: Pessoas, imposto: double): Proventos 
    + Proventos(mes: int, ano: int, valor: double, pessoa: Pessoas, imposto: double): Proventos 
    + Proventos(idPessoa: int): Set<Proventos>
    */   
    public Proventos(int idConta, int mes, int ano, double valor, Pessoas pessoa, double imposto) {
        super(idConta, mes, ano, valor, pessoa);
        this.imposto = imposto;
    }

    public Proventos(int mes, int ano, double valor, Pessoas pessoa, double imposto) {
        this(0, mes, ano, valor, pessoa, imposto);
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
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Proventos)) {
            return false;
        }
        Proventos proventos = (Proventos) o;
        return imposto == proventos.imposto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(imposto);
    }

    @Override
    public String toString() {
        return "{" +
            " imposto='" + getImposto() + "'" +
            "}";
    }
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