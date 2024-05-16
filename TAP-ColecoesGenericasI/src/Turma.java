/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.*;

public class Turma {
    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    Turma(String disciplina, int ano, int semestre, Professor professor) {
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
    }
    
    public void addAluno(Aluno aluno) {
        int totalAlunos = this.alunos.size();
        
        if (totalAlunos == 0) this.alunos.add(aluno);
        else {
            int novaMatricula = aluno.matricula;
            Aluno alunoExiste = this.getAluno(novaMatricula);
            if (alunoExiste == null) this.alunos.add(aluno);
        }
    }
    
    public Aluno getAluno(int matricula) {
        int totalAlunos = this.alunos.size();
        Aluno alunoAtual;
        
        for(int i=0; i < totalAlunos; i++) {
            alunoAtual = this.alunos.get(i);
            if (alunoAtual.matricula == matricula) return alunoAtual;
        }
        return null;
    }
    
    public double getMediaIdade() {
        int totalAlunos = this.alunos.size();
        Aluno alunoAtual;
        int sum = 0;
        double mediaIdade;
        
        for(int i=0; i < totalAlunos; i++) {
            alunoAtual = this.alunos.get(i);
            sum += alunoAtual.getIdade();
        }
        
        mediaIdade = (double) sum / totalAlunos;
        
        return mediaIdade;
    }
    
    public String getDescricao() {
        String turma = "Turma " + this.disciplina + " - ";
        int ano = this.ano;
        int semestre = this.semestre;
        String professor = " (" + this.professor.getDescricao() + "):\n";        
        String descricao = turma + ano + "/" + semestre + professor;
        
        int totalAlunos = this.alunos.size();
        Aluno alunoAtual;
        String descricaoAlunoAtual;
        int index;
        
        System.out.println(totalAlunos);
        
        for (int i=0; i < totalAlunos; i++) {
            alunoAtual = this.alunos.get(i);
            descricaoAlunoAtual = alunoAtual.getDescricao();
            index = this.alunos.indexOf(alunoAtual) + 1;
            descricao += " - Aluno " + index + ": " + descricaoAlunoAtual + "\n";
            System.out.println(descricaoAlunoAtual);
        }
        
        return descricao;
    }
    
}
