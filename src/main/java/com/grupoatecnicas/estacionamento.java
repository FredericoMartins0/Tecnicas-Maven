package com.grupoatecnicas;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class estacionamento {//Carrega Veiculo e persiste veiculo
   
    private Carro carro;
    private ArrayList<Carro> listCarro;
    private String placa;
    private String marca;
    private String cor;
    private String tipo;

    public estacionamento(){
        listCarro = new ArrayList<Carro>();
    }

  
    public ArrayList<Carro> carregaVeiculo(){
        
        try{
            FileReader arquivo = new FileReader("veiculos.csv");
            BufferedReader lerArq = new BufferedReader(arquivo); 
            int i = 0;
            String linha = "";
            while((linha = lerArq.readLine()) != null){
                String placa, marca, cor, cat;
                String[] cars = linha.split(",");
                placa = cars[0];
	            marca = cars[1];
	            cor = cars[2];
	            cat = cars[3];

                //preencher os valores da lista de carros
                if(cat.equals("LUXO"))
                    carro = new Carro(placa, marca, cor, CategoriaVeiculo.LUXO);
                else if(cat.equals("SIMPLES"))
                    carro = new Carro(placa, marca, cor, CategoriaVeiculo.LUXO);
                else if(cat.equals("NORMAL"))
                    carro = new Carro(placa, marca, cor, CategoriaVeiculo.LUXO);

                listCarro.add(carro);
            }
            arquivo.close();
        }

        catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
              e.getMessage());
        }
	return listCarro;
    }

    public boolean persisteVeiculo(ArrayList<Carro> list){
        return list.isEmpty();
    }
}