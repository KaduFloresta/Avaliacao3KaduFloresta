package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import app.ConnectionX;
import app.Dividas;
import app.Pessoas;
import app.Proventos;

public class UsuarioDAO {
    private Connection connection;
    int idPessoa;
    String nomePessoa;
    String emailPessoa;
    double percDesconto;
    double imposto;
    int idConta;
    int mes;
    int ano;
    double valor;

    public UsuarioDAO() {
        this.connection = new ConnectionX().getConnection();
    }

    public void adicionaPessoa(Pessoas pessoa) {
        String sql = "INSERT INTO pessoas (idPessoa,nomePessoa,EmailPessoa) VALUES (?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pessoa.getIdPessoa());
            stmt.setString(2, pessoa.getNomePessoa());
            stmt.setString(3, pessoa.getEmailPessoa());
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public void adicionarProventos(Proventos provento){
        String sql1 = "INSERT INTO proventos (idPessoa,mes,ano,valor,imposto) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql1);
            stmt.setInt(1,provento.getIdConta());
            stmt.setInt(2,provento.getMes());
            stmt.setInt(3,provento.getAno());
            stmt.setDouble(4,provento.getValor());            
            stmt.setDouble(5,provento.getImposto());
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void adicionarDividas(Dividas divida){
        String sql2 = "INSERT INTO dividas (idPessoa,mes,ano,valor,desconto) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql2);
            stmt.setInt(1, divida.getIdConta());            
            stmt.setInt(2, divida.getMes());
            stmt.setInt(3, divida.getAno());
            stmt.setDouble(4, divida.getValor());
            stmt.setDouble(5, divida.getPercDesconto());
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void endConection(){
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}