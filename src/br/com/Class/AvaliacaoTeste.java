
package br.com.Class;

import br.com.conexoes.ConexaoSQLite;
import br.com.conexoes.TabelaBanco.BancoSQLite;
import java.sql.SQLException;
import java.util.ArrayList;

public class AvaliacaoTeste {

    public static void main(String[] args) throws SQLException {
        
    //------------------- Objetos das Listas ----------------------------
        
        ArrayList<Professor> listProfessores1 = new ArrayList<>();
        ArrayList<Professor> listProfessores2 = new ArrayList<>();
        ArrayList<Professor> listProfessores3 = new ArrayList<>();
        
        ArrayList<Disciplina> listDisciplinas1 = new ArrayList<>();
        ArrayList<Disciplina> listDisciplinas2 = new ArrayList<>();
        ArrayList<Disciplina> listDisciplinas3 = new ArrayList<>();
        
        ArrayList<Aluno> listAlunos1 = new ArrayList<>();
        ArrayList<Aluno> listAlunos2 = new ArrayList<>();
        ArrayList<Aluno> listAlunos3 = new ArrayList<>();
        
        
    //------------------- Objetos das classes ----------------------------
        Curso c = new Curso();
        Curso c2 = new Curso();                 // CURSOS
        Curso c3 = new Curso();
        
        Endereco end = new Endereco();
        Endereco end1 = new Endereco();         // ENDEREÇOS
        Endereco end2 = new Endereco();
        
        Aluno a = new Aluno();
        Aluno a2 = new Aluno();                 // ALUNOS
        Aluno a3 = new Aluno();
        
        Disciplina d = new Disciplina();
        Disciplina d2 = new Disciplina();       // DISCIPLINAS
        Disciplina d3 = new Disciplina();
        
        Professor prof = new Professor();
        Professor prof2 = new Professor();      // PROFESSORES
        Professor prof3 = new Professor();
        
        
    //------------------- Cadastro de Professores -------------------------
        
        prof.setNome("Jose ALves");
        prof.setSexo("Masculino");
        prof.setTelefone("(99)9999-8999");
        prof.setDisciplina(listDisciplinas1);        // ADICIONA UMA LISTA DE DISCIPLINAS    

        
        prof2.setNome("Micael");
        prof2.setSexo("Masculino");
        prof2.setTelefone("(99)9999-2222");
        prof2.setDisciplina(listDisciplinas2);        // ADICIONA UMA LISTA DE DISCIPLINAS
        
        
        prof3.setNome("Vanessa");
        prof3.setSexo("Feminina");
        prof3.setTelefone("(99)91999-9292");
        prof3.setDisciplina(listDisciplinas3);        // ADICIONA UMA LISTA DE DISCIPLINAS
        
        
    //------------------- Cadastro de Disciplinas -------------------------
        
        d.setNome("Algoritimo");
        d.setCargahorariaDisci(60); // horas
        
        
        d2.setNome("Programação");
        d2.setCargahorariaDisci(60); //horas
        
        
        d3.setNome("Estatistica");
        d3.setCargahorariaDisci(30); //horas
        d3.addListAluno(listAlunos2);
    
    //------------------- Cadastro de Alunos -------------------------------
        
        a.setNome("Willian silva");
        a.setSexo("Masculino");
        a.setEmail("wsalmeida@suzano.com.br");
        a.setEndereco(end);
        end.setCidade("Imperatriz");
        end.setBairro("Santa Rita");
        a.addListDisciplina(listDisciplinas2);
        
        a2.setNome("Marcelo Mercedes");
        a2.setSexo("Masculino");
        a2.setEmail("Mmercedes@suzano.com.br");
        a2.setCpf("606.777.888-60");
        a2.setEndereco(end1);
        end1.setCidade("Acailandia");
        end1.setBairro("Palmeiras");
        
        
        a3.setNome("Vitoria almeida");
        a3.setSexo("Feminina");
        a3.setEndereco(end2);
        end2.setCidade("Imperatriz");
        end2.setBairro("Bom Sucesso");
        
    //------------------- Cadastro de Curso ----------------------------------
        
        c.setNome("Redes e Computadores");
        c.setCargaHoraria(150);// horas
        c.setProfessor(listProfessores1);    // ADICIONA UMA LISTA DE PROFESSORES
        c.setDisciplina(listDisciplinas1);   // ADICIONA UMA LISTA DE DISCIPLINAS
        c.addListAluno(listAlunos1);         // ADICIONA UMA LISTA DE ALUNOS
        
        
        
        c2.setNome("Sistema da Informação");
        c2.setCargaHoraria(100);                                                  // -------------- OBSERVAÇÃO --------------------
        c2.setProfessor(listProfessores2);   // ADICIONA UMA LISTA DE PROFESSORES // --- CADA CURSO TEM UM OBJETO LISTA DE ALUNO --
        c2.setDisciplina(listDisciplinas2);  // ADICIONA UMA LISTA DE DISCIPLINAS // --- DIFERENTE, PARA MANTER O CONTROLE DE    --
        c2.addListAluno(listAlunos2);        // ADICIONA UMA LISTA DE ALUNOS      // --- ALUNOS CADASTRADO NO CURSO              --
//                                                                                   ----------------------------------------------
        
// -------- MUITOS PARA UM ---------
        
        // CADASTRANDO PROFESSOR NO CURSO E ADICIONANDO DISCIPLINAS CURSO/PROFESSOR
        
        ConexaoSQLite conexaoSQL = new ConexaoSQLite();
        BancoSQLite banco = new BancoSQLite(conexaoSQL);
        banco.criarTabelaPessoa();
        conexaoSQL.conectar();
        banco.insertPessoa(a3);
   
    }    
}   
        

    

