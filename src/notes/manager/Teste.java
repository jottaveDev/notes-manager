package notes.manager;

import entities.Aluno;
import entities.Professor;
import entities.Turma;
import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        Professor professor = new Professor("Pedro", "111111111", new ArrayList<>());
        Turma turma = new Turma("1 ano");
        
        Aluno aluno1 = new Aluno("Joao", "00000000", "0000");
        Aluno aluno2 = new Aluno("Maria", "00000000", "0000");
        Aluno aluno3 = new Aluno("Ana", "00000000", "0000");

        professor.cadastrarTurma(turma);

        professor.adicionarAluno(turma, aluno1);
        professor.adicionarAluno(turma, aluno2);
        professor.adicionarAluno(turma, aluno3);
        
        professor.getTurmas();
        turma.getAlunos();
        
        professor.adicionarNota(aluno2, 4.0);
        professor.adicionarNota(aluno2, 2.5);
        
        professor.adicionarNota(aluno3, 3.40);
        professor.adicionarNota(aluno3, 2.10);
        professor.adicionarNota(aluno3, 1.80);
        
        turma.imprimirNotasAlunos();
    }

}
