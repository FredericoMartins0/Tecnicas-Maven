package com.grupoatecnicas;

public class Carro {

    private String placa;
    private String marca;
    private String cor;
    private CategoriaVeiculo cat; 

    public Carro(String placa,String marca,String cor,CategoriaVeiculo cat){
        this.placa = placa;
        this.marca = marca;
        this.cor   = cor;
        this.cat   = cat;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public CategoriaVeiculo getCategoria(){
        return cat;
    }

    @Override
    public String toString() {
        return "Carro{" + "Placa='" + placa + '\'' + ", Marca='" + marca +", Cor='" 
        + cor +", Categoria =" + cat + '\'' + '}';
    }
}