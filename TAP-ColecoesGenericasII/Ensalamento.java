import java.util.*;

public class Ensalamento {
  ArrayList<Sala> salas;
  ArrayList<Turma> turmas;
  ArrayList<TurmaEmSala> ensalamento;

  Ensalamento() {
    this.salas = new ArrayList<Sala>();
    this.turmas = new ArrayList<Turma>();
    this.ensalamento = new ArrayList<TurmaEmSala>();
  }

  //---------------------------------------------------------------------------------
  public void addSala(Sala sala) {
    salas.add(sala);
  }

  //---------------------------------------------------------------------------------
  public void addTurma(Turma turma) {
    turmas.add(turma);
  }

  //---------------------------------------------------------------------------------
  public Sala getSala(Turma turma) {
    for (int i=0; i<ensalamento.size(); i++) {
      if(ensalamento.get(i).turma.equals(turma)) return ensalamento.get(i).sala;
    }
    return null;
  }

  //---------------------------------------------------------------------------------
  public boolean salaDisponivel(Sala sala, int horario) {
    for (int i=0; i<ensalamento.size(); i++) {
      if (ensalamento.get(i).sala.equals(sala)) {
        for (int j=0; j<ensalamento.get(i).turma.horarios.size(); j++) {
          if (ensalamento.get(i).turma.horarios.get(j) == horario) return false;
        }
      }
    }

    return true;
  }

  //---------------------------------------------------------------------------------
  public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
    boolean salaTotalmenteDisponivel = false;
    for (int i=0; i<horarios.size(); i++) {
      if (salaDisponivel(sala, horarios.get(i)) == true) 
      salaTotalmenteDisponivel = true;
      else 
      salaTotalmenteDisponivel = false;
    }

    return salaTotalmenteDisponivel;
  }

  //---------------------------------------------------------------------------------
  public boolean alocar(Turma turma, Sala sala) {
    TurmaEmSala novoAloc = new TurmaEmSala(turma, sala);
    boolean alocado;

    if (turma.acessivel == true) {
      if (
        sala.acessivel == true &&
        turma.numAlunos <= sala.capacidade &&
        salaDisponivel(sala, turma.horarios) == true
      ) {
          ensalamento.add(novoAloc);
          alocado = true;
      }
      else {
        alocado = false;
      }
    }
    else {
      if (
        turma.numAlunos <= sala.capacidade &&
        salaDisponivel(sala, turma.horarios) == true
      ) {
        ensalamento.add(novoAloc);
        alocado = true;
      }
      else alocado = false;
    }

    return alocado;
  }

  //---------------------------------------------------------------------------------
  public void alocarTodas() {
    int menorCoeficiente;
    Sala salaMenorCoeficiente = null;

    for (int i=0; i < turmas.size(); i++) {
      menorCoeficiente = Integer.MAX_VALUE;
      
      if (turmas.get(i).acessivel == true) {
        for (int j=0; j < salas.size(); j++) {

          if (salas.get(j).acessivel == true) {
            if (
              salas.get(j).capacidade - turmas.get(i).numAlunos < menorCoeficiente &&
              salas.get(j).capacidade - turmas.get(i).numAlunos >= 0
              ) {
              menorCoeficiente = salas.get(j).capacidade - turmas.get(i).numAlunos;
              salaMenorCoeficiente = salas.get(j);
            }
          }

        }
        alocar(turmas.get(i), salaMenorCoeficiente);
      }
      else {
        for (int j=0; j < salas.size(); j++) {
          if (
            salas.get(j).capacidade - turmas.get(i).numAlunos < menorCoeficiente &&
            salas.get(j).capacidade - turmas.get(i).numAlunos >= 0
            ) {
            menorCoeficiente = salas.get(j).capacidade - turmas.get(i).numAlunos;
            salaMenorCoeficiente = salas.get(j);
          }
        }
        alocar(turmas.get(i), salaMenorCoeficiente);
      }
    }
  }

  //---------------------------------------------------------------------------------
  //Retorna o total de turma alocadas
  public int getTotalTurmasAlocadas() {
    int contaTurmasAlocadas = 0;

    for (int i=0; i < ensalamento.size(); i++) {
      if (ensalamento.get(i).sala != null) contaTurmasAlocadas++;
    }

    return contaTurmasAlocadas;
  }

  //---------------------------------------------------------------------------------
  //Retorna o total de lugares livres nas salas - coeficiente de eficiencia
  public int getTotalEspacoLivre() {
    int eficiencia = 0;

    for (int i=0; i < ensalamento.size(); i++) {
      eficiencia += (ensalamento.get(i).sala.capacidade - ensalamento.get(i).turma.numAlunos);
    }

    return eficiencia;
  }

  public String relatorioResumoEnsalamento() {
    return "Total de Salas: " + salas.size() + "\n" +
    "Total de Turmas: " + turmas.size() + "\n" +
    "Turmas Alocadas: " + getTotalTurmasAlocadas() + "\n" +
    "Espaços Livres: " + getTotalEspacoLivre();
  }

  //---------------------------------------------------------------------------------
  public String relatorioTurmasPorSala() {
    String descricao = relatorioResumoEnsalamento() + "\n\n";

    for (int i=0; i < salas.size(); i++) {
      if (i == salas.size() - 1) {
        descricao += "--- " + salas.get(i).getDescricao() + " ---";
        for (int j=0; j < ensalamento.size(); j++) {
          if (salas.get(i).equals(ensalamento.get(j).sala)) {
            descricao += ensalamento.get(j).turma.getDescricao();
          }
        }
      }
      else {
        descricao += "--- " + salas.get(i).getDescricao() + " ---\n\n";
        for (int j=0; j < ensalamento.size(); j++) {
          if (salas.get(i).equals(ensalamento.get(j).sala)) {
            descricao += ensalamento.get(j).turma.getDescricao() + "\n\n";
          }
        }
      }
    }

    return descricao;
  }

  //---------------------------------------------------------------------------------
  public String relatorioSalasPorTurma() {
    String descricao = relatorioResumoEnsalamento() + "\n\n";

    for (int k=0; k < ensalamento.size(); k++) {
      descricao += ensalamento.get(k).turma.getDescricao() + "\n" +
      "Sala: " + ensalamento.get(k).sala.getDescricao() + "\n\n";
    }

    for (int i=0; i < turmas.size(); i++) {
      if (turmaAlocada(turmas.get(i)) == false) {
        if (i == turmas.size() - 1)
          descricao += turmas.get(i).getDescricao() + "\nSala: SEM SALA";
        else
          descricao += turmas.get(i).getDescricao() + "\nSala: SEM SALA\n\n";
      }
    }
    
    return descricao;
  }

  //---------------------------------------------------------------------------------
  //Informa se uma sala passada como parametro esta na lista de ensalamento
  //Ou seja, se existe uma turma alocada nessa sala 
  public boolean salaPossuiTurma(Sala sala) {
    boolean esta = false;
    for (int j=0; j < ensalamento.size(); j++) {
      if (sala.equals(ensalamento.get(j).sala))
        esta = true;
    }

    return esta;
  }

  //---------------------------------------------------------------------------------
  //Informa se a turma foi alocada, ou seja, se a turma existe no ensalamento
  public boolean turmaAlocada(Turma turma) {
    boolean sim = false;

    for (int i=0; i < ensalamento.size(); i++) {
      if (turma.equals(ensalamento.get(i).turma)) {
        sim = true;
      }
    }

    return sim;
  }

}


