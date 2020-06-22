
package br.com.conexoes.TabelaBanco;

import br.com.Class.Aluno;
import br.com.Class.Pessoa;
import br.com.conexoes.ConexaoSQLite;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class BancoSQLite {
    
    private final ConexaoSQLite conexaoSQLite;
    private Statement stmt;
    private Connection conn;

    public BancoSQLite(ConexaoSQLite pConexaoSQLite) {
        this.conexaoSQLite = pConexaoSQLite;
    }
    
    
    public void criarTabelaPessoa() throws SQLException{
        // CRIA TABELA DO BANCO DE DADOS 
        String SQL = "CREATE TABLE IF NOT EXISTS pessoa"
                +"("
                +"Id INTEGER PRIMARY KEY AUTOINCREMENT,"
                +"Nome text NOT NULL,"
                +"Sexo text NOT NULL,"
                +"Cpf text NOT NULL,"
                +"Telefone text NOT NULL,"
                +"DataNascimento text NOT NULL,"
                +"Email text NOT NULL"
                +");";
        
        //EXECUTANDO O SQL DE CRIAR TABELAS
            conn= null;
        
        try {

            conn = this.conexaoSQLite.conectar();
            Statement stmt = this.conn.createStatement();
            stmt.execute(SQL);
            System.out.println("TABELA CRIADA COM SUCESSO!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("TABELA NAO FOI CRIADA");
        }
        
        if (conn.isClosed() == false) {
            this.conexaoSQLite.desconectar(); // DESCONECTA O BANCO SE ELE TIVER CONECTADO
        }
    }

    public void insertPessoa(Pessoa alu) throws SQLException {
                
        String sqlInsert = " INSERT INTO pessoa("
                + "Nome,"
                + "Sexo,"
                + "Cpf,"
                +"Telefone,"
                +"DataNascimento,"
                +"Email"
                + ") VALUES(?,?,?,?,?,?)"+";";
        
        conn = conexaoSQLite.conectar(); // CONECTAR O BANCO //
        PreparedStatement InsertTabela = conn.prepareStatement(sqlInsert);
        
        try {
            
            // ------- INSERI AS INFORMAÇÕES DO ALUNO NA TABELA -------- //
            
            InsertTabela.setString(1, alu.getNome());
            InsertTabela.setString(2, alu.getSexo());
            InsertTabela.setString(3, alu.getCpf());
            InsertTabela.setString(4, alu.getTelefone());
            InsertTabela.setString(5, alu.getDataNascimento());
            InsertTabela.setString(6, alu.getEmail());

            int result = InsertTabela.executeUpdate();
            InsertTabela.close();

            if (result == 1) {
                System.out.println("INSERIDO COM SUCESSO!!!");
            } else {
                System.out.println("ERRO ao Inserir!!!");
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (InsertTabela != null) {
                try {
                    InsertTabela.close();
                } catch (Exception e) {
                    System.out.println("...");
                }
            }
            conexaoSQLite.desconectar(); // DESCONECTA O BANCO DE DADOS
        }

    }
    
}
