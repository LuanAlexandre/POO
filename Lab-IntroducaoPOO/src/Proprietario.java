/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
public class Proprietario {
    String nome;
    int cnh;
    int anoNascimento;
    
    Proprietario() {
        this("Emmett L. Brown", 98008173, 1920);
    }
    
    Proprietario(String nome, int cnh, int anoNascimento) {
        this.nome = nome;
        this.cnh = cnh;
        this.anoNascimento = anoNascimento;
    }
    
    public int getIdade(int anoReferencia) {
        int idade = anoReferencia - this.anoNascimento;
        return idade;
    }
    
    public String getDescricao() {
        return "Proprietario: nome=" + this.nome + ", cnh=" + this.cnh + ", anoNascimento=" + this.anoNascimento + ".";
    }
}
