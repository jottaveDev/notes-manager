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

    public void adicionarNota(Aluno aluno, Double nota) {
        notas.computeIfAbsent(aluno, k -> new ArrayList<>()).add(nota);
    }

    public Map<Aluno, List<Double>> getNotas() {
        return notas;
    }

    public List<Double> getNotasAluno(Aluno aluno) {
        return notas.get(aluno);
    }

    public void imprimirNotasAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
    }

    public void imprimirNotasAluno(Aluno aluno) {
        List<Double> notasDoAluno = getNotasAluno(aluno);

        if (notasDoAluno != null) {
            System.out.println("Aluno " + aluno.getNome() + ": " + notasDoAluno);
        } else {
            System.out.println("O aluno " + aluno.getNome() + " não tem notas");
        }
    }

}
