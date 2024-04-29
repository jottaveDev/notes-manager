package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno extends Pessoa {

    private String matricula;

    private List<Double> notas = new ArrayList<Double>();

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(Double nota) {
        this.notas.add(nota);
    }

    public String getNome() {
        return super.getNome();
    }

    public String toString() {
        return "Nome: " + getNome() + ", Notas: " + getNotas();
    }

}
