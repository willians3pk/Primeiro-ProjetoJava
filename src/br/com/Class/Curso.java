
package br.com.Class;

import br.com.Telas.Cadastros.Cadastro;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Curso {
    
//----------------- Atributos -----------------
    
    private String Nome;
    private int CargaHoraria;
    private int duracao;
    private int Semestres;
    private ArrayList<Disciplina> disciplina;
    private ArrayList<Professor> professor;
    private ArrayList<Aluno> aluno;

//------------- CONSTRUTORES -------------------
    public Curso() {
        
    }

    public Curso(String Nome, int CargaHoraria, int duracao, int Semestres, ArrayList<Disciplina> disciplina, ArrayList<Professor> professor, ArrayList<Aluno> aluno, long NumeroMatricula) {
        this.Nome = Nome;
        this.CargaHoraria = CargaHoraria;
        this.duracao = duracao;
        this.Semestres = Semestres;
        this.disciplina = disciplina;
        this.professor = professor;
        this.aluno = aluno;
    }
  
//--------------- Metados Getter e Setter ------------------------------------//

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getSemestres() {
        return Semestres;
    }

    public void setSemestres(int Semestres) {
        this.Semestres = Semestres;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(ArrayList<Professor> professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getListAluno() {
        return aluno;
    }

    public void addListAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }
    
    
// ------------------- METODOS CRIADOS DE ARRAYLIST<> -------------------------//
    
    
    public void excluirAluno(Aluno a) {
        this.aluno.remove(a);
    }
    
    public void matricularAluno(Aluno a){
        this.aluno.add(a);
    }
    
    public int quantidadeAluno(){
        return aluno.size();
    }
    
    public String pesquisarAluno(Aluno a){
        if(aluno.contains(a)){
            return a.imprimir();
        }
        return "Aluno nao Encontrado!!";
    }
    
    public String buscaPorDadosAluno(String nomeAluno){
        
        String buscarPor = nomeAluno;
        try {
            // ---------- PESQQUISAR POR NOME ----------
            for (int i = 0; i < aluno.size(); i++) {
                if(aluno.get(i).getNome().contains(buscarPor)){
                    return aluno.get(i).dadosDoAluno();
                }
            }// ---------- PESQQUISAR POR CPF ----------
            for (int i = 0; i < aluno.size(); i++) {
                if(aluno.get(i).getCpf().contains(buscarPor)){
                    return aluno.get(i).dadosDoAluno();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Aluno nao Encontrado!!";
    }
    
// ------------------- PROFESSORES ------------------------- //  
    
    public void adicionarProfessor(Professor prof){
        this.professor.add(prof);
    }
    
    public void excluirProfessor(Professor prof){
        this.professor.remove(prof);
    }
    
    public int quantidadeProfessores(){
        return professor.size();
    }
    
    public String pesquisaProfessor(Professor prof){
        if(professor.contains(prof)){
            return prof.dadosDoProfessor();
        };return "Professor nao encontrado!!";
    }
    
    public String buscarPorDadosProfessor(String nomeProfessor){
        String busca = nomeProfessor;
        try {
         // ---------- PESQUISAR POR NOME ------------
            for (int i = 0; i < professor.size(); i++) {
                if(professor.get(i).getNome().contains(busca)){
                    return professor.get(i).dadosDoProfessor();
            }
        }// ---------PESQUISAR POR CPF ---------------
            for (int i = 0; i < professor.size(); i++) {
                if(professor.get(i).getCpf().contains(busca)){
                    return professor.get(i).dadosDoProfessor();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Professor nao encontrado";
    }
    
    public void adicionarDisciplina(Disciplina disc){
        this.disciplina.add(disc);
    }
    
    public void excluirDisciplina(Disciplina disc){
        this.disciplina.remove(disc);
    }
    
    public int quantidadeDisciplina(){
        return disciplina.size();
    }
    
    public void excluirDisciplinas(Disciplina dis1, Disciplina dis2, Disciplina dis3, Disciplina dis4) {
        this.disciplina.remove(dis1);
        this.disciplina.remove(dis2);
        this.disciplina.remove(dis3);
        this.disciplina.remove(dis4);
    }
        
    public String dadosDoCurso(){
        return "Curso: " + Nome + "\nCargaHoraria: " + CargaHoraria + "\nduracao: " + duracao + "\nSemestres: "
                + Semestres +"\n";
    }
    
    public String imprimir(){
        return "Curso: " + Nome + "\nCargaHoraria: " + CargaHoraria + "\nduracao: " + duracao + "\nSemestres: "
                + Semestres + "\nDisciplinas: "+ this.disciplina + "\nlistAluno: " + aluno+"\n";
    }
    
    @Override
    public String toString() {
        return "Curso: " + Nome + "\nCargaHoraria: " + CargaHoraria + "\nduracao: " + duracao + "\nSemestres: "
                + Semestres + "\ndisciplina: " + disciplina + "\nprofessor: " + professor + "\nLista de Aluno: " + aluno+"\n";
    }

    public void Salvar(){
                
            String nomeDoArquivo = "Cadastro de Curso"; // Nome do arquivo
            String caminhoDoArquivo = "C:\\Users\\" + System.getProperty("user.name").toString() + "\\Desktop\\" + nomeDoArquivo + ".txt";
            
            try {
                FileWriter Arquivo      = new FileWriter(caminhoDoArquivo, true);
                PrintWriter escrever    = new PrintWriter(Arquivo);
                
                escrever.println(Curso.class.toString()); // Escreve a lista de alunos no Arquivo
                escrever.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
