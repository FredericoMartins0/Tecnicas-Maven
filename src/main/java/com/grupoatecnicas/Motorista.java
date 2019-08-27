package com.grupoatecnicas;

public class Motorista{
    private String cpf,nome;
    private Carro car;
    private FormaPagto[] pgto;
    private int pontuacao;

    Motorista(String cpf, String nome, Carro car, int pontuacao){
        this.cpf = cpf;
        this.nome = nome;
        this.car = car;
        this.pontuacao = pontuacao;
        pgto = new FormaPagto[3];
        addPgto();
    }

    private void addPgto(){
        pgto[0] = DINHEIRO;
        pgto[1] = CARTAO;
        pgto[2] = TODAS;
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
    
}