package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        String sql = "INSERT INTO pessoas (nome,email) VALUES (?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getEmailPessoa());
            stmt.execute();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public void adicionarProventos(Proventos provento){
        String sql1 = "INSERT INTO proventos (pessoas_id,mes,ano,valor,imposto) VALUES (?,?,?,?,?)";
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
        String sql2 = "INSERT INTO dividas (pessoas_id,mes,ano,valor,desconto) VALUES (?,?,?,?,?)";
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

    public Pessoas getPessoa(int idPessoa){
        String sql = "SELECT * FROM pessoas WHERE id = " + idPessoa;
        try{
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);

            if(resultSet.next()){
                return new Pessoas(
                    resultSet.getInt("id"), 
                    resultSet.getString("nome"), 
                    resultSet.getString("email"));
            }

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return null;
    }

    public void getPessoas(){
        String sql = "SELECT * FROM pessoas";
        try{
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);

            while(resultSet.next()){
                Pessoas pessoa = new Pessoas(
                    resultSet.getInt("id"), 
                    resultSet.getString("nome"), 
                    resultSet.getString("email"));
                
                System.out.println(pessoa.toString());
            }

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public Pessoas getDividas(int idPessoa){
        String sql = "SELECT * FROM dividas WHERE pessoas_id = " + idPessoa;
        try{
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);

            while(resultSet.next()){
                Pessoas pessoa = getPessoa(resultSet.getInt("pessoas_id"));

                Dividas divida = new Dividas(
                    resultSet.getInt("id"),
                    resultSet.getInt("mes"),
                    resultSet.getInt("ano"),
                    resultSet.getDouble("valor"),
                    pessoa,
                    resultSet.getDouble("percDesconto"));

                System.out.println(divida.toString());
            }

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return null;
    }

    public void endConection(){
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}