package Banco;

public class Cliente {
    private String nome;
    private String sobrenome;
    private Conta conta;


    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // vai mandar a variavel dessa classe para o main;
    public String getNome(){
        return this.nome;
    }

    // vai definir a variavel dessa classe;
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.nome = sobrenome;
    }

    public Conta getConta(){
        return this.conta;
    }

    public void setConta(Conta conta){
        this.conta = conta;
    }



}
