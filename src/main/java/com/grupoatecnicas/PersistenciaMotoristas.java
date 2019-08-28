package com.grupoatecnicas;

import java.util.ArrayList;

public class PersistenciaMotoristas{
    private ArrayList<Motorista> listMotora;
    public PersistenciaMotoristas(){
        listMotora = new ArrayList<>();
    }

    public ArrayList<Motorista> carregaMotorista(){
        return listMotora;
    }

    public boolean persisteMotorista(ArrayList<Motorista> lst){
        return lst.isEmpty();
    }
}