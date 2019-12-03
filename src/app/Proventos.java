package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Proventos extends Contas {

    private double imposto;
    private List<Proventos> provento = new ArrayList<>();

    public Proventos() {
    }

    public Proventos(int idConta, int mes, int ano, double valor, double imposto) {
        super(idConta, mes, ano, valor);
        this.imposto = imposto;
    }

    public Proventos(int mes, int ano, double valor, double imposto) {
        this(0, mes, ano, valor, imposto);
    }

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
        return this.provento.size();
    }

    private void valorProventos(){
        for(Proventos provento: this.provento){
            System.out.print("Data da Provento: " + provento.getMes() + " " + provento.getAno());
            System.out.print("Valor da Provento: " + provento.total() + "\n");
            System.out.print("\n");
        }
    }

    private String total() {
        return null;
    }

}