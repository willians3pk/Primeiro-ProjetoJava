
package br.com.Class;

import java.util.ArrayList;

public class Disciplina {

//------------- Atributos ----------------------
    private String Nome;
    private String descricao;
    private int CargahorariaDisci;
    private ArrayList<Aluno> aluno;
//------------- CONSTRUTORES -------------------

    public Disciplina() {
        
    }

    public Disciplina(String Nome, String Descricao, int CargahorariaDisci) {
        this.Nome = Nome;
        this.descricao = Descricao;
        this.CargahorariaDisci = CargahorariaDisci;
    }

    
//----------------------- Metados Getter e Setter -------------------------
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargahorariaDisci() {
        return CargahorariaDisci;
    }

    public void setCargahorariaDisci(int CargahorariaDisci) {
        this.CargahorariaDisci = CargahorariaDisci;
    }

    public ArrayList<Aluno> getListAluno() {
        return aluno;
    }

    public void addListAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }    
    
// ------------------- METODOS --------------------------//
      
    public void adicionarAluno(Aluno aluno){
        this.aluno.add(aluno);
    }
    
    public void excluirAluno(Aluno aluno){
        this.aluno.remove(aluno);
    }
    
    public int quantidadeAluno(){
        return aluno.size();
    }
    
    public String PesquisarAlunos(Aluno alu){
        if(aluno.contains(alu)){
            return alu.dadosDoAluno();
        }
        return "Aluno não Encontrado!!";
    }
    
    public String buscarPorNome(String alu){
        String busca = alu;
        for (int i = 0; i < aluno.size(); i++) {
            if(aluno.get(i).getNome().contains(busca)){
                return aluno.get(i).dadosDoAluno();
            }
        }
        
        return "Aluno Não encontrado";
    }
    
    public String imprimir(){
        return "\nNome da Disciplina: " + Nome + "\nNota: " + descricao + "\nCargahorariaDisci: " + CargahorariaDisci+
                "\nLista de Alunos: "+this.aluno+"\n";
    }
    
    @Override
    public String toString() {
        return "\nNome da Disciplina: " + Nome + "\nDescricao: " + descricao + "\nCargahorariaDisci: " + CargahorariaDisci+ 
                "\n";
    }

    
    
}
