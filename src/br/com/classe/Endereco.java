
package br.com.classe;

public class Endereco {
//*************Atributos    
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private int NumeroCasa;

//*************Metados
    
    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getNumeroCasa() {
        return NumeroCasa;
    }

    public void setNumeroCasa(int NumeroCasa) {
        this.NumeroCasa = NumeroCasa;
    }
    
    
}
