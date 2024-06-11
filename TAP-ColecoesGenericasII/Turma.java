import java.util.*;

public class Turma {
	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();

	Turma() {
		this("Algoritmos e Estruturas de Dados I", "Edleno Silva", 60, true);
		addHorario(1);
		addHorario(15);
		addHorario(29);
	}

	Turma(String nome, String professor, int numAlunos, boolean acessivel) {
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
	}

	public void addHorario(int horario) {
		this.horarios.add(horario);
	}

	public String getHorariosString() {
		int horariosTam = horarios.size();
		String[] horariosStringVec = new String[horariosTam];
		String horariosString = "";

		for (int i=0; i<horariosTam; i++) {
			if (horarios.get(i) == 1) horariosStringVec[i] = "segunda 8hs";
			if (horarios.get(i) == 2) horariosStringVec[i] = "segunda 10hs";
			if (horarios.get(i) == 3) horariosStringVec[i] = "segunda 12hs";
			if (horarios.get(i) == 4) horariosStringVec[i] = "segunda 14hs";
			if (horarios.get(i) == 5) horariosStringVec[i] = "segunda 16hs";
			if (horarios.get(i) == 6) horariosStringVec[i] = "segunda 18hs";
			if (horarios.get(i) == 7) horariosStringVec[i] = "segunda 20hs";

			if (horarios.get(i) == 8) horariosStringVec[i] = "terça 8hs";
			if (horarios.get(i) == 9) horariosStringVec[i] = "terça 10hs";
			if (horarios.get(i) == 10) horariosStringVec[i] = "terça 12hs";
			if (horarios.get(i) == 11) horariosStringVec[i] = "terça 14hs";
			if (horarios.get(i) == 12) horariosStringVec[i] = "terça 16hs";
			if (horarios.get(i) == 13) horariosStringVec[i] = "terça 18hs";
			if (horarios.get(i) == 14) horariosStringVec[i] = "terça 20hs";

			if (horarios.get(i) == 15) horariosStringVec[i] = "quarta 8hs";
			if (horarios.get(i) == 16) horariosStringVec[i] = "quarta 10hs";
			if (horarios.get(i) == 17) horariosStringVec[i] = "quarta 12hs";
			if (horarios.get(i) == 18) horariosStringVec[i] = "quarta 14hs";
			if (horarios.get(i) == 19) horariosStringVec[i] = "quarta 16hs";
			if (horarios.get(i) == 20) horariosStringVec[i] = "quarta 18hs";
			if (horarios.get(i) == 21) horariosStringVec[i] = "quarta 20hs";

			if (horarios.get(i) == 22) horariosStringVec[i] = "quinta 8hs";
			if (horarios.get(i) == 23) horariosStringVec[i] = "quinta 10hs";
			if (horarios.get(i) == 24) horariosStringVec[i] = "quinta 12hs";
			if (horarios.get(i) == 25) horariosStringVec[i] = "quinta 14hs";
			if (horarios.get(i) == 26) horariosStringVec[i] = "quinta 16hs";
			if (horarios.get(i) == 27) horariosStringVec[i] = "quinta 18hs";
			if (horarios.get(i) == 28) horariosStringVec[i] = "quinta 20hs";

			if (horarios.get(i) == 29) horariosStringVec[i] = "sexta 8hs";
			if (horarios.get(i) == 30) horariosStringVec[i] = "sexta 10hs";
			if (horarios.get(i) == 31) horariosStringVec[i] = "sexta 12hs";
			if (horarios.get(i) == 32) horariosStringVec[i] = "sexta 14hs";
			if (horarios.get(i) == 33) horariosStringVec[i] = "sexta 16hs";
			if (horarios.get(i) == 34) horariosStringVec[i] = "sexta 18hs";
			if (horarios.get(i) == 35) horariosStringVec[i] = "sexta 20hs";
		}

		for (int i=0; i<horariosTam; i++) {
			if (i == horariosTam-1)
			horariosString += horariosStringVec[i];
			else
			horariosString += horariosStringVec[i] + ", ";
		}

		return horariosString;
	}

	public String getDescricao() {
		String todosHorarios = getHorariosString();

		if (acessivel == true)
			return "Turma: " + nome + "\n" + 
			"Professor: " + professor + "\n" + 
			"Número de Alunos: " + numAlunos + "\n" +
			"Horário: " + todosHorarios + "\n" +
			"Acessível: sim";
		else
			return "Turma: " + nome + "\n" + 
			"Professor: " + professor + "\n" + 
			"Número de Alunos: " + numAlunos + "\n" +
			"Horário: " + todosHorarios + "\n" +
			"Acessível: não";
	}

	@Override
	public boolean equals(Object object) {
		Turma turma = (Turma) object;
		boolean iguais = true;

		if (this.horarios.size() != turma.horarios.size()) iguais = false;
		else {
			for (int i=0; i < this.horarios.size(); i++) {
				if (this.horarios.get(i) != turma.horarios.get(i)) iguais = false;
			}
		}

		return iguais;
	}
}
