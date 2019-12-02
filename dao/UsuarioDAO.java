package dao;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.xdevapi.PreparableStatement;
import app.ConnectionFactory;
import app.ConnectionX;

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

    public void adicionaPessoa(Pessoas pessoas) {
        String sql = "INSERT INTO pessoas (idPessoa,nomePessoa,EmailPessoa) VALUES (?,?,?)";
        try {
            PreparableStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pessoa.getidPessoa());
            stmt.setString(2, pessoa.getnomePessoa());
            stmt.setString(3, pessoa.getemailPessoa());
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        String sql1 = "INSERT INTO proventos (idPessoa,imposto,valor,mes,ano) VALUES (?,?,?,?,?)";
        try {
            PreparableStatement stmt = connection.prepareStatement(sql1);
            stmt.setInt(provento.getIdPessoa());
            stmt.setDouble(provento.getImposto());
            stmt.setDouble(provento.getValor());
            stmt.setInt(provento.getMes());
            stmt.setInt(provento.getAno());
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        String sql2 = "INSERT INTO dividas (idPessoa,desconto,valor,mes,ano) VALUES (?,?,?,?,?)";
        try {
            PreparableStatement stmt = connection.prepareStatement(sql2);
            stmt.setInt(divida.getIdPessoa());
            stmt.setDouble(divida.getDesconto());
            stmt.setDouble(divida.getValor());
            stmt.setInt(divida.getMes());
            stmt.setInt(divida.getAno());
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}