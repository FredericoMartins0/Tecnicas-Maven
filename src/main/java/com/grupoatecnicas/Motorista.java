package com.grupoatecnicas;

public class Motorista{
    private String cpf,nome;
    private Carro car;
    private FormaPagto[] pgto;
    private int pontuacao;

    public Motorista(String cpf, String nome, Carro car, int pontuacao){
        this.cpf = cpf;
        this.nome = nome;
        this.car = car;
        this.pontuacao = pontuacao;
        pgto = new FormaPagto[3];
        addPgto();
    }

    private void addPgto(){
        pgto[0] = FormaPagto.DINHEIRO;
        pgto[1] = FormaPagto.CARTAO;
        pgto[2] = FormaPagto.TODAS;
    }

    public String getCPF(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public FormaPagto[] getPagto(){
        return pgto;
    }

    public int getPontuacao(){
        return pontuacao;
    }

    public void infoPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public String toString(){
        return "Nome: "+nome+"\nCPF: "+cpf+"\nVeículo: "+car+"\nPontuação: "+pontuacao+"\nFormas de pagamento: "+pgto[0]+", "+pgto[1]+", "+pgto[2];
    }
    
}