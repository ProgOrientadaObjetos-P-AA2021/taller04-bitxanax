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
public class Automotor {

    private long id;
    private String marca;
    private int year;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(long id, String marca, int year, double valorVehiculo) {
        this.id = id;
        this.marca = marca;
        this.year = year;
        this.valorVehiculo = valorVehiculo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        this.valorMatricula = (valorVehiculo * 0.002) * year;
    }

    @Override
    public String toString() {
        return String.format("ID: %d \nMarca: %s\nAño: %s \nValor Vehiculo: %.2f \nValor Matrícula: %.2f \n", id, marca, year, valorVehiculo, valorMatricula);
    }

}
