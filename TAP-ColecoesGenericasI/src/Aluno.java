/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Calendar;

public class Aluno {
    String nome;
    int matricula;
    int anoNascimento;
    
    Aluno() {
        this("Emmet L. Brown", 7714, 2002);
    }
    
    Aluno(String nome, int matricula, int anoNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoNascimento = anoNascimento;
    }
    
    public int getIdade() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int anoNascimento = this.anoNascimento;
        
        return anoAtual - anoNascimento;
    }
    
    public String getDescricao() {
        String nome = this.nome;
        int idade = getIdade();
        int matricula = this.matricula;
        
        String descricao = nome + " (mat=" + matricula + ", idade=" + idade + ")";
        
        return descricao;
    }
}
