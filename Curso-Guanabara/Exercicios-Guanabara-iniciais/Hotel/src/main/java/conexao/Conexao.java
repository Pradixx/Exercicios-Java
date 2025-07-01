package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // Constantes para configuração da conexão
    private static final String URL = "jdbc:mysql://localhost:3306/appsaneamento?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public Connection getConexao() {
        try {
            // Registrar o driver explicitamente
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver JDBC registrado com sucesso!");

            // Estabelecer e retornar a conexão
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            if (conn != null) {
                System.out.println("Conexão estabelecida com sucesso!");
                return conn;
            } else {
                System.err.println("Falha ao estabelecer conexão com o banco de dados");
                return null;
            }

        } catch (ClassNotFoundException e) {
            System.err.println("ERRO: Driver JDBC não encontrado!");
            System.err.println("Verifique se o arquivo mysql-connector-j-8.0.xx.jar está no classpath do projeto");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.err.println("ERRO: Falha ao conectar ao banco de dados!");
            System.err.println("Mensagem: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}