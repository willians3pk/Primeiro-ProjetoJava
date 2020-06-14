
package br.com.classe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AvaliacaoTeste2 {
    
    public static void main(String[] args) {
        int opcao = 0;
        
        Scanner leitorTerminal = new Scanner(System.in);
        
        do {            
        
            System.out.println("\n------ ATENÇÃO TODOS OS ARQUIVOS SAO CRIADOS/SALVOS E LIDOS/BUSCADOS NA AREA DE TRABALHO ------");
            System.out.println("--------------------------------------------------------------");
            System.out.println("            Informe a Opção que deseja realizar!!!");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Digite:");
            System.out.println("1 - Cadastrar Alunos/Salvar um arquivo ");
            System.out.println("2 - Pesquisar Alunos/Buscar um arquivo ");
            System.out.println("3 - Sair do Programa ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("->");

            opcao = leitorTerminal.nextInt();
           
            switch(opcao){
                
                case 1:
                    Cadastro();
                    break;
                case 2:
                    pesquisaCadastro();
                    break;
                case 3:
                    System.out.println("Obrigado por Usar o Programa!!");
                default:
                    System.out.println("Opção não implementada!!!");
                    break;
                    
            }
            
        } while (opcao != 3); // equanto opcao for diferente de 3:
    }
    public static void Cadastro(){
        
        ArrayList<Aluno> listAluno2 = new ArrayList<>();
        Aluno aluno                = new Aluno();
        Curso curso                = new Curso();
        Scanner LeitorTerminal     = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("                    CADASTRO DO ALUNO!!");
        System.out.println("                Informe os dados do Aluno!!");
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("NOME:");
        aluno.setNome(LeitorTerminal.nextLine()); // Escrever Nome do Aluno
        
        System.out.println("CPF:");
        aluno.setCpf(LeitorTerminal.nextLine());  // Escrever Cpf do Aluno
        listAluno2.add(aluno);                     // Adiciona o Aluno na Lista
        String dadosDoAluno = listAluno2.toString();
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("                    CADASTRAR CURSO!!");
        System.out.println("                Informe os dados do Curso ");
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("NOME DO CURSO:");
        curso.setNome(LeitorTerminal.nextLine());      // Escrever Nome do Curso
        System.out.println("CARGA HORARIA:");
        curso.setCargaHoraria(LeitorTerminal.nextInt());
        curso.addListAluno(listAluno2);                // Adiciona a Lista de Aluno no Curso
        String nomeDoCurso = curso.getNome();
        
        String caminhoDoArquivo = "C:\\Users\\" + System.getProperty("user.name").toString() + "\\Desktop\\" + nomeDoCurso + ".txt";
        
        try {
            
            FileWriter Arquivo   = new FileWriter(caminhoDoArquivo, true); // Escritor de Arquivo
            PrintWriter escrever = new PrintWriter(Arquivo); 
            
            escrever.println(dadosDoAluno.toString());
            escrever.close();
            
            System.out.println("\n--------------------------------------------------------------");
            System.out.println("Aluno Cadastrado com Sucesso no Diretorio descrito abaixo!!");
            System.out.println("--------------------------------------------------------------");
            System.out.println(caminhoDoArquivo);
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    public static void pesquisaCadastro(){
        
        Scanner leitorTerminal = new Scanner(System.in);
        
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("        Informe o nome do Curso que deseja Pesquisar!");
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("Digite o Nome do Curso:");
        String nomeDoCurso = leitorTerminal.nextLine();
        
        String caminhoDoArquivo = "C:\\Users\\" + System.getProperty("user.name").toString() + "\\Desktop\\" + nomeDoCurso + ".txt";
       
        try {
            FileReader arquivoParaLeitura = new FileReader (caminhoDoArquivo); // Leitor de Arquivo
            
            BufferedReader leitorArquivo = new BufferedReader(arquivoParaLeitura);
            
            String linha = leitorArquivo.readLine(); // ler a primeira linha
            
            while (linha != null) {                
                System.out.println(linha);
                linha = leitorArquivo.readLine(); // ler a proxima linha
            }
            
            System.out.println("\n");
            leitorArquivo.close();
            
        } catch (IOException e) {
            System.out.println("\n");
            System.out.println(e.getMessage());
        }
        
    }
    
}
