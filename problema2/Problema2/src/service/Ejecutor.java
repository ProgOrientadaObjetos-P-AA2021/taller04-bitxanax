/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Profesor;

/**
 *
 * @author bitxanax
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Profesor profesor = new Profesor(1, "Sebastian", "Romero", 1400);
        profesor.calcularSueldoTotal();

        Profesor profesor1 = new Profesor(2, "Joel", "Romero", 1400);
        profesor1.calcularSueldoTotal();

        System.out.println(profesor + "\n\n" + profesor1);
    }

}
