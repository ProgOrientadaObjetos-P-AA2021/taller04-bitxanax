/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author bitxanax
 */
public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void calcularValorCheque(double valor) {
        this.valorCheque = valorCheque;
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    public void calcularComisionBanco() {
        this.comisionBanco = valorCheque * 0.003;
    }

    @Override
    public String toString() {
        return String.format("Nombre Cliente: %s \nNombre Banco: %s\nValor Cheque: %.2f \nComision Banco: %.2f \n", nombreCliente, nombreBanco, valorCheque, comisionBanco);
    }
}
