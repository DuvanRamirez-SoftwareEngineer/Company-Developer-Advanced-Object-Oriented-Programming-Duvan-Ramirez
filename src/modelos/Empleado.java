/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

public class Empleado {
    private String documento;
    private String nombre;
    private float sueldoHora;

    public Empleado() {
    }

    public Empleado(String documento, String nombre, float sueldoHora) {
        this.documento = documento;
        this.nombre = nombre;
        this.sueldoHora = sueldoHora;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(float sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    @Override
    public String toString() {
        return "Documento: " + documento +
               ", Nombre: " + nombre +
               ", Sueldo por Hora: " + sueldoHora;
    }
}
