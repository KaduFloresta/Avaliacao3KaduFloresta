package app;

import java.util.Objects;

// import java.util.Objects;

public class Contas {

    private int idConta;
    private int mes;
    private int ano;
    private Double valor;


    public Contas() {
    }

    public Contas(int idConta, int mes, int ano, Double valor) {
        this.idConta = idConta;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
    }

    public int getIdConta() {
        return this.idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Contas idConta(int idConta) {
        this.idConta = idConta;
        return this;
    }

    public Contas mes(int mes) {
        this.mes = mes;
        return this;
    }

    public Contas ano(int ano) {
        this.ano = ano;
        return this;
    }

    public Contas valor(Double valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contas)) {
            return false;
        }
        Contas contas = (Contas) o;
        return idConta == contas.idConta && mes == contas.mes && ano == contas.ano && Objects.equals(valor, contas.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConta, mes, ano, valor);
    }

    @Override
    public String toString() {
        return "{" +
            " idConta='" + getIdConta() + "'" +
            ", mes='" + getMes() + "'" +
            ", ano='" + getAno() + "'" +
            ", valor='" + getValor() + "'" +
            "}";
    }

}