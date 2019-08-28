package com.grupoatecnicas;

import java.util.ArrayList;

public class PersistenciaPassageiros{
    private ArrayList<Passageiro> listPassageiro;
    public PersistenciaPassageiros(){
        listPassageiro = new ArrayList<>();
    }

    public ArrayList<Passageiro> carregaPassageiro(){
        return listPassageiro;
    }

    public boolean persistePassageiro(ArrayList<Motorista> lst){
        return lst.isEmpty();
    }
}