package app;

import java.sql.*;

public class Conexao {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/contas";
        String user = "root";
        String password = "";

        Connection conexao = DriverManager.getConnection(url, user, password);

        System.out.println("Funfou!" + conexao);
    }
}