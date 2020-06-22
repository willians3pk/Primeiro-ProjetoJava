package br.com.Class;

import br.com.Telas.Cadastros.Cadastro;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aluno extends Pessoa {

//------------ Atributos ----------------------- 
    private String NumeroMatricula;
    private double Notas;
    private byte Falta;
    private ArrayList<Disciplina> disciplina;
    private Curso curso;

//------------ CONSTRUTORES --------------------  
    public Aluno() {
    }

    public Aluno(String Nome, String Sexo, String Cpf) {
        setNome(Nome);
        setCpf(Sexo);
        setEmail(Cpf);
    }

    public Aluno(String NumeroMatricula, double Notas, Curso curso) {
        this.NumeroMatricula = NumeroMatricula;
        this.Notas = Notas;
        this.curso = curso;
    }

//----------------------- Metados Getter e Setter -------------------------//
    public String getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(String NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }

    public double getNotas() {
        return Notas;
    }

    public void setNotas(double Notas) {
        this.Notas = Notas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public byte getFalta() {
        return Falta;
    }

    public void setFalta(byte Falta) {
        this.Falta = Falta;
    }

    public ArrayList<Disciplina> getListDisciplina() {
        return disciplina;
    }

    public void addListDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

// ------------------- METODOS --------------------------//
    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplina.add(disciplina);
    }

    public void excluirDisciplina(Disciplina disciplina) {
        this.disciplina.remove(disciplina);
    }

    public int quantidadeDisciplina() {
        return disciplina.size();
    }

    public void adicionarCurso(Curso curso) {
        this.curso = curso;
    }

    public String pesquisarCurso() {
        return curso.dadosDoCurso();
    }

    public String dadosDoAluno() {
        return "Nome: " + this.getNome() + "\nCpf: " + this.getCpf() + "\nData Nascimento: " + this.getDataNascimento()
                + "\nSexo: " + this.getSexo() + "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail() + "\nCursando: " + this.curso.getNome() + "\n";
    }

    @Override
    public String imprimir() {
        return "\n"
                + "Nome: " + this.getNome() + "\nCpf: " + this.getCpf() + "\nData Nascimento: " + this.getDataNascimento()
                + "\nSexo: " + this.getSexo() + "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail() + "\n "
                + "\n" + "Curso: " + this.curso.getNome() + "\nLista de alunos:" + this.curso.getListAluno() + "\n";
    }

    @Override
    public String toString() {
        return "\n"
                + " Nome: " + this.getNome() + "\n Cpf: " + this.getCpf() + "\n Data Nascimento: " + this.getDataNascimento()
                + "\n Sexo: " + this.getSexo() + "\n Telefone: " + this.getTelefone() + "\n Email: " + this.getEmail() + "\n "
                + "\n" + "\nDisciplina: " + this.disciplina + "\n";
    }

    public void SalvarBlocoNotas() {

        String nomeDoArquivo = "Cadastros de Alunos"; // Nome do arquivo
        String caminhoDoArquivo = "C:\\Users\\" + System.getProperty("user.name").toString() + "\\Desktop\\" + nomeDoArquivo + ".txt";

        try {
            FileWriter Arquivo = new FileWriter(caminhoDoArquivo, true);
            PrintWriter escrever = new PrintWriter(Arquivo);

            escrever.println(super.toString()); // ESCREVE O CADASTRO NO ARQUIVO BLOCO NOTAS
            escrever.close();

        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
