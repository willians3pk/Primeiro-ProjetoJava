
package br.com.classe;


public class Pessoa {
    
//---------------- Atributos -------------------
    
    private String Nome;
    private String Sexo;
    private String Cpf;
    private String Telefone;
    private String DataNascimento;
    private String Email;
    private Endereco endereco; 
    
//------------- CONSTRUTORES -------------------
    
    public void cadastrarPessoa(){
        
    }
    
    public Pessoa() {
        
    }

    public Pessoa(String Nome, String Sexo, String Cpf, String Telefone, String DataNascimento, String Email, Endereco endereco) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
        this.DataNascimento = DataNascimento;
        this.Email = Email;
        this.endereco = endereco;
    }
    
    
//---------------------- Metados Getter e Setter -----------------------------//
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String imprimir(){
        return "Nome:"+this.Nome + "CPF "+this.Cpf + "Telefone "+ this.Telefone + "Email" + this.Email;
    }
    
    public String toString(){
        return "Nome:"+this.Nome + "CPF "+this.Cpf + "Telefone "+ this.Telefone + "Email" + this.Email;
    }   
    
}
