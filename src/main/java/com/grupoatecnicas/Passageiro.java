package com.grupoatecnicas;

public class Passageiro{
    private String cpf,nome,nCartao;
    private FormaPagto pgto;
    private int pontuacao;
    public Passageiro(String cpf, String nome, String nCartao, FormaPagto pgto, int pontuacao){
        this.cpf = cpf;
        this.nome = nome;
        this.nCartao = nCartao;
        this.pgto = pgto;
        this.pontuacao = pontuacao;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCartao(){
        return nCartao;
    }

    public FormaPagto getFormaPgto(){
        return pgto;
    }

    public int getpontuacao(){
        return pontuacao;
    }

    public void infoPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public String toString(){
        return "Nome: "+nome+"\nCPF: "+cpf+"\nNumero do Cartao: "+nCartao+"\nForma de pagamento: "+pgto+"\nPontuação: "+pontuacao;
    }
}