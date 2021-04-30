package service;

import entity.Automotor;

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
        Automotor automotor = new Automotor(1, "Toyota", 2000, 2600);
        automotor.calcularValorMatricula();

        Automotor automotor1 = new Automotor(2, "Mazda", 2010, 30000);
        automotor1.calcularValorMatricula();    
        
        System.out.println(automotor + "\n" + automotor1);
    }

}
