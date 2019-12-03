package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dividas extends Contas {

    private double percDesconto;
    private List<Dividas> divida = new ArrayList<>();

    public Dividas() {
    }

    public Dividas(int idConta, int mes, int ano, double valor, double percDesconto) {
        super(idConta, mes, ano, valor);
        this.percDesconto = percDesconto;
    }

    public Dividas(double percDesconto) {
        this.percDesconto = percDesconto;
    }

    public double getPercDesconto() {
        return this.percDesconto;
    }

    public void setPercDesconto(double percDesconto) {
        this.percDesconto = percDesconto;
    }

    public Dividas percDesconto(double percDesconto) {
        this.percDesconto = percDesconto;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Dividas)) {
            return false;
        }
        Dividas dividas = (Dividas) o;
        return percDesconto == dividas.percDesconto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(percDesconto);
    }

    @Override
    public String toString() {
        return "{" +
            " percDesconto='" + getPercDesconto() + "'" +
            "}";
    }

    public void imprimirDividas(){
        System.out.println("Cliente: " + this.getNomePessoa());
        System.out.println("Quantidade de Dividas: " + this.quantidadeDeDividas());
        valorDividas();
    }

    private String getNomePessoa() {
        return null;
    }

    private int quantidadeDeDividas() {
        return this.divida.size();
    }

    private void valorDividas(){
        for(Dividas divida: this.divida){
            System.out.print("Data da Divida: " + divida.getMes() + " " + divida.getAno());
            System.out.print("Valor da Divida: " + divida.total() + "\n");
            System.out.print("\n");
        }
    }

    private String total() {
        return null;
    }
}