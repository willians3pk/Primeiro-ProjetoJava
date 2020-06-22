
package br.com.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoSQLite {
    
    private Statement stmt;
    private Connection conexao;

    //Conecta ao banco de dados (cria o banco de dados se não exitir um)
    public Connection conectar() {

        String url = "jdbc:sqlite:banco_de_dados/boncosqlite.db";

        try {
            conexao = null;
            conexao = DriverManager.getConnection(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("ERRO AO CONECTAR");
        }
        System.out.println("Conectado com o Banco");
        return conexao;
        
    }
        
    public void desconectar() {

        try {

            if (this.conexao.isClosed() == false) {
                this.conexao.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Erro ao tentar Desconectar!!!");
        }
        System.out.println("Desconectado do Banco!!!");
        
    }

}
