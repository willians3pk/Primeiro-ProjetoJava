
package br.com.classe;

import br.com.Telas.Cadastros.Cadastro;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Professor extends Pessoa {
    
//----------------- Atributos -----------------
    
    private ArrayList<Disciplina> disciplina;
    private int CargaHorariaProf;
    private Curso curso;
    
//------------- CONSTRUTORES -------------------

    public Professor() {
        
    }

    public Professor(ArrayList<Disciplina> disciplina, int CargaHorariaProf) {
        this.disciplina = disciplina;
        this.CargaHorariaProf = CargaHorariaProf;
    }
    
//-------------------- Metados Getter e Setter -------------------------------//

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    
    public int getCargaHorariaProf() {
        return CargaHorariaProf;
    }

    public void setCargaHorariaProf(int CargaHorariaProf) {
        this.CargaHorariaProf = CargaHorariaProf;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    //------------------ Metados Getter e Setter -----------------------------//

    public void adicionarDisciplinas(Disciplina disc1,Disciplina disc2,Disciplina disc3){
        this.disciplina.add(disc1);
        this.disciplina.add(disc2);
        this.disciplina.add(disc3);
    }
    
    public void adicionaDisciplina(Disciplina disciplina){
        this.disciplina.add(disciplina);
    }
    
    public void excluirDisciplina(Disciplina disciplina){
        this.disciplina.remove(disciplina);
    }
    
    public void adicionarCurso(Curso curso){
        this.curso = curso;
    }

    public String dadosDoProfessor(){
        return  "------------------------- PROFESSOR -----------------------\n"+
                "Nome: "+this.getNome()+ "\nCpf: "+this.getCpf()+"\nData Nascimento: "+this.getDataNascimento()+
                "\nSexo: "+this.getSexo()+"\nE-mail: "+this.getEmail()+"\nContato: "+this.getTelefone()+"\n";
    }
    
    public String imprimir(){
        return  "------------------------- PROFESSOR -----------------------\n"+
                "Nome: "+this.getNome()+ "\nCpf: "+this.getCpf()+"\nData Nascimento: "+this.getDataNascimento()+
                "\nSexo: "+this.getSexo()+"\nE-mail: "+this.getEmail()+"\nContato: "+this.getTelefone()+"\n"+this.disciplina+"\n";
    }

    @Override
    public String toString() {
        return "Professor: "+this.getNome()+ "{" + "disciplina: " + disciplina + ", CargaHorariaProf: " + CargaHorariaProf + ", curso: " + curso.getNome() + '}'+"\n";
    }

    public void SalvarBlocoNotas() {
                     
            String nomeDoArquivo = "Cadastros de Professores"; // Nome do arquivo
            String caminhoDoArquivo = "C:\\Users\\" + System.getProperty("user.name").toString() + "\\Desktop\\" + nomeDoArquivo + ".txt";
            
            try {
                FileWriter Arquivo      = new FileWriter(caminhoDoArquivo, true);
                PrintWriter escrever    = new PrintWriter(Arquivo);
                
                escrever.println(super.toString()); // ESCREVE O CADASTRO NO ARQUIVO BLOCO NOTAS
                escrever.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
    
}
