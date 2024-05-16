/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
public class TurmaMain {
    public static void main(String[] args) {
        Aluno alunoVazio = new Aluno();
        Aluno alunoNovo = new Aluno("Luan Barreto", 2205, 1997);
        
        String descricaoAlunoVazio = alunoVazio.getDescricao();
        String descricaoAlunoNovo = alunoNovo.getDescricao();
        
        System.out.println(descricaoAlunoVazio);
        System.out.println(descricaoAlunoNovo);
        System.out.println();
        
        Professor professorVazio = new Professor();
        Professor professorNovo = new Professor("PhD.", "Alexandre Ramos", 2507);
        
        String descricaoProfessorVazio = professorVazio.getDescricao();
        String descricaoProfessorNovo = professorNovo.getDescricao();
        
        System.out.println(descricaoProfessorVazio);
        System.out.println(descricaoProfessorNovo);
        System.out.println();
        
        Turma turmaNova = new Turma("Projeto de Programas", 2024, 1, professorNovo);
        
        turmaNova.addAluno(alunoVazio);
        turmaNova.addAluno(alunoNovo);
        
        String descricaoTurma = turmaNova.getDescricao();
        
        System.out.println(descricaoTurma);
        System.out.println();
    }
}
