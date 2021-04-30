/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entity.Estudiante;
/**
 *
 * @author bitxanax
 */
public class Executor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Sebastian", 7, 8, 9);
        estudiante.calcularPromedio();
        
        System.out.println(estudiante.toString());
    }
    
}
