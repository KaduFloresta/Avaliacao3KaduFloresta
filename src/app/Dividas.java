package app;

import java.util.Set;

import app.dao.UsuarioDAO;

public class Dividas extends Contas {

    private double percDesconto;

    /*  Métodos / Construtores
        + Divida(id: int, mes: int, ano: int, valor: double, pessoa: Pessoas, percentualDesconto: double): Dividas 
        + Divida(mes: int, ano: int, valor: double, pessoa: Pessoas, percentualDesconto: double): Dividas 
        + Dividas(idPessoa: int): Set<Dividas>
    */
    public Dividas(int idConta, int mes, int ano, double valor, Pessoas pessoa, double percDesconto) {
        super(idConta, mes, ano, valor, pessoa);
        this.percDesconto = percDesconto;        
    }

    public Dividas(int mes, int ano, double valor, Pessoas pessoa, double percDesconto) {
        this(0, mes, ano, valor, pessoa, percDesconto);
    }

    public static Set<Dividas> Divida(int idPessoa) {
        // Select no banco e retornar o Set<Dividas>

        return null;
    }

    public static void getDividas(int idPessoa){
        UsuarioDAO dao = new UsuarioDAO();
        dao.getDividas(idPessoa);
        dao.endConection();
    }

    /* Métodos Get - Set 
        + getPercentualDesconto(): double 
        + setPercentualDesconto(percentualDesconto: double): void
    */
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

    /* Método ToString     
        + toString(): String
    */ 
    @Override
    public String toString() {
        return "{" +
            " percDesconto='" + getPercDesconto() + "'" +
            "}";
    }

    /* Método Calculo Desconto da Divida
        - calculaDesconto(): double
    */
    public void imprimirDividas(){
        System.out.println("Cliente: " + this.getNomePessoa());
        System.out.println("Quantidade de Dividas: " + this.quantidadeDeDividas());
        valorDividas();
    }

    private String getNomePessoa() {
        return null;
    }

    private int quantidadeDeDividas() {
        return 0;
    }

    private void valorDividas(){
        
    }

    private String total() {
        return null;
    }
}