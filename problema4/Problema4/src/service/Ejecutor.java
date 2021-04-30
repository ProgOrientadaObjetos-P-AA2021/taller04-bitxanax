package service;

import entity.Cheque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bitxanax
 */
public class Ejecutor {

    public static void main(String[] args) {
        
        Cheque cheque = new Cheque("Jordi", "Banco de Loja", 20000);
        cheque.calcularComisionBanco();
        
        Cheque cheque1 = new Cheque("Joel", "Banco Pacífica", 10000);
        cheque1.calcularComisionBanco();
        
        System.out.println(cheque + "\n" + cheque1);
    }

}
