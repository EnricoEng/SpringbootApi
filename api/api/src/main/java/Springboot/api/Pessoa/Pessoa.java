package Springboot.api.Pessoa;


import java.util.Date;

public class Pessoa {
    private Long id;
    private String nome;
    private Date dataNascimento;
    private Endereco endereco;


     
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
