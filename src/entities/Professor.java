package entities;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    private List<Turma> turmas;

    public Professor(String nome, String cpf, List<Turma> turmas) {
        super(nome, cpf);
        this.turmas = turmas;
    }

    public void cadastrarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void adicionarAluno(Turma turma, Aluno aluno) {
        turma.getAlunos().add(aluno);
    }
    
    public void adicionarNota(Aluno aluno, Double nota) {
        aluno.getNotas().add(nota);
    }

    public void getTurmas() {
        for (Turma turma : turmas) {
            System.out.println(turma.getNome() + ", Professor: " + getNome());
        }
    }

}
