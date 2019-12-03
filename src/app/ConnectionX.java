package app;

import java.sql.Connection; //Import das Classes 
import java.sql.DriverManager; //Conexao SQL p/ Java
import java.sql.SQLException; //Tratamento de Exceções

public class ConnectionX {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/contas?useTimezone=true&serverTimezone=UTC","root","");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }

    }
}