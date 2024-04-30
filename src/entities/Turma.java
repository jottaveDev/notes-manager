package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Turma {

    private String nome;
    private List<Aluno> alunos;
    private Map<Aluno, List<Double>> notas;

    public Turma(String nome, List<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
        this.notas = new HashMap<>();
    }

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.notas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void imprimirNotasAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
    }

    public void imprimirNotasAluno(Aluno aluno) {
        if (aluno.getNotas() != null) {
            System.out.println("Aluno " + aluno.getNome() + ": " + aluno.getNotas());
        } else {
            System.out.println("O aluno " + aluno.getNome() + " não tem notas");
        }
    }

}
