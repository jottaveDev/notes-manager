
package entities;

public class Pessoa {
    private int id;
    private final String nome;
    private final String cpf;
    private String dateBirth;
    private String contact;
    
    public Pessoa (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
}
