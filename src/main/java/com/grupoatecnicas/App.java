package com.grupoatecnicas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class App {
    public static void main(String args[]){
        Passageiro p = new Passageiro("85820571053","Demóstenes","123456789",FormaPagto.DINHEIRO,10);
        System.out.println(p);
    }
}