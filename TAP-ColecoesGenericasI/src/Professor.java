/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
public class Professor {
    String titulacao;
    String nome;
    int matricula;
    
    Professor() {
        this("Dr.", "Hubert J. Farnsworth", 2208);
    }
    
    Professor(String titulacao, String nome, int matricula) {
        this.titulacao = titulacao;
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getDescricao() {
        String titulacao = "Prof. " + this.titulacao + " ";
        String nome = this.nome;
        String matricula = " - mat " + this.matricula;
        String descricao = titulacao + nome + matricula;
        
        return descricao;
    }
}