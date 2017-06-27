package org.umg.curso.clase1;

/**
 * Created by alumno on 26/06/2017.
 */
public class Cliente {
    private String nombre;
    private int edad;
    private double salario;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, double salario, double bonificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario + bonificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
