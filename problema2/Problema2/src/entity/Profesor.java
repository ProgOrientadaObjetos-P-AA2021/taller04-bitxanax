package entity;


public class Profesor {
    long id;
    String nombre;
    String apellido;
    double sueldoBasico;
    double sueldoTotal;

    public Profesor(long id, String nombre, String apellido, double sueldoBasico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }
    
    @Override
    public String toString() {
        return String.format("Cédula: %d \nNombre: %s \nApellido: %s \nSueldo Básico: %.2f \nSueldo Total: %.2f", id, nombre, apellido, sueldoBasico, sueldoTotal);
    }
}
