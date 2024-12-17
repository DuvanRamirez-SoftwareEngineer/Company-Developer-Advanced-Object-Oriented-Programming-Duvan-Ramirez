/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nit;
    private String nombre;
    private String direccion;
    private String ciudad;
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public int contarEmpleados() {
        return empleados.size();
    }

    @Override
    public String toString() {
        return "NIT: " + nit +
               ", Nombre: " + nombre +
               ", Dirección: " + direccion +
               ", Ciudad: " + ciudad;
    }

    // ... (resto del código de la clase Empresa, si es necesario)
}
