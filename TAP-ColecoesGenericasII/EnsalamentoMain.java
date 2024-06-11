public class EnsalamentoMain {
  public static void main(String[] args) {
    Sala sala101 = new Sala(6, 101, 50, true);
    Sala sala102 = new Sala(6, 102, 100, true);
    Sala sala203 = new Sala(6, 203, 50, false);
    Sala sala204 = new Sala(6, 204, 100, false);

    Turma turma1 = new Turma("Tecnicas de Programacao", "Horacio Fernandes", 50, false);
    Turma turma2 = new Turma("Laboratorio de Programacao C", "Horacio Fernandes", 50, true);
    Turma turma3 = new Turma("Algoritmos e Estruturas de Dados I", "Edleno Silva", 60, false);
    Turma turma4 = new Turma("Redes de Computadores", "Edjair Souza", 70, true);

    turma1.addHorario(11);
    turma1.addHorario(25);
    turma1.addHorario(32);

    turma2.addHorario(1);
    turma2.addHorario(15);
    turma2.addHorario(29);

    turma3.addHorario(1);
    turma3.addHorario(15);
    turma3.addHorario(29);

    turma4.addHorario(2);
    turma4.addHorario(16);

    // System.out.printf("%s\n\n", salaNovaV.getDescricao());
    // System.out.printf("%s\n\n", salaNova.getDescricao());
    // System.out.printf("%s\n\n", turmaNovaV.getDescricao());
    // System.out.printf("%s\n\n", turmaNova.getDescricao());

    Ensalamento novEnsalamento = new Ensalamento();

    novEnsalamento.addSala(sala101);
    novEnsalamento.addSala(sala102);
    novEnsalamento.addSala(sala203);
    novEnsalamento.addSala(sala204);

    novEnsalamento.addTurma(turma1);
    novEnsalamento.addTurma(turma2);
    novEnsalamento.addTurma(turma3);
    novEnsalamento.addTurma(turma4);

    // novEnsalamento.alocar(turma1, sala101);
    // System.out.println(novEnsalamento.alocar(turma1, sala101));
    // novEnsalamento.alocar(turma2, sala101);
    // System.out.println(novEnsalamento.alocar(turma2, sala101));
    // novEnsalamento.alocar(turma3, sala102);
    // System.out.println(novEnsalamento.alocar(turma3, sala102));

    novEnsalamento.alocarTodas();
    
    System.out.println("Resumo Ensalamento:");
    System.out.printf("%s\n\n", novEnsalamento.relatorioResumoEnsalamento());
    System.out.println("\n\n\nResumo Turmas por Sala:");
    System.out.printf("%s\n\n", novEnsalamento.relatorioTurmasPorSala());
    System.out.println("\n\n\nResumo Salas por Turma:");
    System.out.printf("%s\n\n", novEnsalamento.relatorioSalasPorTurma());

    // System.out.println(novEnsalamento.salas.size());
    // System.out.println(novEnsalamento.turmas.size());
    
    // System.out.println(novEnsalamento.salaDisponivel(salaNova, 5));
  }
}
