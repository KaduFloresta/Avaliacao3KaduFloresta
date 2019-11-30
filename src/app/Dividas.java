package app;

import java.util.Objects;

public class Dividas extends Pessoas {

    private double percDesconto;

    public Dividas() {
    }

    public Dividas(int idPessoa, String nomePessoa, String emailPessoa, double percDesconto) {
        super(idPessoa, nomePessoa, emailPessoa);
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

}